import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void CalculatorTest() {
    Calculator myCalculator = Calculator.initialCalculator();
    myCalculator.add(58).add(2);
    int result = myCalculator.calculatingResult();
    assertEquals(result,60);
  }
}
