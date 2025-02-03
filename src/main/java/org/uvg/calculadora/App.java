package org.uvg.calculadora;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

/**
 * Clase principal que ejecuta la calculadora Postfix.
 */
public class App {
    public static void main(String[] args) {
        try {
            String expression = new String(Files.readAllBytes(Paths.get("datos.txt"))).trim();
            Stack<Integer> stack = new VectorStack<>(); // Aquí puedes cambiar entre VectorStack y ArrayListStack
            Calculator calculator = new PostfixEvaluator(stack);
            System.out.println("Resultado: " + calculator.evaluate(expression));
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
