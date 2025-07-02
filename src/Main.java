public class Main {
    public static void main(String[] args) {
        ListaDoble tractores = new ListaDoble();

        Tractor t1 = new TractorRuedas("Pequeño", 60, 4, "4x2", "frontal");
        t1.agregarAcople(new clsAcople("Pala", false, "Excavación"));

        Tractor t2 = new TractorOrugas("Mediano", 100, 2, "orugas", "lateral");
        t2.agregarAcople(new clsAcople("Martillo", true, "Demolición"));

        Tractor t3 = new TractorMixto("Grande", 200, 4, 2, "4x4", "lateral");
        t3.agregarAcople(new clsAcople("Remolque", false, "Transporte"));
        t3.agregarAcople(new clsAcople("Grúa", false, "Carga"));

        Tractor t4 = new TractorRuedas("Mediano", 85, 6, "4x4", "frontal");
        Tractor t5 = new TractorOrugas("Grande", 140, 4, "orugas", "lateral");

        tractores.agregar(t1);
        tractores.agregar(t2);
        tractores.agregar(t3);
        tractores.agregar(t4);
        tractores.agregar(t5);

        System.out.println("=== Impresion desde el inicio ===");
        tractores.imprimirDesdeElInicio();

        System.out.println("\n=== Impresion desde el final ===");
        tractores.imprimirDesdeElFinal();

        System.out.println("\n=== Busqueda por tipo: Mediano ===");
        tractores.buscarPorTipo("Mediano");

        System.out.println("\n=== Busqueda por caballos de fuerza: 50 a 120 ===");
        tractores.buscarPorCaballosDeFuerza(50, 120);

        System.out.println("\n=== Busqueda pot tipo de locomocion : ruedas ===");
        tractores.buscarPorLocomocion("ruedas");
    }
}
