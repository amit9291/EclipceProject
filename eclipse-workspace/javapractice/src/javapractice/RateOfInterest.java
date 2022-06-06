package javapractice;
interface Bank{
	float rateOfinterest();
}
class SBI implements Bank{
	public float rateOfinterest() {return 9.15f;}
}
class BOI implements Bank{
	public float rateOfinterest() {return 7.5f;}
}
public class RateOfInterest {

	public static void main(String[] args) {
		
		Bank b = new SBI();
		Bank b1 = new BOI();
	System.out.println("ROI of SBI:" +	b.rateOfinterest());
    System.out.println("ROI of BOI:" + b1.rateOfinterest());

	}

}
