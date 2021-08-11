import java.util.Scanner;

class bank{
	public int amount(int amt) {
		return 0;
	}
}
class savingsacc extends bank{
	int amt;
	public int amount(int amt){
		this.amt=amt;
		return amt;
	}
}
class currentacc extends bank{
	int amt;
	public int amount(int amt) {
		this.amt=amt;
		return amt;
	}
}

public class question3 {
  public static void main(String args[]){
	  savingsacc s=new savingsacc();
	  currentacc c=new currentacc();
	  Scanner sc=new Scanner(System.in);
	  int savings=sc.nextInt();
	  int current=sc.nextInt();
	  int sum=s.amount(savings)+c.amount(current);

	  System.out.println("total cash in bank:"+sum);
  }
}