import java.util.Scanner;// used for taking inputs from user 
class Simple
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int p,t,r;
   float i;
   p=sc.nextInt();
   t=sc.nextInt();
   r=sc.nextInt();
   i=(p*t*r)/(100);
   System.out.println("simple interest is "+i);
 }
}
