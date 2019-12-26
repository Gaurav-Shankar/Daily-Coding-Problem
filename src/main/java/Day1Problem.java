import java.util.Arrays;

public class Day1Problem {

    public Boolean doNumbersPairUpToSum(int[] numbers, int sum) {
        Arrays.sort(numbers);
        int leftIndex = 0, rightIndex = numbers.length - 1;
        while (leftIndex < rightIndex) {
            if (numbers[leftIndex] + numbers[rightIndex] == sum) {
                return true;
            } else if (numbers[leftIndex] + numbers[rightIndex] > sum) {
                rightIndex -= 1;
            } else if (numbers[leftIndex] + numbers[rightIndex] < sum) {
                leftIndex += 1;
            }
        }
        return false;
    }
}
