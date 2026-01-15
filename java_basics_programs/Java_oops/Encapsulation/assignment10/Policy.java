package assignment10;

public class Policy {
	private int policyId;
	private double premium;
	
	public void setPolicyDetails(int policyId,int age) {
		this.policyId = policyId;
		if(age < 25){
			premium = 30000;
		}
		else if(age <=40) {
			premium = 20000;
		}
		else {
			premium = 15000;
		}
	}
	public void displayPolicy() {
		System.out.println("Policy ID "+policyId);
		System.out.println("Premium Amount "+premium);
	}
}