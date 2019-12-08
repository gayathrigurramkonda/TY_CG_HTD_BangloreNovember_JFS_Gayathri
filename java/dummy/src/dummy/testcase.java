package dummy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcase {

	@Test
	void test() {
		mavenadd m1=new mavenadd();
		int m=m1.add(5, 6);
		assertEquals(11,m);
	}

}
