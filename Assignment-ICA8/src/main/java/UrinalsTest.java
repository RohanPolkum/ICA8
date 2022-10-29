import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UrinalsTest {
    @Test
    void isGoodString(){
        Urinals u= new Urinals();
        Assertions.assertEquals(u.goodString("101101"),false);
    }
    @Test
    void isTestValidString1(){
        Urinals u= new Urinals();
        Assertions.assertTrue(u.validString("10001"));
    }
    @Test
    void isTestValidString2(){
        Urinals u=new Urinals();
        Assertions.assertFalse(u.validString("10023"));
    }

    @Test
    void isTestValidString3(){
        Urinals u=new Urinals();
        Assertions.assertTrue(u.validString(""));
    }

    @Test
    void isFileOpen1() throws FileNotFoundException {
        Urinals u=new Urinals();
        ArrayList<String> a=u.openFile("file1");
        Assertions.assertEquals(a.size(),1);

    }

    @Test
    void isCountUrinals1(){
        Urinals u=new Urinals();
        Assertions.assertEquals(u.countUrinals("00000"),3);
    }

    @Test
    void isCountUrinals2(){
        Urinals u=new Urinals();
        Assertions.assertEquals(u.countUrinals("00001"),2);
    }

    @Test
    void isCountUrinals3(){
        Urinals u=new Urinals();
        Assertions.assertEquals(u.countUrinals("10000"),2);
    }

    @Test
    void isCountUrinals4(){
        Urinals u=new Urinals();
        Assertions.assertEquals(u.countUrinals("010010"),0);
    }

    @Test
    void isFileWritten() throws FileNotFoundException {
        Urinals u= new Urinals();
        ArrayList<String> a=u.openFile("file1");
        u.editFile(a);
    }



}
