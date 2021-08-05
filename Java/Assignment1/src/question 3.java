import java.util.Scanner;

public class simpleandcompund {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         float p;
         double t;
         float r;
         double simpleinterest,compoundinterest;
         Scanner c=new Scanner(System.in);
         System.out.println("Enter the value of p");
         p=c.nextFloat();
         System.out.println("Enter the value of r");
         r=c.nextFloat();
         System.out.println("Enter the value of t");
         t=c.nextDouble();
         simpleinterest=(p*t*r)/100;
         System.out.println("The simple interest is" + simpleinterest);
         compoundinterest=p*Math.pow(1.0+r/100.0,t)-p;
         System.out.println("The compound interest is"+ compoundinterest);
	}

}
