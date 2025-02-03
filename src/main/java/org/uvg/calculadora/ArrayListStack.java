package org.uvg.calculadora;
import java.util.ArrayList;

/**
 * Implementación de una pila usando ArrayList.
 * @param <T> Tipo de dato que manejará la pila.
 */
public class ArrayListStack<T> implements Stack<T> {
    private ArrayList<T> stack;

    public ArrayListStack() {
        stack = new ArrayList<>();
    }

    public void push(T item) { stack.add(item); }

    public T pop() { return stack.isEmpty() ? null : stack.remove(stack.size() - 1); }

    public T peek() { return stack.isEmpty() ? null : stack.get(stack.size() - 1); }

    public boolean isEmpty() { return stack.isEmpty(); }

    public int size() { return stack.size(); }
}