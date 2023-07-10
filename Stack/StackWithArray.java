public class StackWithArray {

    public static class MyStack
    {
        int capacity;
        int arr[];
        int top;
        public MyStack(int c)
        {
            capacity=c;
            arr=new int[capacity];
            top=-1;
        }
        
        void push(int element)
        {
            if(top+1==capacity)
            {
                System.out.println("Stack is full");
                return;
            }
            arr[++top]=element;
            System.out.println(element+" element pushed");
            
            
        }
        
        public int pop()
        {
            if(top==-1)
            {
                System.out.println("stack is Empty");
                return -1;
            }

            return arr[top--];
        }

        public int size()
        {
            return top+1;
        }

        public int peek()
        {
            if(top==-1)
            {
                System.out.println("No element in Stack");
                return -1;
            }
            return arr[top];
        }
        
    }
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());

    }
}
