
import java.util.NoSuchElementException;

/**
 * Definir las operaciones que va a realizar una cola
 * @since EDD 2025-2
 */
public interface TDAQueue<T> {

    /**
     * Agregar un nuevo elemento al final de la cola
     * 
     * @param e elemento por agregar
     */
    public void enqueue(T e);

    /**
     * Elimina y regresa el primer elemento de la cola
     * @throws NoSuchElementException si la cola es vacía
     */
    public T dequeue() throws NoSuchElementException;

    /**
     * Devuelve el elemento inicial en la cola sin borrarlo
     * 
     * @return e elemento siguiente en la cola
     * @throws NoSuchElementException si la cola esta vacia
     */
    public T first() throws NoSuchElementException;

    /**
     * Verificar si una cola es vacia
     * 
     * @return booleano, true si la cola es vacia
     */
    public boolean isEmpty();

    /**
     * Elimina todos los elementos en la cola.
     */
    public void clear();

    /**MOstrar los elementos en una pila */
    public void show();

    
}
