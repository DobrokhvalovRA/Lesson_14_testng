import org.example.Factorial;
import org.testng.annotations.Test;

@Test
public class TestFactorial {
    private Factorial factorial = new Factorial();

    @Test
    public void factorial() {
        assert (factorial.getFactorial(0) == 1);
        assert (factorial.getFactorial(1) == 1);
        assert (factorial.getFactorial(5) == 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void factorialNegative() {
            factorial.getFactorial(-5);
    }
}
