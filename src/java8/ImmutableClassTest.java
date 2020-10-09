package java8;

class Address implements Cloneable{
	
	private String address;
	
	public Address(String address) {
		super();
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

  final class Student{
	  
	private final String name;	
	private final Address address; 
	
	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public Address getAddress() throws CloneNotSupportedException {
		return (Address)address.clone();
	}

	public String getName() {
		return name;
	}	
}


public class ImmutableClassTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s = new Student("Raj",new Address("Mumbai"));
		s.getAddress().setAddress("Pune");		
		System.out.println(s.getAddress().getAddress());

	}

}
