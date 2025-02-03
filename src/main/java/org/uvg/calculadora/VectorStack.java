package org.uvg.calculadora;
import java.util.Vector;

/**
 * Implementación de una pila usando Vector.
 * @param <T> Tipo de dato que manejará la pila.
 */
public class VectorStack<T> implements Stack<T> {
    private Vector<T> stack;

    public VectorStack() {
        stack = new Vector<>();
    }

    public void push(T item) { stack.add(item); }

    public T pop() { return stack.isEmpty() ? null : stack.remove(stack.size() - 1); }

    public T peek() { return stack.isEmpty() ? null : stack.lastElement(); }

    public boolean isEmpty() { return stack.isEmpty(); }

    public int size() { return stack.size(); }
}
