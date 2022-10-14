/*import  java.util.Scanner;
class Mathh
{
     public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int d=(int)Math.log10(n);
        while(n>0)
       {
            int r=n/(int)Math.pow(10,d);
           switch (r)
          {
              case 1:System.out.println("one"); 
                           break;
              case 2:System.out.println("two"); 
                           break;
              case 3:System.out.println("three"); 
                           break;   
              case 4:System.out.println("four"); 
                           break;   
              case 5:System.out.println("five"); 
                           break;
              case 6:System.out.println("six"); 
                           break;
              case 7:System.out.println("seven"); 
                           break;
              case 8:System.out.println("eight"); 
                           break;
              case 9:System.out.println("nine"); 
                           break;
              default:System.out.println("zero"); 
                             break;
             }
          n=n%(int)Math.pow(10,d);
          d--;
         }
   }
}*/
/*import  java.util.Scanner;
class Mathh
{
      public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
      int n,r1,r2,flag=0,d;
      n=sc.nextInt();
      d=(int)Math.log10(n);
     while(n>0)
   {
       r1=n%10;
      r2=n/(int)Math.pow(10,d);
     if(r1!=r2)
    {
         flag=1;
        break;
      }
    n=n%(int)Math.pow(10,d);
    n=n/10;
    d-=2;
  }
    if(flag==0)
  {
         System.out.println("Palindrome");
   }
   else
  {
       System.out.println("Not");
   }
}
}*/
import  java.util.Scanner;
class Mathh
{
    public static boolean isPrime(int n)
  {
     if(n<1)
        return false;
    for(int i=2;i<=(int)Math.sqrt(n);i++)
   {
       if(n%i==0)
          return false;
    }
   return true;
  }
 public static boolean isPalindrome(int n)
  {
       int flag=0;
       int d=(int)Math.log10(n);
     while(n>0)
   {
      int  r1=n%10;
     int r2=n/(int)Math.pow(10,d);
     if(r1!=r2)
    {
         flag=1;
        break;
      }
    n=n%(int)Math.pow(10,d);
    n=n/10;
    d-=2;
  }
    if(flag==0)
  {
         return  true;
   }
   else
  {
       return  false;
   }
}
    public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n,m,d,r1,r2;
       n=sc.nextInt();
       m=sc.nextInt();
      for(int i=n;i<=m;i++)
    {
          if(isPrime(i) && isPalindrome(i))
               System.out.println(i+" ");
      }
  }
}
        



            
            
            
            
            
            