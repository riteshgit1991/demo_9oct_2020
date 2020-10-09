package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {

	public static void main(String[] args) {
		
		//Fail Fast	
        ArrayList<Integer> al = new ArrayList<>(); 
        al.add(1); 
        al.add(2); 
        al.add(3); 
        al.add(4); 
        al.add(5); 
  
        Iterator<Integer> itr = al.iterator(); 
        while (itr.hasNext()) { 
            if (itr.next() == 2) { 
                //al.remove(2);
            } 
        }
        
        //Fail safe
        
        CopyOnWriteArrayList<Integer> obj = new CopyOnWriteArrayList<Integer>();
        obj.add(1); 
        obj.add(2); 
        obj.add(3); 
        obj.add(4); 
        obj.add(5); 
        
        for(Integer i : obj) {
        	
        	if(i==2) {
        		obj.remove(2);
        	}
        }
	}

}
