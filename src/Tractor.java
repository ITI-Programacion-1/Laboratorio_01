import java.util.ArrayList;

public abstract class Tractor {
    private String tipo;
    private int caballosFuerza;
    private int ruedas;
    private int orugas;
    private String traccion;
    private String distribucion;
    private ArrayList<clsAcople> acoples;

    public Tractor(String tipo, int caballosFuerza, int ruedas, int orugas, String traccion, String distribucion) {
        this.tipo = tipo;
        this.caballosFuerza = caballosFuerza;
        this.ruedas = ruedas;
        this.orugas = orugas;
        this.traccion = traccion;
        this.distribucion = distribucion;
        this.acoples = new ArrayList<>();
    }

    public void agregarAcople(clsAcople acople) {
        acoples.add(acople);
    }

    public ArrayList<clsAcople> getAcoples() {
        return acoples;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getOrugas() {
        return orugas;
    }

    public String getTraccion() {
        return traccion;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public abstract void mostrarLocomocion();
}

