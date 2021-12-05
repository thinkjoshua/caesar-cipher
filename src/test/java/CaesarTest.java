import org.junit.*;
import static org.junit.Assert.*;

public class CaesarTest {

    @Test
    public void runCipher_returnStringPlainText_String(){
        Caesar testCipher = new Caesar("tom",2);
        testCipher.getPlainText();
        assertEquals("tom", testCipher.getPlainText());
    }

    @Test
    public void runCipher_returnIntShift_Integer(){
        Caesar testCipher2 = new Caesar("nebuchadnezzer", 2);
        testCipher2.getShift();
        assertEquals(2, testCipher2.getShift());

    }

    @Test
    public void encrypt_returnEncryptedText_String(){
        Caesar testCipher3 = new Caesar("tom", 2);
        testCipher3.encrypt("tom", 2);
        assertEquals("vqo", testCipher3.encrypt("tom", 2));
    }

    @Test
    public void decrypt_returnDecryptedText_String(){
        Caesar testCipher4 = new Caesar("vqo", 2);
        testCipher4.decrypt("vqo", 2);
        assertEquals("tom", testCipher4.decrypt("vqo",2));
    }

}