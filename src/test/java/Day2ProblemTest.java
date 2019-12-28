import org.junit.Assert;
import org.junit.Test;

public class Day2ProblemTest {

    Day2Problem day2Problem = new Day2Problem();

    @Test
    public void productTest1() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] expectedResultArray = {120, 60, 40, 30, 24};

        int[] actualResultArray = new int[inputArray.length];

        actualResultArray  = day2Problem.findNewProductArray(inputArray);
        Assert.assertArrayEquals(expectedResultArray, actualResultArray);
    }

    @Test
    public void productTest2() {
        int[] inputArray = {3, 2, 1};
        int[] expectedResultArray = {2, 3, 6};

        int[] actualResultArray = new int[inputArray.length];

        actualResultArray  = day2Problem.findNewProductArray(inputArray);
        Assert.assertArrayEquals(expectedResultArray, actualResultArray);
    }

}
