package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Emp11{
	
	private int eid;
	private String ename;
	
	public Emp11(int eid, String ename) {
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
}


class SortByEmpName implements Comparator<Map.Entry<Emp11, String>>{

	

	@Override
	public int compare(Entry o1, Entry o2) {
		// TODO Auto-generated method stub
		Emp11 e11 = (Emp11) o1.getKey();
		Emp11 e12 = (Emp11) o2.getKey();
		return e11.getEname().compareTo(e12.getEname());
	}
	
}

public class SortMapKeyByComparator {

	public static void main(String[] args) {
		
		Emp11 e1 = new Emp11(100,"Ritesh");
		Emp11 e2 = new Emp11(101,"Tom");
		Emp11 e3 = new Emp11(102,"Anil");
		
		Map<Emp11,String> map = new HashMap<Emp11,String>();
		map.put(e1,"r1");
		map.put(e2,"r2");
		map.put(e3,"r3");
		map.forEach((k,v)->System.out.println(k.getEname() +" "+v));	
		
		Set<Map.Entry<Emp11, String>> entry = map.entrySet();
		
		doSorting(entry);
		
		
	}
	
	public static Map<Emp,String> doSorting(Set<Map.Entry<Emp11, String>> entry){
		
		
		LinkedList<Map.Entry<Emp11, String>> list = new LinkedList<Map.Entry<Emp11,String>>(entry);
		
		Collections.sort(list, new SortByEmpName());
		
		for(Map.Entry<Emp11, String> entr :list) {
			System.out.println(entr.getKey().getEname());
		}
		
		return null;
		
		
	}
	
}
