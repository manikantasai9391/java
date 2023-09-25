import java.io.*;
class OuterClass
{
    static int Outer_x=50;
    int Outer_y=60;
    private int Outer_z=70;
   class InnerClass
   {
       void display()
       {
           System.out.println(" Outer_x value is "+Outer_x);
           System.out.println(" Outer_y value is "+Outer_y);
           System.out.println(" Outer_z value is "+Outer_z);
       }
   }
}
   public class InnerClassDemo
   {
       public static void main(String args[]){
           OuterClass oc =new OuterClass();
           OuterClass.InnerClass ic=oc.new InnerClass();
           ic.display();
       }
   }