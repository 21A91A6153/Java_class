/*
move zeroes to right
 import  java.util.Scanner;
class Common
{
   public static void moveZeroes(int arr[])
    {
         int i,j=0;
         for(i=0;i<arr.length;i++)
         {
             if(arr[i]==0)
             {
                  j=i;
                  break;
              }
        }
      for(i=j+1;i<arr.length;i++)
      {
           if(arr[i]==1)
           {
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j++;
             }
          //j++;
      }
   }
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int n,i,m,j;
         n=sc.nextInt();
         int  x[]=new int[n];
         for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
         }
         moveZeroes(x);
      for(int ele:x)
     {
          System.out.print(ele+"  ");
      }
  }
}
-------------*/      
