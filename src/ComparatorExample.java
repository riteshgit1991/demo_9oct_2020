import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp{
	
	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public Emp(int eid, String ename, int rating) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.rating = rating;
	}

	private int eid;
	private String ename;
	private int rating;
	
	
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
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
	}

class CompareByEmpName implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getEname().compareTo(o2.getEname());
	}
}

class SortByEmpID implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getEid()-o2.getEid();
	}
}


public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Emp> listemp = new ArrayList<Emp>();
		listemp.add(new Emp(4, "Ritesh",1));
		listemp.add(new Emp(2, "Jai",5));
		listemp.add(new Emp(3, "Anil",4));	
		listemp.add(new Emp(3, "Anil",3));
		
		//Collections.sort(listemp, new SortByEmpID());
		//listemp.forEach((x)->System.out.println(x.getEname()));
		
		Collections.sort(listemp, new Comparator<Emp>() {
			public int compare(Emp e1, Emp e2) {
				return e2.getRating()-e1.getRating();
			}
		});
		
		
		Collections.sort(listemp, (o1,o2)->{
			return o1.getRating()-o2.getRating();
		});
		
		listemp.forEach((x)->System.out.println(x.getRating()));
		
	}

}
