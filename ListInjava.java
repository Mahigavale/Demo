package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInjava {

	public static void main(String[] args) {
	
		
		List<Employee> Hcl=new ArrayList<Employee>();
		
		
		Employee e=new Employee();
		e.setId(45);
		e.setName("Prashant");
		
		Hcl.add(new Employee(23,"Mahesh"));
		
		Hcl.add(e);
		
		for(Employee E3 :Hcl)
		{
			
			Employee E4=new Employee();
			E4=E3;
			
			System.out.println(E3.id);
			System.out.println(E3.name);
			System.out.println("*************************");
		}
		
		

		Iterator<Employee> HclIt=Hcl.iterator();
		
		while(HclIt.hasNext())
		{
			//System.out.println(HclIt.next());
			
			Employee e4=new Employee();
			e4=HclIt.next();
			System.out.println(e4.getId());
			System.out.println(e4.getName());
			System.out.println("***********************");
		}
	}

}
