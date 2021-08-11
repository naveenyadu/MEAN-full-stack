import java.util.Scanner;
abstract class Persistence{
	abstract void persist();
}
class FilePersistence extends Persistence{
	void persist() {
		System.out.println("file persisted");
	}
}
class DatabasePersistence extends Persistence{
	void persist() {
		System.out.println("database persisted");
	}
}
public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("data is saved in(select either file or database):");
		String s=sc.nextLine();
		FilePersistence f=new FilePersistence();
		DatabasePersistence d=new DatabasePersistence();
		if(s.contentEquals("file")){
			f.persist();
		}
		else{
			d.persist();
		}
        
	}

}
