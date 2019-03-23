import java.util.Scanner;
class ClientAppInterest
{
public static void main(String args[])
{
	double output;
	Interest interest=new Interest();
	Scanner scan =new Scanner(System.in);

	System.out.println("enter principal amount\trateofInterest\ttime in years");
	double amount=scan.nextDouble();
	double rateofInterest =scan.nextDouble();
	double time =scan.nextDouble();

	output=interest.simpleInterest(amount,rateofInterest,time);//simple interest calculation
	System.out.println(output);
	output=interest.compoundInterest(amount,rateofInterest,time);
	System.out.println(output);
}
}