public class BilleteraParque {
    private int tickets;
    private static boolean festivo = false;

    public BilleteraParque() {
        this.tickets = 0;
    }

    public BilleteraParque(int tickets) {
        this.tickets = tickets;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        if (tickets >= 0) {
            this.tickets = tickets;
        }
    }

    // 👇 Nuevo método compatible con el Main
    public void establecerTickets(int tickets) {
        setTickets(tickets);
    }

    public static boolean isFestivo() {
        return festivo;
    }

    public static void cambiarFestivo() {
        festivo = !festivo;
    }

    public void agregarTickets(int tickets) {
        this.tickets += tickets;
    }

    public boolean removerTickets(int tickets) {
        if (tickets > 0 && this.tickets >= tickets) {
            this.tickets -= tickets;
            return true;
        } else {
            return false;
        }
    }

    public boolean comprarPremio(Premio premio) {
    
    int precio = premio.getPrecioActual(festivo);

    if (this.tickets >= precio) {
        this.tickets -= precio;
        System.out.println(" Has comprado un(a) " + premio.getNombre() + 
                           " por " + precio + " tickets.");
        System.out.println("Tickets restantes: " + this.tickets);
        return true;
    } else {
        System.out.println(" No tienes suficientes tickets para este premio.");
        return false;
    }
}

}
