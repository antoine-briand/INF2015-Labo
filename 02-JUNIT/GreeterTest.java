import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GreeterTest {
    @Test
    public void testGreeter() {
        String message = Greeter.greet("Ahhtoine");
        assertEquals("Hello Antoine", message);
    }
}