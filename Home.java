/*import  java.util.Scanner;
class Home
{
   public static void main(String args[])
     {
             Scanner sc=new Scanner(System.in);
             int  n,temp,d,k=0;
             n=sc.nextInt();
             temp=n;
             while(n!=0)
             {
                   d=n%10;
                   n=n/10;
                   k=k+(int)Math.pow(d,3);
              }
           if(temp==k)
          {
               System.out.println("Armstrong");
           }
           else
           {
                 System.out.println(" Not Armstrong");
            }
      }
 }*/
import  java.util.Scanner;
class Fibonacci
{
      public static void main(String args[])
        {
           Scanner sc=new Scanner(System.in);
           int  n,a=0,b=1,c,sum=0;
           n=sc.nextInt();
           for(int i=0;i<=n;i++)
          {
               if(a%2==0)
               {
                    sum=sum+a;
                }
               c=a+b;
               a=b;
                b=c;
              }
         System.out.println(sum);
          }
 }
/*import  java.util.Scanner;
class Prime
{
     public static boolean isPrime(int n)
     {
         int i;
        if(n<=1)
       {
           return false;
        }
        for(i=2;i<=(int)Math.sqrt(n);i++)
       {
            if(n%i==0)
          {
               return  false;
            }
        }
      return true;
   }
      public static void main(String args[])
       {
             int n,m;
             Scanner sc=new Scanner(System.in);
             n=sc.nextInt();
             m=sc.nextInt();
            for(int i=n;i<=m;i++)
           {
                 if(isPrime(i))
                  {
                      System.out.print(i+" ");
                    }
            }
     }
}*/
