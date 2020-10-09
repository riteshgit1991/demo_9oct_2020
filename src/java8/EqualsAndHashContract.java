package java8;


class Emp{
	
	private int eid;
	private String ename;
	
	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public boolean equals(Object obj) {
		
		if(obj==null) {
			return false;
		}
		if(obj.getClass()!=this.getClass()) {
			return false;
		}
		Emp e = (Emp)obj;
		if(e.getEid()==this.getEid()) {
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		
		return this.eid;
	}
	
	
}

public class EqualsAndHashContract {

	public static void main(String[] args) {
		
	Emp e1 = new Emp(101, "Ritesh");	
	Emp e2 = new Emp(101, "Ritesh");	

	System.out.println(e1==e2);
	System.out.println(e1.equals(e2));
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	
	}
}
