//2D array is nothing but array of arrays.
//Syntax:
  // datatype  arr_name[][]=new datatype[row_size][col_size];
//eg:
  //int x[][]=new int[3][2];
import  java.util.Scanner;
class Dimensional
{
     public static int findMaximum(int arr[][])
      {
           int i,max=0;
           max=arr[0];
           for(i=0;i<arr.length;i++)
          { 
               if(arr[i]>max)
               {
                    max=arr[i];
               }
          }
       return max;
   }
      public static void main (String args[])
     {
           Scanner sc=new Scanner(System.in);
           int  x[][],row,col,i,j;
           row=sc.nextInt();
           col=sc.nextInt();
           x=new int[row][col];
           for(i=0;i<row;i++)
          {
                for(j=0;j<col;j++)
                {
                       x[i][j]=sc.nextInt();
                  }
           }
         for(i=0;i<row;i++)
         {
              System.out.println(findMaximum(x[i]));
          }
     }
}
  