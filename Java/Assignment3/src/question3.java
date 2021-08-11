
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Java String pool refers to collection of Strings which are stored in heap memory");
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace("a","$"));
		System.out.println(str.contains("collection"));
		System.out.println(str.matches("java string pool refers to collection of strings which are stored in heap memory"));
		String str1=new String("java string pool refers to collection of strings which are stored in heap memory");
		if(str.equals(str1)==true)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
