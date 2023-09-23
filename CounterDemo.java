import java.io.*;
class CounterDemo
{
    static int count=0;
    CounterDemo()
    {
        count++;
        System.out.println(" count = "+count);
    }
}
public class StaticVariableDemo
{
    public static void main(String args[])
{
    CounterDemo cd1 = new CounterDemo();
    CounterDemo cd2 = new CounterDemo();
    CounterDemo cd3 = new CounterDemo();
}
}