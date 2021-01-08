import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void testIfNamesAreEqual(){
        String name = "Jane";
        String input = "jane";

        assertEquals(name, input);
    }

    @Test
    public void testIfNumbersAreEqual(){
        int myNumber = 5;
        int userInput = 5;

        assertEquals(myNumber, userInput);
    }

    @Test
    public void testIfChangeIsCorrect(){
        Double price = 10.0;
        Double discount = 4.5;

//      10 - 4.5 = 5.5 ; 0 margin of error
        assertEquals(5.5, price - discount, 0);
//      5.5; .5 delta (we can fo from 5 - 6)
        assertEquals(5.1, price - discount, 0.5);
//      5.5; .5 delta (we can go from 5 - 6); test passes because 4.9 is out of equals
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfObjectsAreDifferent(){
        Object dog = new Object();
        Object sheep = new Object();
        Object clonedSheep = sheep;

        assertNotSame(sheep, dog);
        assertSame(sheep, clonedSheep);
    }

    @Test
    public void testArrayEquals(){
        char[] expected = {'J', 'u', 'n', 'i', 't'};
        char[] actual = "junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    @Test
    public void testIfInstanceIsNull() {
        Object phone = new Object();
        Object laptop = null;
        assertNull(null);
        assertNotNull(phone);
        assertNull(laptop);
    }

}

