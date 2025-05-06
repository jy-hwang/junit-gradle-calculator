import com.fastcampus.Calculator;
import com.fastcampus.DollarCalculator;
import com.fastcampus.MarketApi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DollarCalculatorTest {

  @Mock
  public MarketApi marketApi;

  @BeforeEach
  public void init(){
    Mockito.lenient().when(marketApi.connect()).thenReturn(1400);
  }

  @Test
  public void testHello() {
    System.out.println("Hello");
  }

  @Test
  public void dollarPlusTest() {
    DollarCalculator dollarCalculator = new DollarCalculator(marketApi);
    dollarCalculator.init();

    Calculator calculator = new Calculator(dollarCalculator);

    Assertions.assertEquals(28000, calculator.plus(10, 10));
  }

  @Test
  public void dollarMinusTest() {
    DollarCalculator dollarCalculator = new DollarCalculator(marketApi);
    dollarCalculator.init();

    Calculator calculator = new Calculator(dollarCalculator);

    Assertions.assertEquals(7000, calculator.minus(10, 5));
  }

  @Test
  public void mockTest() {
    DollarCalculator dollarCalculator = new DollarCalculator(marketApi);
    dollarCalculator.init();

    Calculator calculator = new Calculator(dollarCalculator);
    Assertions.assertEquals(28000, calculator.plus(10, 10));
  }

}
