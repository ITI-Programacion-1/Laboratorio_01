public class clsAcople {
    private String nombre;
    private boolean permanente;
    private String funcion;

    public clsAcople(String nombre, boolean permanente, String funcion) {
        this.nombre = nombre;
        this.permanente = permanente;
        this.funcion = funcion;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isPermanente() {
        return permanente;
    }

    public String getFuncion() {
        return funcion;
    }

    public String toString() {
        return "- " + nombre + " | " + (permanente ? "Permanente" : "Renovable") + " | Funcion: " + funcion;
    }
}
