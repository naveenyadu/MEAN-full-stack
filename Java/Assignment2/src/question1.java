final class singletone
{
	public void show()
	{
		System.out.println("hello");
	}
}
class A extends singletone
{
	public void show()
	{
		System.out.println("hi");
	}
}
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.show();

	}

}
