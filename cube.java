import java.io.*;
public class Calculate
{
      static int cube(int x)
    {
        return x*x*x;
    }
    public static void main(String args[])
    {
        int result = cube(8);
        System.out.println(" Cube of 8 is "+result);
    }
}