import org.junit.Test;

import static org.junit.Assert.*;

public class jUnitTests {

    @Test
    public void testIfNameIsKenneth() {
        String expected = "Kenneth";
        String actual = "Pinch the Cat";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect(){
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price-discount, 0);
    }
}

