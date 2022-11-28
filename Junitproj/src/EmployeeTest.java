
import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.BeforeClass;


public class EmployeeTest {
	static Employee emp1=null;
	static ArrayList<String>arr;
	@BeforeClass
	public static void setUpBeforeClass()throws Exception{
		arr=new ArrayList<>(Arrays.asList("Java","Python","PHP","Javascript","Ruby"));
		emp1=new Employee();
	}
	
	@Test
	 public void testFindName() {
		String res1=emp1.findName(arr,"Scala");
		assertEquals("Result not Found","Not Found",res1);
		String res2=emp1.findName(arr,"Python");
		assertEquals("Result is Found","Found",res2);
	}

}
