public class TractorMixto extends Tractor {
    public TractorMixto(String tipo, int hp, int ruedas, int orugas, String traccion, String distribucion) {
        super(tipo, hp, ruedas, orugas, traccion, distribucion);
    }

    @Override
    public void mostrarLocomocion() {
        System.out.println("Utiliza " + getRuedas() + " ruedas y " + getOrugas() + " orugas con traccion " + getTraccion() + " , distribuciom: " + getDistribucion());
    }
}
