import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void buddyStringsTest1(){
        String s = "ab";
        String goal = "ba";
        boolean actual = new Solution().buddyStrings(s, goal);

        Assertions.assertTrue(actual);
    }

    @Test
    public void buddyStringsTest2(){
        String s = "ab";
        String goal = "ab";
        boolean actual = new Solution().buddyStrings(s, goal);

        Assertions.assertFalse(actual);
    }

    @Test
    public void buddyStringsTest3(){
        String s = "aa";
        String goal = "aa";
        boolean actual = new Solution().buddyStrings(s, goal);

        Assertions.assertTrue(actual);
    }
}
