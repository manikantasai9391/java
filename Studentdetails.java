import java.util.*;
public class StudentDetails
{
    public static void main(String args[])
    {
        String name;
        int rollno,pps,datastructures,java;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Name : ");
        name=sc.nextLine();
        System.out.println(" Enter rollno : ");
        rollno=sc.nextInt();
        System.out.println(" Enter marks in pps : ");
        pps=sc.nextInt();
        System.out.println(" Enter marks in datastructures :  ");
        datastructures=sc.nextInt();
        System.out.println(" Enter marks in java : ");
        java=sc.nextInt();
        int total=pps+datastructures+java;
        float percentage=(float)total/300*100;
        System.out.println(" name : "+name);
        System.out.println(" rollno : "+rollno);
        System.out.println(" marks (pps) : "+pps);
        System.out.println("marks (datastructures) : "+datastructures);
        System.out.println(" marks (java) : "+java);
        System.out.println(" total : "+total);
        System.out.println(" percentage : "+percentage);
    }
}
