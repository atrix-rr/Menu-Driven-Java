import java.util.*;
class Task1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1) Area of Circle");
        System.out.println("2) Area of Rectangle");
        System.out.println("3) Area of Triangle");
            System.out.println("Enter your Choice");

        int ch=sc.nextInt();

        switch(ch)
        {
           case 1: System.out.println("Enter Radius");
           double r=sc.nextDouble();
           double A=3.14*r*r;
           System.out.println("Area is:"+A);
           break;

           case 2: System.out.println("Enter Length and Breadth");
           double L=sc.nextDouble();
           double B=sc.nextDouble();
           double Area=L*B;
           System.out.println("Area is:"+Area);
           break;

           case 3: System.out.println("Enter Length and Breadth");
           double l=sc.nextDouble();
           double b=sc.nextDouble();
           double area=0.5*l*b;
           System.out.println("Area is:"+area);
           break;
        }

    }
}