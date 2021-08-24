import static org.junit.Assert.assertThrows;

import org.junit.Test;



class question3test {

	@Test
	void test() {
		question3 ob= new question3(15000);
		assertThrows(InsufficientFundsException.class, () -> ob.withdraw(20000));
	}

}