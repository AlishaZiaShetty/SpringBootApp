package Misc;

import java.util.ArrayList;

public class MyCustomList<T extends Number>
{
    ArrayList<T> arrayList = new ArrayList<>();

    public void addToArrayList(T element)
    {
        arrayList.add(element);
    }

    public void removeFromArrayList(T element)
    {
        arrayList.remove(element);
    }

    public String toString()
    {
        return arrayList.toString();
    }

    public T get(int i)
    {
       return arrayList.get(i);
    }
}
