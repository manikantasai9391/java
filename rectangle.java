import java.io.*;
class Rectangle
{
    int l,b,a;
    Rectangle(){
        l=0;b=0;a=l*b;
    }
    Rectangle(int x,int y){
        l=x;
        b=y;
        a=l*b;
    }
    Rectangle(Rectangle r)
    {
        this.l=r.l;
        this.b=r.b;
        a=l*b;
    }
}
public class ConstructorOverloadingDemo
{
    public static void main(String args[]){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5,10);
        Rectangle r3 = new Rectangle(r2);
        System.out.println(" Area of rectangle is "+r1.a);
        System.out.println(" Area of rectangle is "+r2.a);
        System.out.println(" Area of rectangle is "+r3.a);
    }
}