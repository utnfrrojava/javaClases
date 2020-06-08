package entities;

import java.util.Comparator;

public class PersonLexicographicComparator implements Comparator<Person> {
	
	 @Override
	 public int compare(Person p1, Person p2) {
	    int res=p1.getApellido().compareToIgnoreCase(p2.getApellido());
	    if (res==0) {
	    	res=p1.getNombre().compareToIgnoreCase(p2.getNombre());
	    	if (res==0) {
	    		res=p1.getDni()-p2.getDni();
	    	}
	    }
	    return res;
	    
	}

}
