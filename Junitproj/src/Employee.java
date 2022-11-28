import java.util.ArrayList;
public class Employee {
	public String findName(ArrayList employees,String name) {
		String result="";
		if(employees.contains(name))
			result="Found";
		else
			result="Not Found";
		return result;
		
	}

}
