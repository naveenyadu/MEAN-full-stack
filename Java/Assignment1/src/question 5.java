import java.util.Scanner;

public class incometax {

	public static void main(String[] args) {
            double CTC,taxamt;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the income");
            CTC=s.nextDouble();
            if(CTC>0 && CTC <180000)
            {
            	taxamt=0;
            	System.out.println("The tax amount is"+ taxamt);
            }
            else if(CTC>181001 && CTC<300000)
            {
            	taxamt=0.1*CTC;
            	System.out.println("The tax amount is"+ taxamt);
            }
            else if(CTC>300001 && CTC<500000)
            {
            	taxamt=0.2*CTC;
            	System.out.println("The tax amount is"+ taxamt);
            }
            else if(CTC>500001 && CTC<1000000)
            {
            	taxamt=0.3*CTC;
            	System.out.println("The tax amount is"+ taxamt);
            }
            else {
            	System.out.println("Not valid");
            }
     }
}
