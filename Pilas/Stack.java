package pilas;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * Implementacion de una pila basada en listas
 * @since EDD 2025-2
 */

public class Stack<T> implements TDAStack<T>{
    /*Lista de apoyo para operaciones */
    private ArrayList<T> lista = new ArrayList<>();


    @Override
    public void push(T e){
        lista.add(0,e);
    }

    @Override
    public T pop() throws EmptyStackException{
        //verificar si la lista es vacia
        if(lista.isEmpty())
            throw new EmptyStackException();
        return lista.remove(0);
    }

    @Override
    public T top() throws EmptyStackException{
        //verificar si la lista es vacia
        if(lista.isEmpty())
            throw new EmptyStackException();
        return lista.get(0);
    }

    @Override
    public boolean isEmpty(){
        return lista.isEmpty();
    }

    @Override
    public void clear(){
        lista.clear();
    }

    @Override
    public void show(){
        Iterator<T> iterator = lista.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    
}
