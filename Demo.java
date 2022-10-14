public class ClassDemo {
   //variables
	int x;
	public void setX(int m)
	{
		x=m;
	}
	public int getX()
	{
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Classname obj=new Classname();
		ClassDemo obj1=new ClassDemo();
		ClassDemo obj2=new ClassDemo();
		obj1.setX(10);
		obj2.setX(20);
		System.out.println(obj1.getX());   // Method call
		System.out.println(obj2.getX());   // Accessing Member variable
	}

}
