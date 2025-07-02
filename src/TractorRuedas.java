public class TractorRuedas extends Tractor {
    public TractorRuedas(String tipo, int hp, int ruedas, String traccion, String distribucion) {
        super(tipo, hp, ruedas, 0, traccion, distribucion);
    }

    @Override
    public void mostrarLocomocion() {
        System.out.println("Utiliza " + getRuedas() + " ruedas con traccion " + getTraccion() + " , distribucion: " + getDistribucion());
    }
}

