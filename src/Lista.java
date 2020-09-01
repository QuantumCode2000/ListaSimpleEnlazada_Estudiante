public class Lista
{ // Campos
    Nodo primero;
    // Constructor por defecto
    public Lista()
    {  primero=null; }
    // Inicializar
    public void inicializar ()
    {  primero=null; }
    //Verificar si lista es vacía
    public boolean listaVacia()
    {  return primero==null; }
    // Insertar al principio de la lista
    public void insertar(Estudiante x)
    { // Crear el nuevo nodo
        Nodo nuevo=new Nodo(x);
// Conectar el nuevo nodo a la lista
        nuevo.sig=primero;
        primero=nuevo;
    }
    // Eliminar el primer nodo
    public void eliminar()
    {
        if(!listaVacia()) { // Lista no vacía
            primero=primero.sig;
        }
    }
}
