public class Imprimir {

    public static void main (String[] args){

        Computadora computadora = new Computadora();
        Tienda tienda = new Tienda();

        computadora.setMarca("Lenovo");
        computadora.setCantidad(150);
        computadora.setCaracteristica("Thinkpad de Office");
        computadora.setPrecio(1000.01);
        tienda.setTienda("Pajarito");
        tienda.setCantEmpleados(10);
        tienda.setUbicacion("San Salvador, San Salvador");
        Computadora compu = new Computadora("HP", 1502.99, 15, "Gamer");

        System.out.println("La tienda " + tienda.getTienda() + " tiene " + tienda.getCantEmpleados() + " empleados, trabajando en la zona de " + tienda.getUbicacion());
        System.out.println("Se vende una computadora " + computadora.getMarca() + " con caracteristicas " + computadora.getCaracteristica() + ", hay al menos " + computadora.getCantidad() + ", costando alrededor de $" + computadora.getPrecio());
        System.out.println(compu.getMarca() + compu.getPrecio() + compu.getCaracteristica() + compu.getCantidad());
    }
}
