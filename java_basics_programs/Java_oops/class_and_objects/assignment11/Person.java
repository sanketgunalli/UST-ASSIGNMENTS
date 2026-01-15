package assignment11;

public class Person {
	String name;
	int age;

	Person(String name){
		this.name = name;
		System.out.println("Name: "+name);
	}
	Person(String name,int age){
		this(name);
		this.age = age;
		System.out.println("Age: "+age);
	}

	public static void main(String[] args) {
		Person p1 = new Person("Sairam");
		System.out.println();
		Person p2 = new Person("Sam",18);
	}

}