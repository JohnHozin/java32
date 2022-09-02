import junit.framework.TestCase;
import org.junit.*;

public class DeterminantTest {
//    @Before
//    @After
//    @BeforeClass
//    @AfterClass

    @Test
    public void determinant1(){
        double[][] nums = {{1,2,3}, {4,5,6}, {2,4,6}};
        Matrix matrix = new Matrix(nums);

        double resultFact = matrix.determinant();
        double resultWait = 0.0;

        TestCase.assertEquals(resultFact, resultWait);
    }
}
