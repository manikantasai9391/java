import java.io.*;
import java.util.*;
public class TableExample {
    public static void main(String args[]) {
        Scanner Sc= new Scanner(System.in);
        System.out.println(" Enter number : ");
        int num = Sc.nextInt();
        System.out.println(" Enter n value ");
        int n = Sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(num+" * " +i+ " = " +num);
        }
    }
}