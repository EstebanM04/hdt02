package org.uvg.calculadora;
import java.util.StringTokenizer;

/**
 * Implementación de una calculadora que evalúa expresiones en notación postfix.
 */
public class PostfixEvaluator implements Calculator {
    private Stack<Integer> stack;

    /**
     * Constructor que permite cambiar la implementación de la pila.
     * @param stack Implementación de Stack a utilizar.
     */
    public PostfixEvaluator(Stack<Integer> stack) {
        this.stack = stack;
    }

    public int evaluate(String expression) {
        StringTokenizer tokenizer = new StringTokenizer(expression);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            if (token.matches("\\d+")) { // Si es un número
                stack.push(Integer.parseInt(token));
            } else { // Si es un operador
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Error: No hay suficientes operandos.");
                }
                
                int b = stack.pop();
                int a = stack.pop();
                
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": 
                        if (b == 0) throw new ArithmeticException("Error: División por cero.");
                        stack.push(a / b); 
                        break;
                    case "%": stack.push(a % b); break;
                    default: throw new IllegalArgumentException("Error: Operador no válido.");
                }
            }
        }

        if (stack.size() != 1) {
            throw new IllegalStateException("Error: Expresión mal formada.");
        }

        return stack.pop();
    }
}