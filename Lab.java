//1.Basic programs
//1.1 Default values of Primitive datatypes:
/* import  java.util.Scanner;
class Lab
{
    static byte b;
    static short s;
    static int i;
   static long l;
   static char ch;
   static  float f;
   static double d;
  static  boolean bl;
public static void main(String args[])
{
  System.out.println(b);
  System.out.println(s);
  System.out.println(i);
  System.out.println(l);
  System.out.println(ch);
  System.out.println(f);
  System.out.println(d);
  System.out.println(bl);
  }
}
Output:
0
0
0
0

0.0
0
false
*/
//---------------------------------------------------------------
//1.2 Find the descriminants of the quadratic expression
/*import java.util.Scanner;
class Lab
{
  public static void main(String args[])
 {
    int a,b,c,d;
    double r1,r2;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=b*b-4*a*c;
    if(d==0)
  {
       r1=r2=-(double)b/(2*a);
     System.out.format("%.2f\n", r1);
    System.out.format("%.2f", r2);
   }
  else if(d>0)
   {
      r1=(-b+Math.sqrt(d))/(2*a);
      r2=(b+Math.sqrt(d))/(2*a);
     System.out.format("%.2f\n", r1);
    System.out.format("%.2f", r2);
  }
 else
{
   double real,img;
   real=-(double)b/(2*a);
  img=Math.sqrt(Math.abs(d))/(2*a);
  System.out.format("%.2f + i%.2f\n", real,img);
 System.out.format("%.2f  - i%.2f", real,img);
 }
}
}
output:
3
2
5
-0.33 + i1.25
-0.33  - i1.25*/
//--------------------------------------------------------------------
 //1.3 
/*import  java.util.Scanner;
class Lab
{
   public static void main(String args[])
   {
       int a,b,c,d,e;
       float avg;
       Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      d=sc.nextInt();
     e=sc.nextInt();
    avg=(float)(a+b+c+d+e)/5;
    if(a>avg)
    {
        System.out.println(a);
     }
     if(b>avg)
  {
      System.out.println(b);
  }
   if(c>avg)
  {
    System.out.println(c);
   }
   if (d>avg)
   {
    System.out.println(d);
   }
     if(e>avg)
   {
   System.out.println(e);
    }
    else
   {
    System.out.println("no");
    }
  }
}
output:
10 20 30 40 50
40
50*/

