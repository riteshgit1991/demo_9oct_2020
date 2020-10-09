package collection;

import java.util.HashSet;

class Employee{
	
	private int eid;
	private String ename;
	
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	public int hashCode() {
		return this.eid*1000;
	}
	
	public boolean equals(Object obj) {
		
		if(obj==null) {
			return false;
		}
		
		if(obj.getClass()!= this.getClass()) {
			return false;
					
		}
		Employee emp1 = (Employee)obj;
		
		if(emp1.eid==this.eid) {
			return true;
		}
		
		return false;
		
	}
}


public class TestHashSet {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet<Employee>();
		hs.add(new Employee(1, "Ritesh"));
		hs.add(new Employee(1, "Ritesh"));
		
		System.out.println(hs.size());
		
		

	}

}
