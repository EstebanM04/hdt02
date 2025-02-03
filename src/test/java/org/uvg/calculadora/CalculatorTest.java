package org.uvg.calculadora;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testEvaluateSimpleExpression() throws Exception{
        Stack<Integer> stack = new VectorStack<>();
        Calculator calculator = new PostfixEvaluator(stack);
        assertEquals(15, calculator.evaluate("1 2 + 4 * 3 +"));
    }

    @Test
    public void testEvaluateComplexExpression() throws Exception{
        Stack<Integer> stack = new VectorStack<>();
        Calculator calculator = new PostfixEvaluator(stack);
        assertEquals(30, calculator.evaluate("6 2 3 + *"));
    }

    @Test
    public void testDivisionPorCero() throws Exception{
    Stack<Integer> stack = new VectorStack<>();
    Calculator calculator = new PostfixEvaluator(stack);
    String expression = "10 0 /";

    try {
        calculator.evaluate("10 0 /");
        fail("Se esperaba una ArithmeticException pero no se lanzó.");
        } catch (Exception e) {
        assertEquals("Error al evaluar la expresión: '" + expression + "'. Detalles: Error: División por cero.", e.getMessage());
        }
    }

    @Test
    public void testCadenaVacia() throws Exception{
        Stack<Integer> stack = new VectorStack<>();
        Calculator calculator = new PostfixEvaluator(stack);

        try{
            calculator.evaluate("");

        }catch(IllegalArgumentException e){
            assertEquals("Error: La expresión no puede estar vacía.", e.getMessage());
        }
    }

    @Test
    public void testCadenaNoValida() throws Exception{
        Stack<Integer> stack = new VectorStack<>();
        Calculator calculator = new PostfixEvaluator(stack);
        String expression = "5 2 3 +";
        try{
            calculator.evaluate(expression);
        } catch(Exception e){
            assertEquals("Error al evaluar la expresión: '" + expression + "'. Detalles: Error: Expresión mal formada.", e.getMessage());
        }
    }

}