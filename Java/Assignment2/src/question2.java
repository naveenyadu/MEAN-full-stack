import java.util.Scanner;
class Employee
{
	public void salary() {
		
	}
}
class manager extends Employee
{
	public void salary() {
		double incentives,totSalary,n,total;;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter salary");
                   totSalary=sc.nextDouble();
                   
                   System.out.println("enter the incentives");
                   incentives=sc.nextDouble();
                   totSalary=totSalary+incentives;
                   System.out.println("enter the number of managers");
                   n=sc.nextDouble();
                   total=n*totSalary;
        
	     System.out.println("Total Salary for manager is "+totSalary);
	     System.out.println("Total Salary of all managers "+total);
                   }
	}

class labour extends Employee
{
	public void salary() {
		double overtime,ovamt,totSalary,n,total;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter salary");
                   totSalary=sc.nextDouble();
                   
                   System.out.println("enter the overtime hours");
                   overtime=sc.nextDouble();
                   System.out.println("enter the overtime amunt per hour");
                   ovamt=sc.nextDouble();
                   totSalary=totSalary+(overtime*ovamt);
                   System.out.println("enter the number of labours");
                   n=sc.nextDouble();
                   total=n*totSalary;
                   
                   
        
	     System.out.println("Total Salary for labour is "+totSalary);
	     System.out.println("Total Salary of all labours"+total);
	     
}
}
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager obj=new manager();
		obj.salary();
		labour obj1=new labour();
		obj1.salary();

	}

}
