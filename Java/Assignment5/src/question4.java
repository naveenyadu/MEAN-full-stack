class pair<key,value>{
	private key Key;
	private value Value;
	
	public pair(key Key,value Value) {
		this.Key=Key;
		this.Value=Value;
	}
	public pair() {
		// TODO Auto-generated constructor stub
	}
	public key getKey() {
		return Key;
	}
	public value getValue() {
		return Value;
	}
	public void setKey(key Key)
	{
		this.Key=Key;
	}
	public void setValue(value Value)
	{
		this.Value=Value;
	}
    public String toString()
    {
    	return "(" + Key + ", " + Value + ")";
    }
}
public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pair<String, String> p1 = null, p2 = null;

        p1 = new pair<String, String>( "1", "Hello");
        p2 = new pair<String, String>( "2", "Hi" );

        System.out.println( "first pair = " + p1 );
        System.out.println( "second pair = " + p2 );
        
           
           
	}

}
