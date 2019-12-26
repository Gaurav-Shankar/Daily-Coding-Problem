/**
 *
 * This problem was recently asked by Google.
 *
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class Day1Problem {
    /**
     * nlog(n) approach
     * @param numbers
     * @param sum
     * @return
     */
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

    /**
     * n approach
     * @param numbers
     * @param sum
     * @return
     */
    public Boolean doNumbersPairUpToSumInNTime(int[] numbers, int sum) {
        Set<Integer> numberSet = new HashSet<Integer>();
        AtomicBoolean flag = new AtomicBoolean(false);
        Arrays.stream(numbers).forEach(number -> {
            if(numberSet.contains(sum-number)) {
                flag.set(true);
            } else  {
                numberSet.add(number);
            }
        });
        return flag.get();
    }
}
