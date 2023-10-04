import java.io.*;
class Animal
{
    void eat()
    {
        System.out.println(" Animal can eat ");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println(" Dog can bark ");
    }
}
class BabyDog extends Dog
{
    void weep()
    {
        System.out.println(" BabyDog can weep ");
    }
}
public class singleInheritanceDemo
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        BabyDog bd = new BabyDog();
        d.bark();
        d.eat();
        bd.weep();
    }
}