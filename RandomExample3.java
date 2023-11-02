import java.util.Random;
public class RandomNumberExample3
{
    public static void main(String args[])
    {
        Random random = new Random();
        int x = random.nextInt(50);
        int y = random.nextInt(1000);
        System.out.println("Randomly Generated Integers Values");
        System.out.println(x);
        System.out.println(y);
        double a = random.nextDouble();
        double b = random.nextDouble();
        System.out.println("Randomly Generated Double Values");
        System.out.println(a);
        System.out.println(b);
    }
}