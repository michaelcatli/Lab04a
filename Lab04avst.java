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
		double u = Math.pow((1+mrate),numMonths);
		double monthlyPayment = (Math.round(100*principal * ((mrate * u)/(u - 1))));
		System.out.println("Monthly Payment: $" + monthlyPayment/100);
		double totalPayments = numMonths*monthlyPayment/100;
		System.out.println("Total Payments: $" + totalPayments);
		System.out.println("Total Interest: $" + (totalPayments - principal));
	}
}
