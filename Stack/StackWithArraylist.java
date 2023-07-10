import java.util.ArrayList;

public class StackWithArraylist {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        
        System.out.println(stack.Size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.Size());
        System.out.println(stack.peek());

    }
    
}

class Stack
{
    ArrayList<Integer> stack;
    public Stack()
    {
        stack = new ArrayList<>();
    }

    public void push(int x)
    {
        stack.add(x);
    }

    public int pop()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("Stack is Empty");
        }
        return stack.remove(Size()-1);
    }

     public int peek()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("Stack is Empty");
        }
        return stack.get(Size()-1);
    }

    int Size() {
        return stack.size();
    }

    private boolean isEmpty() {
        return stack.isEmpty();
    }

}

