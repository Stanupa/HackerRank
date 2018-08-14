import java.util.*;

public class MyStack <T> {
    
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.pop());
    }
    
    private class StackElement<T> {
        private T data;
        private StackElement<T> next;
        
        public StackElement(T data) {
            this.data = data;
        }
    }
    
    private StackElement<T> top;
    public MyStack() {
        this.top = null;
    }
    
    public void push(T item) {
        StackElement<T> node = new StackElement(item);
        node.next = this.top;
        this.top = node;
    }
    
    public T pop() {
        T value = this.top.data;
        this.top = this.top.next;
        return value;
    }
}
