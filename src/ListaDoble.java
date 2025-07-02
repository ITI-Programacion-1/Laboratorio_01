public class ListaDoble {
    private Nodo cabeza;
    private Nodo cola;

    public void agregar(Tractor tractor) {
        Nodo nuevo = new Nodo(tractor);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public void imprimirDesdeElInicio() {
        Nodo actual = cabeza;
        while (actual != null) {
            imprimirTractor(actual.tractor);
            actual = actual.siguiente;
        }
    }

    public void imprimirDesdeElFinal() {
        Nodo actual = cola;
        while (actual != null) {
            imprimirTractor(actual.tractor);
            actual = actual.anterior;
        }
    }

    private void imprimirTractor(Tractor t) {
        System.out.println("\nTipo: " + t.getTipo());
        System.out.println("Caballos de fuerza: " + t.getCaballosFuerza());
        t.mostrarLocomocion();
        if (!t.getAcoples().isEmpty()) {
            System.out.println("Acoples:");
            for (clsAcople a : t.getAcoples()) {
                System.out.println(a);
            }
        } else {
            System.out.println("Sin acoples");
        }
    }

    public void buscarPorTipo(String tipo) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.tractor.getTipo().equalsIgnoreCase(tipo)) {
                imprimirTractor(actual.tractor);
            }
            actual = actual.siguiente;
        }
    }

    public void buscarPorCaballosDeFuerza(int min, int max) {
        Nodo actual = cabeza;
        while (actual != null) {
            int hp = actual.tractor.getCaballosFuerza();
            if (hp >= min && hp <= max) {
                imprimirTractor(actual.tractor);
            }
            actual = actual.siguiente;
        }
    }

    public void buscarPorLocomocion(String tipoLocomocion) {
        Nodo actual = cabeza;
        while (actual != null) {
            String locomocion = actual.tractor.getClass().getSimpleName();
            if (locomocion.toLowerCase().contains(tipoLocomocion.toLowerCase())) {
                imprimirTractor(actual.tractor);
            }
            actual = actual.siguiente;
        }
    }
}
