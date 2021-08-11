abstract class A
{
	 abstract void show();
}

abstract class B 
{
     void show()
	{
		System.out.println("hi");
	}
}
class C extends B
{
	void show() {
		System.out.println("hello");
	}
}
public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           C obj=new C();
           obj.show();
	}

}
