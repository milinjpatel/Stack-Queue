public class ArrayQueueTest
{
    public static void main(String[] args)
    {
        ArrayQueue queue = new ArrayQueue();

        queue.add(5);
        System.out.println("Queue: " + queue.array);
        queue.add(1);
        System.out.println("Queue: " + queue.array);
        int size = queue.size();
        System.out.println("Queue Size: " + size);
        Object number = queue.remove();
        System.out.println("Remove " + number + " Queue: " + queue.array);
    }
}
