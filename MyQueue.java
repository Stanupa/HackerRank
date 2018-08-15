public class MyQueue {
    
    private class ListNode {
        private int data;
        private ListNode next;
        
        public ListNode(int val) {
            this.data = val;
            this.next = null;
        }
    }
    
    private ListNode head;
    private ListNode tail;
    
    public MyQueue() {
        this.head = null;
        this.tail = null;
    }
    
    public void add(int val) {
        ListNode newNode = new ListNode(val);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }
    
    public int remove() {
        if (tail == null) {
            return -1;
        }
        else {
            ListNode prev = null;
            ListNode curr = this.head;
            while (curr != this.tail) {
                prev = curr;
                curr = curr.next;
            }
            int retval = curr.data;
            if (prev != null) {
                prev.next = null;
            }
            this.tail = prev;
            if (this.tail == null) {
                this.head = null;
            }
            return retval;
        }
    }
    
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }
    
    public static void main(String args[]) {
        MyQueue test = new MyQueue();
        test.add(1);
        System.out.println(test.remove());
        test.add(2);
        test.add(3);
        while (!test.isEmpty()) {
            System.out.println(test.remove());
        }
    }
}
