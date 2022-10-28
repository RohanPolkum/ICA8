import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UrinalsTest {
    @Test
    void isTestValidString1(){
        Urinals u= new Urinals();
        Assertions.assertTrue(u.goodString("10001"));
    }
}
