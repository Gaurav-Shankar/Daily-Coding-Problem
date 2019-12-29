public class Day104Problem {

    public static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void append(int new_data, Node head) {
        Node new_node = new Node(new_data);
        Node last = head;
        new_node.right = null;
        if (head == null) {
            new_node.left = null;
            head = new_node;
            return;
        }
        while (last.right != null)
            last = last.right;
        last.right = new_node;
        new_node.left = last;
    }

    public Boolean isPalindrome(Node head) {
        if (head == null) {
            return true;
        }
        Node end = head;
        while (end.right != null) {
            end = end.right;
        }
        while (head != end) {
            if (head.data != end.data) {
                return false;
            }
            head = head.right;
            end = end.left;
        }
        return true;
    }
}
