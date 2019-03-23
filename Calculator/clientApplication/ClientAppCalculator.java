import java.util.Scanner;
class ClientAppCalculator
{
public static void main(String args[])
{
	double output;
	Calculator calculate=new Calculator();
	Scanner scan =new Scanner(System.in);

	System.out.println("enter first number");
	double number1=scan.nextDouble();	
	System.out.print("enter second nuber");
	double number2 =scan.nextDouble();
	System.out.println("enter thirdNumber");
	double number3 =scan.nextDouble();

	output=calculate.addition(number1,number2,number3);//calling addition with three arguments
	System.out.println(output);
	output=calculate.multiply(number1,number2,number3); // calling multiply method with three Arguments
	System.out.println(output);
	output=calculate.divide(number1,number2);//Calling divide method
	System.out.println(output); 
}
}