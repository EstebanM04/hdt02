package org.uvg.calculadora;

/**
 * Interfaz genérica para una pila (Stack).
 * @param <T> Tipo de dato que manejará la pila.
 */
public interface Stack<T> {
    /**
     * Inserta un elemento en la pila.
     * @param item Elemento a insertar.
     */
    void push(T item);

    /**
     * Extrae y elimina el último elemento de la pila.
     * @return Elemento extraído.
     */
    T pop();

    /**
     * Obtiene el último elemento sin eliminarlo.
     * @return Último elemento de la pila.
     */
    T peek();

    /**
     * Verifica si la pila está vacía.
     * @return `true` si está vacía, `false` en caso contrario.
     */
    boolean isEmpty();

    /**
     * Obtiene el tamaño de la pila.
     * @return Número de elementos en la pila.
     */
    int size();
}
