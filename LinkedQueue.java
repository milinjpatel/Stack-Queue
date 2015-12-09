import java.util.*;

public class LinkedQueue implements CS240Queue
{
    LinkedList link;

    public LinkedQueue()
    {
        link = new LinkedList();
    }

    public Object remove()
    {
        return link.removeFirst();
    }

    public void add(Object o)
    {
        link.add(o);
    }

    public int size()
    {
        return link.size();
    }
}
