import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AtivPraticaTest {
    
    AtivPratica proj;
    
    public AtivPraticaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        proj = new AtivPratica();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMaior() {
        assertEquals(2, proj.Maior(2, 5, 4, 7, 10));
    }

    @Test
    public void testMultiplo() {
        assertEquals(true, proj.Multiplo(50));
    }

    @Test
    public void testMediaNormal() {
        assertEquals(7.2, proj.MediaNormal(6, 8, 3, 10, 9), 1);
    }

    @Test
    public void testMediaPond() {
        assertEquals(6, proj.MediaPond(9, 2, 9), 1);
    }
    
}
