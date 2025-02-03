package org.uvg.calculadora;

/**
 * Interfaz para la Calculadora Postfix.
 */
public interface Calculator {
    int evaluate(String expression) throws Exception;
}