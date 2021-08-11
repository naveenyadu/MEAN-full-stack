import java.util.ArrayList;
import java.util.Scanner;
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstword, secondword;
        Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
        list.add("Lets");
        list.add("go");
        list.add("to");
        list.add("the");
        list.add("party");
        list.add("tonight");
        
         
        System.out.println("Enter the first word index :");
        firstword = sc.nextInt();

        System.out.println("Enter the second word index :");
        secondword = sc.nextInt();

        System.out.println("Original list before swap : "+list);

        String element = list.get(firstword);
        list.set(firstword, list.get(secondword));
        list.set(secondword, element);

        System.out.println("List after swap : "+list);
        

	}

}
