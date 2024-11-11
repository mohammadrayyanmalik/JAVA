package Practice2;


public class Category1 {

	private int id; 
	private String name;
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
	@Override
	public String toString() {
		return "Category1 [id=" + id + ", name=" + name + "]";
	}
	public Category1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Category1() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
