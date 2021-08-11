import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a,b,c;
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter the first number: ");
			a=s.nextInt();
			
			System.out.println("Enter the first number: ");
			b=s.nextInt();
			
			c=a/b;
			System.out.println("Result after dividing: "+c);
			c=s.nextInt();
		
			
		}
      catch(UnsupportedOperationException e){
    	  e.printStackTrace();
      }
	}

}