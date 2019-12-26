package compare;

public class employee {
	private String name;
	private int id;
	public employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + "]";
	}
	@Override
	public boolean equals(Object o) {
		employee e = (employee)o;
		//return (this.id==e.id);
		return (this.hashCode()==e.hashCode());
	}
	@Override
	public int hashCode() {
		return (this.id)/12;
	}
	
	

}
