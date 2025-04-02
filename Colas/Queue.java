
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<T> implements TDAQueue<T> {
    /* Lista de apoyo*/
    private ArrayList<T>  lista = new ArrayList<>();
    
    /**
     * Agregar un nuevo elemento al final de la cola
     * 
     * @param e elemento por agregar
     */
    @Override
    public void enqueue(T e){
        lista.add(lista.size(), e);
    }

    /**
     * Elimina y regresa el primer elemento de la cola
     * @throws NoSuchElementException si la cola es vacía
     */
    @Override

    public T dequeue() throws NoSuchElementException{
        if(lista.isEmpty())
            throw new NoSuchElementException();
        return lista.remove(0);
    }

    /**
     * Devuelve el elemento inicial en la cola sin borrarlo
     * 
     * @return e elemento siguiente en la cola
     * @throws NoSuchElementException si la cola esta vacia
     */
    @Override
    public T first() throws NoSuchElementException{
        if(lista.isEmpty())
            throw new NoSuchElementException();
        return lista.get(0);
    }

    /**
     * Verificar si una cola es vacia
     * 
     * @return booleano, true si la cola es vacia
     */
    @Override

    public boolean isEmpty(){
        return lista.isEmpty();
    }

    /**
     * Elimina todos los elementos en la cola.
     */
    @Override

    public void clear(){
        lista.clear();
    }

    public void show(){
        Iterator<T> iterator = lista.iterator();
        while (iterator.hasNext()) {
           System.out.println(iterator.next());
        }
    }
}
