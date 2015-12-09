import java.util.*;

public class LinkListStack implements CS240Stack
{
    LinkedList link;

    public LinkListStack()
    {
        link = new LinkedList();
    }

    public Object peek()
    {
        if (link.size() == 0)
        {
            return null;
        }
        else
        {
            return link.getFirst();
        }
    }

    public Object pop()
    {
        if (link.size() == 0)
        {
            return null;
        }
        else
        {
            return link.removeFirst();
        }
    }

    public int size()
    {
        return link.size();
    }

    public void push(Object o)
    {
        link.addFirst(o);
    }
}
