import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

class question1test {

	@Test
	void test1() {
		question1 ob= new question1();
		int[] x= {5, 4, 87, 54 ,63 ,41 ,24 ,84 ,91};
		int[] res= {4, 91};
		assertArrayEquals(res, ob.findMinMax(x));
	}
	
	@Test
	void test2() {
		question1 ob= new question1();
		int[] x= {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
		int[] res= {5, 5};
		assertArrayEquals(res, ob.findMinMax(x));
	}
	
	@Test
	void test3() {
		question1 ob= new question1();
		int[] x= {-5, -4, -87, -54, -63, -41, -24, -84, -91};
		int[] res= {-91, -4};
		assertArrayEquals(res, ob.findMinMax(x));
	}

}