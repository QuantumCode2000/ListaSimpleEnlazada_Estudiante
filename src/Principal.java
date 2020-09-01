public class Principal {
    public static void main(String[] args) {

        Operaciones op=new Operaciones();
        Lista lis=new Lista();
        op.insertarN(lis);
        op.mostrar(lis);
        System.out.println("INGRESA LA CARRERA : ");
        String carrera = Leer.dato();
        op.porCarrera(lis,carrera);
        int menor = op.botarMenor(lis);
        op.aporAnioMasAntiguo(lis,menor);
    }
}
