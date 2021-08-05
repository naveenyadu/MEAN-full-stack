import java.util.Scanner;

public class supplymarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int m1,m2,m3,total;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the m1 value");
         m1=s.nextInt();
         System.out.println("Enter the m2 value");
         m2=s.nextInt();
         System.out.println("Enter the m3 value");
         m3=s.nextInt();
         total=m1+m2+m3;
         if(m1>60 && m2>60 && m3>60)
         {
        	 System.out.println("Passed");
         }
         if((m1>60 && m2>60) || (m2>60 && m3>60) || (m3>60 && m1>60))
         {
        	 System.out.println("Promoted");
         }
         if((m1>60 && m2<60) && m3<60 || (m1<60 && m2>60 && m3<60) || (m1<60 && m2<60 && m3>60) || (m1<60 && m2<60 && m3<60))
         {
        	 System.out.println("Failed");
         }
	}

}
