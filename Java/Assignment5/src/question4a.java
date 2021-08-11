import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
class pair<key,date>{
	private key Key;
	private date Date;
	
	public pair(key Key,date Date) {
		this.Key=Key;
		this.Date=Date;
	}
	public pair() {
		// TODO Auto-generated constructor stub
	}
	public key getKey() {
		return Key;
	}
	public date getDate() {
		
		return Date;
	}
	public void setKey(key Key)
	{
		this.Key=Key;
	}
	public void setDate(date Date)
	{
		this.Date=Date;
	}
	
    public String toString()
    {
    	return "(" + Key + ", " + Date + ")";
    }
}
public class question4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pair<String, Date> p1 = null;
		java.util.Date javaDate = new java.util.Date();

        p1 = new pair<String,Date>( "Today is ", new java.util.Date());
       

        System.out.println( "first pair = " + p1 );
       
        
           
           
	}

	
	

}
