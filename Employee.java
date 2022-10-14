import java.util.Scanner;
class Employee
{
   String Id,name,gender,address;
  int age,ugm,pgm;
  Scanner sc=new Scanner(System.in);
    public  void person_details()
  {
      Id=sc.nextLine();
     name=sc.nextLine();
    age=sc.nextInt();
     gender=sc.nextLine();
    address=sc.nextLine();
    
  }
  public void ug_details()
 {
   ugm=sc.nextInt();
  }
  public void pg_details()
{ 
    pgm=sc.nextInt();
 }
 public void show()
 {
    System.out.println("Employee Id"+Id);
   System.out.println("age"+age);
  System.out.println("gender"+gender);
  System.out.println("address"+address);
  System.out.println("ug_marks"+ugm);
System.out.println("pg_marks"+pgm);
 }
  
      
    public static void main(String args[])
   {
       Employee e1=new Employee();
       e1.person_details();
       e1.show();
       e1.ug_details();
       e1.ug_show();
    
      e1.pg_details();
      e1.show();
    }
}