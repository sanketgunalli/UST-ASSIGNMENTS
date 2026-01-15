package assignment8;

public class App8 {

	public static void main(String[] args) {
		Notification n;
		n = new EmailNotification();
		n.send();
		n = new SMSNotification();
		n.send();
		n = new Notification();
		n.send();
	}

}