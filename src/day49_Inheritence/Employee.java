package day49_Inheritence;

public class Employee {
//if a class does not extends another class explicitly
// it will extends a class called Object implicitly
// Override - redifine
	private String title;
	private int id;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "spartan"; //"Employee [title=" + title + ", id=" + id + "]";
	}
	
	
	

}
