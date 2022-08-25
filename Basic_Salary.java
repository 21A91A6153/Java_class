import java.util.Scanner;
class Basic_Salary
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    float HRA,DA,PF,NS,BS;
    int TA=3000;
    BS=sc.nextInt();
    HRA=(20*BS)/100;
    DA=(15*BS)/100;
    PF=(15*BS)/100;
    NS=(HRA+BS+DA+TA)-PF;
    System.out.println("net salary is "+NS);
  }
}
