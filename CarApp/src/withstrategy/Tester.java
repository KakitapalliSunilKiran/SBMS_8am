package withstrategy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Employee
{
	int id;
	String name;
	double salary;
	String departName;
	Employee(int id,String name,double salry,String departName ){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.departName=departName;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	
}
public class Tester {
	
	public static void main(String args[]) {
		     List<Employee> al = Arrays.asList(new Employee(10,"sunil",40000,"depatA"),
				new Employee(20,"sunil",40000,"depatA"),
						new Employee(10,"sunil",40000,"depatB")
				);
		   //  al.stream().collect(Collectors.groupingBy())
		     HashMap<String,Integer> hm = new HashMap<>();
		     for(Employee e: al) {
		    	 if(hm.containsKey(e.getDepartName())) {
		    		 double exiting = hm.get(e.getDepartName())
		    	 }
		     }
		
		
		
	}

}
