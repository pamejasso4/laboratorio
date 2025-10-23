public class Premio {
  
    private String nombre;
    private int precioBase;

    public Premio(String nombre, int precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public int getPrecioActual(boolean esFestivo) {
        
        if (esFestivo) {
            return precioBase / 2;
        }
        return precioBase;
    }
}


