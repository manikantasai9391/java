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
public class singleInheritanceDemo
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}