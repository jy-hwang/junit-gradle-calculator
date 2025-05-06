import com.fastcampus.Calculator;
import com.fastcampus.DollarCalculator;
import com.fastcampus.MarketApi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DollarCalculatorTest {

  @Test
  public void testHello() {
    System.out.println("Hello");
  }

  @Test
  public void dollarPlusTest() {
    MarketApi marketApi = new MarketApi();
    DollarCalculator dollarCalculator = new DollarCalculator(marketApi);
    dollarCalculator.init();

    Calculator calculator = new Calculator(dollarCalculator);

    Assertions.assertEquals(28000, calculator.plus(10, 10));
  }

  @Test
  public void dollarMinusTest() {
    MarketApi marketApi = new MarketApi();
    DollarCalculator dollarCalculator = new DollarCalculator(marketApi);
    dollarCalculator.init();

    Calculator calculator = new Calculator(dollarCalculator);

    Assertions.assertEquals(7000, calculator.minus(10, 5));
  }

}
