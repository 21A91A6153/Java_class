/*import  java.util.Scanner;
class Home2
{
   public static void main(String args[])
   { 
        Scanner sc=new Scanner(System.in);
       int n,c=0,i,k;
      n=sc.nextInt();
      int x[]=new int[n];
     //int a[]=new int[n];
      for( i=0;i<n;i++)
     {
         x[i]=sc.nextInt();
      }
   for(i=0;i<n;i++)
  {
       c=0;
      for(int j=0;j<n;j++)
    {
        if(x[i]==x[j] )
       {
            c++;
          }
        }
        if(c==1)
      {
            System.out.print(x[i]+"  ");
         }
      }
   }
}
------------------*/
//common elements
/*import  java.util.Scanner;
class Home2
{
   public static void main(String args[])
   { 
        Scanner sc=new Scanner(System.in);
       int n,c=0,i,j,m;
      n=sc.nextInt();
      int x[]=new int[n];
     int a[]=new int[n];
      for( i=0;i<n;i++)
     {
         x[i]=sc.nextInt();
      }
     m=sc.nextInt();
      for(j=0;j<m;j++)
      {
           a[j]=sc.nextInt();
         }
       for(i=0;i<n;i++)
       {
            for(j=0;j<m;j++)
          {
                if(x[i]==a[j])
              {
                    System.out.print(x[i]);
                  }
               }
          }
      }
}
------------*/
//uncommon elements
import  java.util.Scanner;
class Home2
{
   public static void main(String args[])
   { 
        Scanner sc=new Scanner(System.in);
       int n,c=0,i,j,max=0;
      n=sc.nextInt();
      int x[]=new int[n];
     int a[]=new int[n];
      for( i=0;i<n;i++)
     {
         x[i]=sc.nextInt();
      }
    for(i=0;i<n;i++)
   {
      for(j=0;j<n;j++)
     {
         if(




        

     