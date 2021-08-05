import java.util.Scanner;

public class Armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp, num=0, r;
        
		
        System.out.print("Enter the number ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
		
        temp = n;
		
        while(temp!= 0)
        {
            r = temp%10;
            num = num + r*r*r;
            temp= temp/10;
        }
        if(num == n)
        {
            System.out.print("Armstrong Number");
        }
        else
        {
            System.out.print("Not an Armstrong Number");
        }

	}

}
