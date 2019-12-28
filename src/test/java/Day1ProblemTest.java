import org.junit.Assert;
import org.junit.Test;

public class Day1ProblemTest {

    Day1Problem day1Problem = new Day1Problem();

    @Test
    public void testDay1ProblemSolutionPositiveCase() {
        int[] numbers = {10, 15, 3, 7};
        int sum = 17;
        Assert.assertTrue(day1Problem.doNumbersPairUpToSum(numbers, sum));
        Assert.assertTrue(day1Problem.doNumbersPairUpToSumInNTime(numbers,sum));
    }

    @Test
    public void testDay1ProblemSolutionEmptyCase() {

        int[] numbers = {};
        int sum = 17;
        Assert.assertTrue(!day1Problem.doNumbersPairUpToSum(numbers, sum));
        Assert.assertTrue(!day1Problem.doNumbersPairUpToSumInNTime(numbers,sum));
    }

    @Test
    public void testDay1ProblemSolutionNegativeCase() {
        int[] numbers = {10, 15, 3, 4};
        int sum = 17;
        Assert.assertTrue(!day1Problem.doNumbersPairUpToSum(numbers, sum));
        Assert.assertTrue(!day1Problem.doNumbersPairUpToSumInNTime(numbers,sum));
    }
}
