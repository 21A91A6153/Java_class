// readability of code becomes easy .it increases the code reusability.
// An array is a fixed ordered collection of homogenious elements(same datatype) storedd in a continous memory locations
// and refered through a single name.
/*declaration of an array:
------------>> syntax:
------------>>          datatype arr_name[]=new datatype[size];
ex: 
----------> int x[]=new int[10];----> x->allocate memory for 10 integer elements i.e 40 bytes;
-----------> char x[]=new char[10];
----------->float z[]=new float[10];
----------->boolean b[]=new boolean[10];
//we get default values when we give new.
Initialization of an array:
---------------->>Assigning values into array is initialization.

1.compiletime initialization:
syntax:
  datatype arr_name[]={value1,value2,......,valuen};
ex:
  int x[]={10,20,30,40,50,60};
  String names[]={"ramu","sita"};
   
  System.out.println(x.length);
  System.out.println(names.length);
once the array is initilized we cannot add any values out of range. 

2. Runtime Initialization:
   taking input from the user
   Assigning values into an array at the time of program execution.
ex:
   Scanner sc=new Scanner(System.in);
   int x[]=new int[10];
for(int i=0;i<10;i++)
  x[i]=sc.nextInt();

// Display 
   for(int i=0;i<10;i++)
     System.out.println(x[i])-->line by line (Or)System.out.print(x[i]+" ")

foreach loop:
==========
    for(datatype ele : arr_name)
       System.out.print(ele+" ");
*/

/*import java.util.Scanner;
class array
{
  public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,x[],i,sum=0,mul=1;
    n=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
      x[i]=sc.nextInt();
    for(int ele: x)
    {
       if(ele%2==0)
      {
         System.out.print(ele+" ");
         sum=sum+ele;
         mul=mul*ele;
       }
    }  
    for(int ele: x)
    {
   //    System.out.print(ele+" ");
        //  sum=sum+ele;
          //mul=mul*ele;
     }
    System.out.println("\n"+sum+" "+mul);
    sc.close();
  }
}
------------------*/
import  java.util.Scanner;
class array
{
    public static void main(String args[])
  {
       Scanner scc=new Scanner(System.in);
      n=sc.nextInt();
      int x[]=new int[n];
     int y[]=new int[n];
      for(int i=0;i<n;i++)
     {
          x[i]=sc.nextInt();
      }
     for(i=n-1;i>=0;i--)
   {
        for(int j=0;j<n;j++)
      {
          y[j]=x[i];
       }
    }
   for(i=0;i<n;i++)
 {
    System.out.print(y[i]+"  ");
  }
}
}