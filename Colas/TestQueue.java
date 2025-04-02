
import java.util.NoSuchElementException;

public class TestQueue {
    public static void main(String[] args) {
        TDAQueue<String> queue = new Queue<>();

        try{
            System.out.println("El tope es: " + queue.first());
        }catch (NoSuchElementException e){
            System.out.println("La cola esta vacia");
        }

        queue.enqueue("Perro");
        queue.enqueue("gato");
        queue.enqueue("Pez");
        queue.enqueue("Caballo");

        queue.show();
        System.out.println("----------------------");
        queue.dequeue();
        queue.show();

        System.out.println("----------------------");
        queue.clear();
        queue.show();



    }
}
