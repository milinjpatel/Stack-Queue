import java.util.*;

public class ArrayQueue implements CS240Queue
{
    ArrayList array;
    private int front;
    private int rear;
    private int count;

    public ArrayQueue()
    {
        front = 0;
        rear = 0;
        count = 0;
        array = new ArrayList();
    }

    public Object remove()
    {
        return array.remove(0);
    }

    public void add(Object o)
    {
        array.add(o);
    }

    public int size()
    {
        return array.size();
    }
}
