public class Tienda {

    private String tienda;
    private String ubicacion;
    private int cantEmpleados;

    public Tienda() {
    }

    public Tienda(String tienda, String ubicacion, int cantEmpleados) {
        this.tienda = tienda;
        this.ubicacion = ubicacion;
        this.cantEmpleados = cantEmpleados;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }
}
