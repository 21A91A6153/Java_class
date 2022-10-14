/*class name
{
  public static void main(String args[])
  {
    System.out.println("hi");
    System.out.println("pravallika");
  }
}
*/
import java.util.Scanner;
class name
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    float s,area;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    s=(float)(a+b+c)/2;
    area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.format("%.2f",area);
  }
}