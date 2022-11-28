import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Demo1Test {

	@Test
	public void testStringConcat() {
		Demo1 d1=new Demo1();
		String s3=d1.stringConcat("Pradnya","Nagare");
		assertEquals("PradnyaNagare",s3);
	}

}
