public class ArrayStackTest
{
    public static void main(String[] args)
    {
        ArrayStack stack = new ArrayStack();
        
        stack.push(4);
        System.out.println("Stack: " + stack.array);
        stack.push(5);
        System.out.println("Stack: " + stack.array);
        stack.push(6);
        System.out.println("Stack: " + stack.array);
        stack.push(2);
        System.out.println("Stack: " + stack.array);
        stack.push(3);
        System.out.println("Stack: " + stack.array);
        int size = stack.size();
        System.out.println("Stack Size: " + size);
        Object number = stack.peek();
        System.out.println("Top Stack: " + number);
        number = stack.pop();
        System.out.println("Stack: " + stack.array);
        Object number1 = stack.peek();
        System.out.println("Top Stack: " + number1);
        number1 = stack.pop();
        System.out.println("Stack: " + stack.array);
        size = stack.size();
        System.out.println("Stack Size: " + size);
    }
}
