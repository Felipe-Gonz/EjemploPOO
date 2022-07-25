public class Computadora {

    private String marca;
    private double precio;
    private int cantidad;
    private String caracteristica;

    public Computadora() {
    }

    public Computadora(String marca, double precio, int cantidad, String caracteristica) {
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
        this.caracteristica = caracteristica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
}
