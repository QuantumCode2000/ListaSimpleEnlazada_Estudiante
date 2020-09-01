public class Nodo
{ // Campos
    Estudiante dato;
    Nodo sig;
    // Constructor por defecto
    public Nodo()
    {  dato=null;
        sig=null;
    }
    // Constructor ordinario
    public Nodo (Estudiante vd)
    {  dato= vd;
        sig=null;
    }
}
