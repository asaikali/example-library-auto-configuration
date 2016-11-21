import com.example.greeter.Greeter;
import com.example.greeter.GreeterBuilder;
import org.junit.Assert;
import org.junit.Test;


public class TestGreeter {

    @Test
    public void testGreeter() {
        Greeter greeter = new GreeterBuilder().setName("Adib").setMessage("Hello").build();
        String greeting = greeter.hello();
        Assert.assertTrue("Hello Adib".equals(greeting));
    }
}
