package pilas;

import java.util.EmptyStackException;

public class TestStack {
    public static void main(String[] args) {
        TDAStack<String> stack = new Stack<>();

        try {
            System.out.println("El tope de la pila es: " + stack.top());
        } catch (EmptyStackException e) {
            System.out.println("La pila es vacia");
        }

        stack.push("Azul");
        stack.push("Morado");
        stack.push("Rojo");
        stack.push("Verde");

        stack.show();
        System.out.println("pop ------------");
        stack.pop();

        stack.show();
        
        System.out.println(" --------------------");
        stack.clear();
        stack.show();
    }
}
