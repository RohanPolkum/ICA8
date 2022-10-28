import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UrinalsTest {
    @Test
    void isTestValidString1(){
        Urinals u= new Urinals();
        Assertions.assertTrue(u.goodString("10001"));
    }
    @Test
    void isTestValidString2(){
        Urinals u=new Urinals();
        Assertions.assertFalse(u.goodString("10023"));
    }

    @Test
    void isTestValidString3(){
        Urinals u=new Urinals();
        Assertions.assertTrue(u.goodString(""));
    }

    @Test
    void isFileOpen1() throws FileNotFoundException {
        Urinals u=new Urinals();
        ArrayList<String> a=u.openFile("file1");
        Assertions.assertEquals(a.size(),1);

    }
}
