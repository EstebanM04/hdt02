package org.uvg.calculadora;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testEvaluateSimpleExpression() {
        Stack<Integer> stack = new VectorStack<>();
        Calculator calculator = new PostfixEvaluator(stack);
        assertEquals(15, calculator.evaluate("1 2 + 4 * 3 +"));
    }

    @Test
    public void testEvaluateComplexExpression() {
        Stack<Integer> stack = new VectorStack<>();
        Calculator calculator = new PostfixEvaluator(stack);
        assertEquals(30, calculator.evaluate("6 2 3 + *"));
    }
}