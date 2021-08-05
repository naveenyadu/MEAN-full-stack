import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
        int i = 0;
        // for (int i = 0; i <= 3; i++) {
        while (i < 3) {
        	Scanner s=new Scanner(System.in);
        	String user,pass;
        	System.out.println("Enter the username");
        	user=s.nextLine();
        	System.out.println("Enter the password");
        	pass=s.nextLine();
 
            
           
 
            
            if (user.equals("naveen") && (pass.equals("111"))) {
                System.out.println("Welcome zsa");
                break;
                
 
            }
 
            if (user != ("naveen") && (pass!=("111"))) {
            	System.out.println("Invalid User Name or password");
                ++counter;
                System.out.println(counter);
                
 
            }
 
 
                 if(counter>3) {
                	 System.out.println("You Inputed 3 wrong password/Username");
                	 
                     System.exit(0);
                 }
            	
            
 
        }
           

}
}