public class galleta {

    private String sabor;
    private String tamaño;
    private double precio;
    private int cantidad;

    public galleta() {
        this.sabor = "Chocolate";
        this.tamaño = "Grande";
        this.precio = 2.50;
        this.cantidad = 10;
    }

    public String getSabor() {
        return sabor;
    }

    public String getTamaño() {
        return tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void hornear() {
        System.out.println("La galleta está horneada y lista para comer");
    }

    public void empaquetar() {
        System.out.println("La galleta fue empacada");
    }

    public void vender() {
        System.out.println("Se vendio la galleta");
    }
}
