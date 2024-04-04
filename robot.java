public class robot {
    // Atributos
    private String nombre;
    private String tipo;
    private double peso;
    private int bateria;

    // Constructor
    public robot() {
        this.nombre = "Robi";
        this.tipo = "Android";
        this.peso = 50;
        this.bateria = 100;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public int getBateria() {
        return bateria;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    // Otros métodos
    public void caminar() {
        System.out.println("El robot está caminando.");
    }

    public void cargarBateria() {
        System.out.println("El robot está cargando su batería.");
    }

    public void decirHola() {
        System.out.println("Hola, ¡soy el robot " + this.nombre + "!");
    }
}
