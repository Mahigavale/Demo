package Collection;

public class Employee {

	
	
	int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;

	public Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public Employee()
	{
		
	}
	
}
