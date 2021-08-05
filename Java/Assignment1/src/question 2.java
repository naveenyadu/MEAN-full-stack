import java.util.Scanner;

public class Armstrong {

	   public static void main(String args[])
	    {
	        int n, a, b, i, rem, temp, count=0;
	        Scanner sc = new Scanner(System.in);
			
	        System.out.print("Enter Starting Number :  ");
	        a = sc.nextInt();
	        System.out.print("Enter Ending Number :  ");
	        b = sc.nextInt();
			
	       
	        for(i=a+1; i<b; i++)
	        {
	            temp = i;
	            n = 0;
	            while(temp != 0)
	            {
	                rem = temp%10;
	                n = n + rem*rem*rem;
	                temp = temp/10;
	            }
	            if(i == n)
	            {
	                if(count == 0)
	                {
	                    System.out.print("Armstrong Numbers Between the Given Interval are : \n");
	                }
	                System.out.print(i + "  ");
	                count++;
	            }
	        }
	        if(count == 0)
	        {
	            System.out.print("Armstrong Number not Found between the Given Interval.");
	        }
	    }
	}


