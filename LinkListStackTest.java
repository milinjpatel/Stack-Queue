public class LinkListStackTest
{
    public static void main(String[] args)
    {
        LinkListStack stack = new LinkListStack();

	    stack.push(4);
        System.out.println("Stack: " + stack.link);
        stack.push(5);
        System.out.println("Stack: " + stack.link);
        stack.push(6);
        System.out.println("Stack: " + stack.link);
        stack.push(2);
        System.out.println("Stack: " + stack.link);
        stack.push(3);
        System.out.println("Stack: " + stack.link);
        int size = stack.size();
        System.out.println("Stack Size: " + size);
        Object number = stack.peek();
        System.out.println("Top Stack: " + number);
        number = stack.pop();
        System.out.println("Stack: " + stack.link);
        Object number1 = stack.peek();
        System.out.println("Top Stack: " + number1);
        number1 = stack.pop();
        System.out.println("Stack: " + stack.link);
        size = stack.size();
        System.out.println("Stack Size: " + size);
    }
}
