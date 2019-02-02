package practiceproblems;

public class ArmStrongNumber {

	public static void main(String[] args) {
	
		
		
		ArmStrongNumber ARN=new ArmStrongNumber();
		System.out.println("Prime number   "+ARN.armStrong(153));
		System.out.println("Prime number   "+ARN.armStrong(237));

	}

	boolean armStrong(int n)
	{
		boolean armstrongNumber=true;
		
		int n1=n;
		int armstrong=0;
		
		while(n>0)
		{
			int a=n%10;
			armstrong=armstrong+a*a*a;
			n=n/10;
		}
		
		if(n1!=armstrong)
		{
			armstrongNumber=false;
			return armstrongNumber;
			
		}
		return armstrongNumber;
		
	}
	
}
