package assignment6;

public class Customer {
	private String name;
	private int age;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age>=18) {
			this.age = age;
		}
		else {
			System.out.println("Age must be above 18");
		}
	}
	public String cusInfo() {
		return "Customer Name: "+name+" ,Age: "+age;
	}
	

}