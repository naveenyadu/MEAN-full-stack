import java.util.Scanner;

public class search {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n,num,i;
         int a[]=new int[100];
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the number of elements");
         n=s.nextInt();
         System.out.println("Enter"+n+"elements");
         for(i=0;i<n;i++)
         {
        	 a[i]=s.nextInt();
         }
         System.out.println("Enter element to be searched");
         num=s.nextInt();
         for(i=0;i<n;i++)
         {
        	 if(num==a[i])
             {
            	 System.out.println(num +" is present at position" + i);
            	 break;
             }	 
         }
         if(i==n)
         {
        	 System.out.println(num +"is not present in array");
         }
	}
}
