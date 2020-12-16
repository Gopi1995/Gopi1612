package org.browserlaunch;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UserDefined {

	public static void main(String[] args) {
		
		Set<Encapsulation> en=new LinkedHashSet<Encapsulation>();
		
		Encapsulation e1=new Encapsulation();
		e1.setId(4141);
		e1.setName("Gopinath");
		e1.setSalary(50000f);
		
		
		Encapsulation e2=new Encapsulation();
		e2.setId(1255);
		e2.setName("Vijay");
		e2.setSalary(5545f);
		
		Encapsulation e3=new Encapsulation();
		e3.setId(7896);
		e3.setName("Ajith");
		e3.setSalary(7889f);
		
		en.add(e1);
		en.add(e2);
		en.add(e3);
	
		
		for(Encapsulation e:en)
		{
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
		}
	}

}
