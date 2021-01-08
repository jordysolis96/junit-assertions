import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIfVersionIsSet(){
        assertEquals(1.2, CodeupCrypt.version, 0);
    }

//      "Sophie" -> "S0ph13"
//      "Fer" -> "F3r"

        @Test
        public void testHashPassword(){
            assertEquals("S0ph13", CodeupCrypt.hashPassword("Sophie"));
            assertEquals("F3r", CodeupCrypt.hashPassword("Fer"));
            assertEquals("123", CodeupCrypt.hashPassword("123"));
    }

        @Test
        public void testCheckPassword(){
            assertTrue("check password", CodeupCrypt.checkPassword("fer", "f3r"));
            assertTrue("check password", CodeupCrypt.checkPassword("Sophie", "S0ph13"));
    }
}
