import org.junit.Assert;
import org.junit.Test;

public class Day29ProblemTest {

    Day29Problem day29Problem = new Day29Problem();

    @Test
    public void testRunLengthEncoding() {
        String string = "AAAABBBCCDAA";
        String expectedEncodedString = "4A3B2C1D2A";
        Assert.assertTrue(day29Problem.runLengthEncoding(string)
                .equals(expectedEncodedString));
    }
}
