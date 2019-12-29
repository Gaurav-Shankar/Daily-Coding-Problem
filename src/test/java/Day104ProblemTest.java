import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Day104ProblemTest {

    Day104Problem day104Problem = new Day104Problem();

    public Day104Problem.Node createList(int[] arr) {
        Day104Problem.Node head = new Day104Problem.Node(1);
        Arrays.stream(arr).forEach(element -> {
            day104Problem.append(element, head);
        });
        return head;
    }

    @Test
    public void testPalindrome() {
        Day104Problem.Node head = createList(new int[]{1, 4, 3, 4, 1,1});
        Assert.assertTrue(day104Problem.isPalindrome(head));
    }

    @Test
    public void testFalsePalindrome() {
        Day104Problem.Node head = createList(new int[]{1, 4});
        Assert.assertTrue(!day104Problem.isPalindrome(head));
    }
}
