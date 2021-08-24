import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class question2test extends question2{

	@Test
	public void test1() {
		question2test ob= new question2test();
		int[] x= {5, 4, 87, 54 ,63 ,41 ,24 ,84 ,91};
		
		assertEquals(new Find(4, 91), ob.findMinMax(x));
	}
	
	@Test
	public void test2() {
		question2test ob= new question2test();
		int[] x= {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
		
		assertEquals(new Find(5, 5), ob.findMinMax(x));
	}
	
	@Test
	public void test3() {
		question2test ob= new question2test();
		int[] x= {-5, -4, -87, -54, -63, -41, -24, -84, -91};
		
		assertEquals(new Find(-91, -4), ob.findMinMax(x));
	}

}