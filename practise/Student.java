package practise;

 public class Student {

  String name;
  int id;
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


	public static void main(String[] args) {
		
		Student s=new Student();
	    s.setName("vishal rana");
	    System.out.println(s.getName());
	    s.setId(12);
	    System.out.println(s.getId());
	    
	}
}











