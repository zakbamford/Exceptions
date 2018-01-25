package _02_gotta_catchem_all;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//Complete the methods in the ExceptionMethods class to make the tests pass

class ExceptionsTest {
	@Test
	public void testIndexOOBException() {
		int[] vars = {0, 1, 2, 3};
			
		try {
			vars[0] = 4;
			assertArrayEquals(vars, new int[] {4, 1, 2, 3});
			vars[4] = 5;
			fail("IndexOutOfBoundsException not thrown");
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			assertArrayEquals(vars, new int[] {4, 1, 2, 3});
		}
	}
	
	

}
