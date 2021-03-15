import java.math.BigDecimal;
import java.util.ArrayList;

public class SortEmployeesBasedonSalaries {
	class Employee{
		  int id;
		  String name;
		  BigDecimal Salary ;

		public Employee(int id,String name,int i) {
		}
		public void main(String[] args) {
			ArrayList<Employee> al = new ArrayList<Employee>();
			al.add(new Employee(10,"Ram",5000));
			al.add(new Employee(11,"Jon",4000));
			al.add(new Employee(12,"Tim",6000));
			for (Employee eachEmployee : al) {
				System.out.println(eachEmployee);
			}
		}
	

				public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public BigDecimal getSalary() {
			return Salary;
		}

		public void setSalary(BigDecimal salary) {
			Salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
		}
		
}
}
