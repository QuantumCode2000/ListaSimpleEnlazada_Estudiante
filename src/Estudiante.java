class Estudiante {
    String ci,nombre,carrera;
    int anioIngreso;
    public Estudiante()
    {ci = null ; nombre = null ; carrera = null;}
    public void leer()
    {	System.out.print("ci=");
        ci=Leer.dato();
        System.out.print("nombre=");
        nombre=Leer.dato();
        System.out.print("carrera=");
        carrera=Leer.dato();
        System.out.print("anioIngreso=");
        anioIngreso=Leer.datoInt();
    }
    public void mostrar ()
    { System.out.print("ci="+ci+ "\n nombre="+nombre +"\n carrera="+carrera+"\n anio Ingreso="+anioIngreso); }
}
