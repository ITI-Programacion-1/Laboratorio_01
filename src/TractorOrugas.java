public class TractorOrugas extends Tractor {
    public TractorOrugas(String tipo, int hp, int orugas, String traccion, String distribucion) {
        super(tipo, hp, 0, orugas, traccion, distribucion);
    }

    @Override
    public void mostrarLocomocion() {
        System.out.println("Utiliza " + getOrugas() + " orugas con traccion " + getTraccion() + " , distribucion: " + getDistribucion());
    }
}
