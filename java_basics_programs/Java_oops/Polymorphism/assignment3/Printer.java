package assignment3;

public class Printer {
	void print(int a) {
		System.out.println("Integer Value: "+a);
	}
	void print(String str) {
		System.out.println("String Value: "+str);
	}
	void print(int num,String str) {
		System.out.println("Integer: "+num +", String: "+str);
	}
}