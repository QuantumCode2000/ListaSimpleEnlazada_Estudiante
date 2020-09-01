public class Operaciones {
    // Insertar N nodos
    public void insertarN(Lista L)
    { System.out.println("No. nodos= ");
        int nn=Leer.datoInt();
        for(int i=1;i<=nn;i++) {
            System.out.print("Dato= ");
            Estudiante d= new Estudiante();
            d.leer();
            L.insertar(d);
        }
    }
    // MOSTRAR
    public void mostrar(Lista L) {
        Nodo p=L.primero;
        while(p!=null) {
            System.out.println("Dato:  ");
            p.dato.mostrar();
            p=p.sig;
        }
    }

    //Mostrar Ci y carnet por carrera
    public void porCarrera (Lista lista, String carreraDada) {
        Nodo p = lista.primero;
        while(p!=null) {
            if(carreraDada.compareTo(p.dato.carrera)==0)
                System.out.println(" POR CARRERA \n" +
                        " ci ="+p.dato.ci+" nombre = "+p.dato.nombre);
            p=p.sig;
        }
    }

    // Por anio mas antiguo
    public int botarMenor(Lista lista) {
        Nodo p = lista.primero;
        int menor = p.dato.anioIngreso;
        while(p!=null) {
            if(p.dato.anioIngreso < menor)
                menor = p.dato.anioIngreso;
            p=p.sig;
        }
        return menor;
    }

    public void aporAnioMasAntiguo (Lista lista, int menor) {
        Nodo p = lista.primero;
        while(p!=null) {
            if(p.dato.anioIngreso == menor)
                System.out.println(" POR ANIO DE INGRESO \n" +
                        " ci ="+p.dato.ci+" nombre = "+p.dato.nombre);
            p=p.sig;
        }
    }

}


