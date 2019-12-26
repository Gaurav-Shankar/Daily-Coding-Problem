import org.junit.Assert;
import org.junit.Test;

public class Day1ProblemTest {

    @Test
    public void testDay1ProblemSolutionPositiveCase() {
        Day1Problem day1Problem = new Day1Problem();
        int[] numbers = {10, 15, 3, 7};
        int sum = 17;
        Assert.assertTrue(day1Problem.doNumbersPairUpToSum(numbers, sum));
    }

    @Test
    public void testDay1ProblemSolutionEmptyCase() {
        Day1Problem day1Problem = new Day1Problem();
        int[] numbers = {};
        int sum = 17;
        Assert.assertTrue(!day1Problem.doNumbersPairUpToSum(numbers, sum));
    }

    @Test
    public void testDay1ProblemSolutionNegativeCase() {
        Day1Problem day1Problem = new Day1Problem();
        int[] numbers = {10, 15, 3, 4};
        int sum = 17;
        Assert.assertTrue(!day1Problem.doNumbersPairUpToSum(numbers, sum));
    }
}
