package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInJava3 {

	public static void main(String[] args) {

		List<Student> st=new ArrayList<Student>();
		st.add(new Student(1,"mansi"));
		st.add(new Student(2,"mahesh"));
		st.add(new Student(3,"Ram"));
		
		Iterator<Student> itr=st.iterator();
		while(itr.hasNext())
		{
			Student st1=itr.next();
			System.out.println(st1.id);
			System.out.println(st1.name);
			System.out.println("*****************");
		}
		
	}

}
