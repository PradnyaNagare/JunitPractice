import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void test() {
			Demo2 obj=new Demo2();
			assertEquals("Result:", true, obj.pallindromeCheck("malayalam"));
			assertEquals("Result:", false, obj.pallindromeCheck("kerala"));
	        assertTrue("Result: ", obj.pallindromeCheck("nayan"));
	        assertTrue("Result: ", obj.pallindromeCheck("madam"));
	        assertFalse("Result: ", obj.pallindromeCheck("kerala"));
	        assertFalse("Result: ", obj.pallindromeCheck("india"));
	}

}
