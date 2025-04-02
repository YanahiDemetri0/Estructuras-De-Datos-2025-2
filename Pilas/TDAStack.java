package pilas;

import java.util.EmptyStackException;

/**
 * Definir las operaciones de un Stack
 * @since EDD 2025-2
 */
public interface TDAStack<T> {
    
    /**
     * Agregar un elemento en el tope de la pila
     * @param e elemento a insertar
     */
    public void push(T e);

    /**
     * Elimina y regresa el elemento que se encuentra en el tope de la pila 
     * @return e el elemto en el tope
     * @throws EmptyStackException en caso de que la pila sea vacia
     */
    public T pop() throws EmptyStackException;

    /**
     * Regresa el elemento en el tope de la pila
     * @return elemento en el tope
     * @throws EmptyStackException;
     */
    public T top() throws EmptyStackException;

    /**
     * Verifica si una pila es vacia
     * @return boolean, true en caso de que sea vacía
     */
    public boolean isEmpty();

    /**
     * Metodo para vaciar una pila
     */
    public void clear();

    /**
     * Metodo para mostrar una pila
     */
    public void show();
}
