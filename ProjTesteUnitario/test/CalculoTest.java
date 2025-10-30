import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculoTest {
    
    Calculo calc;
    
    public CalculoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        calc = new Calculo();
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testCalcularMedia() {
        assertEquals(7, calc.CalcularMedia(8, 6));  
    }
    
    @Test
    public void testMaiorNum() {
        assertEquals(true, calc.VerificaPar(4));  
    }
    
    @Test
    public void testVerificaPar() {
        assertEquals(10, calc.MaiorNum(10, 5));  
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
