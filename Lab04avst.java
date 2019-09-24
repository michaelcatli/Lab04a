// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
	public static void main(String[] args)
	{
		System.out.println("Lab04a, Student Version\n");

		double principal  = 250000;
		double annualRate = .0485;
		double mrate = annualRate/12;
		double numYears   = 30;
		double numMonths = numYears*12;
		System.out.println("Principal: $"+principal);
		System.out.println("Annual rate: " + (annualRate*10*10) + "%");
		System.out.println("Number of years: " + numYears);
		double u = Math.pow((1+annualRate),numMonths);
		double monthlyPayment = principal * ((mrate * u)/(u - 1));
		System.out.println("Monthly Payment: $" + monthlyPayment);
	}
}
