import java.util.HashMap;
import java.util.Map;

public class question7 {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(200,"Naveen");
		map.put(201,"Yadav");
		map.put(202,"Gongati");
		
		System.out.println(map);
		
		StringBuilder SB=new StringBuilder("");
		for(Map.Entry m:map.entrySet()) {
			SB.append(m.getKey());
			SB.append(m.getValue());
		}
		System.out.println(SB);
	}
}
