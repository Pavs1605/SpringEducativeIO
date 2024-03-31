import org.example.junits.SubsetSumsEqualToK;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class SubsetSumsEqualtoKTests {

    @Test
    public void testsubsetSumEqualsToK_singleElement()
    {
        SubsetSumsEqualToK obj = new SubsetSumsEqualToK();
        boolean res = obj.subsetSumEqualsToK(new int[]{2}, 1, 2);
        assertEquals(true, res);
    }

    @Test
    public void testsubsetSumEqualsToK_TwoElementsPartition()
    {
        SubsetSumsEqualToK obj = new SubsetSumsEqualToK();
        boolean res = obj.subsetSumEqualsToK(new int[]{1, 1}, 2, 1);
        assertTrue( res);
    }


    @Test
    public void testsubsetSumEqualsToK_NElements()
    {
        SubsetSumsEqualToK obj = new SubsetSumsEqualToK();
        boolean res = obj.subsetSumEqualsToK(new int[]{2, 5, 1, 3,2}, 5, 5);
        assertEquals(true, res);
    }

}
