import java.util.Scanner;


 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BilleteraParque billetera = new BilleteraParque(100);

        // Crear los premios
    Premio camiseta = new Premio("Camiseta", 150);
    Premio sombrero = new Premio("Sombrero para el sol", 350);
    Premio tenis = new Premio("Tenis", 600);

    int opcion;

    do {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Agregar tickets");
        System.out.println("2. Establecer tickets");
        System.out.println("3. Comprar premio");
        System.out.println("4. Establecer festivo (actual: " + (BilleteraParque.isFestivo() ? "Sí" : "No") + ")");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la cantidad de tickets a agregar: ");
                int cantidad = sc.nextInt();
                billetera.agregarTickets(cantidad);
                System.out.println("Tickets actuales: " + billetera.getTickets());
                break;

            case 2:
                System.out.print("Ingrese el número de tickets a establecer: ");
                int nuevosTickets = sc.nextInt();
                billetera.establecerTickets(nuevosTickets);
                System.out.println("Tickets establecidos en: " + billetera.getTickets());
                break;

            case 3:
                System.out.println("\nPremios disponibles:");
                System.out.println("1. " + camiseta.getNombre() + " (" + camiseta.getPrecioActual(BilleteraParque.isFestivo()) + " tickets)");
                System.out.println("2. " + sombrero.getNombre() + " (" + sombrero.getPrecioActual(BilleteraParque.isFestivo()) + " tickets)");
                System.out.println("3. " + tenis.getNombre() + " (" + tenis.getPrecioActual(BilleteraParque.isFestivo()) + " tickets)");
                System.out.print("Seleccione el premio que desea comprar: ");
                int premioOpcion = sc.nextInt();

                switch (premioOpcion) {
                    case 1 -> billetera.comprarPremio(camiseta);
                    case 2 -> billetera.comprarPremio(sombrero);
                    case 3 -> billetera.comprarPremio(tenis);
                    default -> System.out.println("Opción no válida.");
                    }
                    break;


            case 4:
                BilleteraParque.cambiarFestivo();
                System.out.println("El estado festivo ha cambiado. Ahora es festivo: " + (BilleteraParque.isFestivo() ? "Sí" : "No"));
                break;

            case 5:
                System.out.println("Gracias por usar el sistema.");
                break;

            default:
                System.out.println("NO ES OPCIÓN VÁLIDA.");
            }

        } while (opcion != 5);

    sc.close();
}

