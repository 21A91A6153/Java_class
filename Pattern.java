/*import  java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int r,c,i,j;
         r=sc.nextInt();
         c=sc.nextInt();
        for(i=1;i<=r;i++)
       {
           for(j=1;j<=c;j++)
          {
              System.out.print("*");
          }
         System.out.println();
      }
  }
}*/
/*import  java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int r,c,i,j,k=1;
         r=sc.nextInt();
         c=sc.nextInt();
        for(i=1;i<=r;i++)
       {
           for(j=1;j<=c;j++)
          {
              System.out.print((char)(64+k++)+"  ");
          }
         System.out.println();
      }
  }
}*/
/*import  java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int r,c,i,j;
         r=sc.nextInt();
         c=sc.nextInt();
        for(i=1;i<=r;i++)
       {
           for(j=1;j<=c;j++)
          {
              System.out.print((char)(64+i)+"  ");
          }
         System.out.println();
      }
  }
}*/
/*import  java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int r,c,i,j,k=1,d=1;
         r=sc.nextInt();
         c=sc.nextInt();
        for(i=1;i<=r;i++)
       {
           for(j=1;j<=c;j++)
          {
              System.out.print((char)(64+k)+"  ");
              k+=r;
          }
         k=++d;
         System.out.println();
      }
  }
}*/
/*import  java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int r,c,i,j,k=1,d=1;
         r=sc.nextInt();
         c=sc.nextInt();
        for(i=1;i<=r;i++)
       {
           for(j=1;j<=c;j++)
          {
              System.out.print((char)(64+k)+"  ");
              k+=r;
          }
         k=++d;
         System.out.println();
      }
  }
}*/
/*import  java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int r,c,i,j;
         r=sc.nextInt();
         c=sc.nextInt();
        for(i=1;i<=r;i++)
       {
           for(j=1;j<=i;j++)
          {
              System.out.print("*");
          }
         System.out.println();
      }
  }
}*/
/*import  java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int r,c,i,j;
         r=sc.nextInt();
         c=sc.nextInt();
        for(i=1;i<=r;i++)
       {
           for(j=1;j<=c;j++)
          {
             if(j<=r-i) 
            {
              System.out.print(" ");
            }
           else
         {
             System.out.print("*");
        }
     }
         System.out.println();
      }
  }
}*/
/*import  java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int r,c,i,j;
         r=sc.nextInt();
         c=sc.nextInt();
        for(i=r;i>=1;i--)
       {
           for(j=1;j<=r;j++)
          {
              if(j<=r-i)
           {
                  System.out.print("  ");
          }
          else
          {
                  System.out.print("*");
          }
       }
         System.out.println();
      }
  }
}*/
/*
// reverse pyramid
 import  java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int r,c,i;
         r=sc.nextInt();
        for(i=1;i<=2*r-1;i++)
      {
          int k=i<=r?i:r-i% r;
         for(int j=1;j<=k;j++)
          System.out.print("* "); 
        System.out.println();
     }
   }
}*/
   