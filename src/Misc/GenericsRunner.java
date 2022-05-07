package Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsRunner
{
    static <X> X doubleValue(X value)
    {
        return value;
    }

    static <X extends List> void duplicateList(X list)
    {
        list.addAll(list);
    }

    static double sumOfNumberList(List< ? extends Number> numbers)
    {
        double sum = 0.0;
        for( Number number : numbers)
        {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String args[])
    {
        MyCustomList<Integer> myCustomList = new MyCustomList<Integer>();

        myCustomList.addToArrayList(10);
        myCustomList.addToArrayList(20);
        int test1 = myCustomList.get(0);

        System.out.println("test1 : "+test1);

        MyCustomList<Float> myCustomList2 = new MyCustomList<Float>();
        myCustomList2.addToArrayList(4.5f);
        Float test2 = myCustomList2.get(0);

        System.out.println("test2 : "+test2);

        String stringValue = doubleValue("");
        Integer numberValue = doubleValue(5);
        ArrayList listVal = doubleValue(new ArrayList());

        ArrayList<Integer> numbers =  new ArrayList<>(Arrays.asList(1,2,3));
        duplicateList(numbers);

        System.out.println(numbers);
        System.out.println(sumOfNumberList(Arrays.asList(1,3,4)));
        System.out.println(sumOfNumberList(Arrays.asList(1.2,3.7,4.2)));

    }
}
