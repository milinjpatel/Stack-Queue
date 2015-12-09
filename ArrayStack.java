import java.util.*;

public class ArrayStack implements CS240Stack
{
    ArrayList array;

    public ArrayStack()
    {
        array = new ArrayList();
    }

    public Object peek()
    {
        if (array.isEmpty())
        {
            return null;
        }
        else
        {
            return array.get(size()-1);
        }
    }

    public Object pop()
    {
        if (array.isEmpty())
        {
            return null;
        }
        else
        {
            return array.remove(size()-1);
        }
    }

    public int size()
    {
        return array.size();
    }

    public void push(Object o)
    {
        if (array.isEmpty())
        {
            array.add(0, o);
        }
        else
        {
            array.add(o);
        }
    }
}
