import java.math.BigDecimal;
import java.util.ArrayList;

public class Employee {

	public Employee(int id,String name,int i) {
	}

	public static void main(String[] args) {
			ArrayList<Employee> al = new ArrayList<Employee>();
			al.add(new Employee(10,"Ram",5000));
			al.add(new Employee(11,"Jon",4000));
			al.add(new Employee(12,"Tim",6000));
			for (Employee eachEmployee : al) {
				System.out.println(eachEmployee);
			}
		}
	
	

}
