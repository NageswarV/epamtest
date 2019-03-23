// client Application for estimation of Construction Cost
import java.util.Scanner;
class ClientAppConstruction
{
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	Construction construct=new Construction();
	System.out.println("\tUSER MENU");
	System.out.println("1.Standard Material.\n2.Above Standard Material.");
	System.out.println("3.High Standard Material.\n4.Highly Standard Material With Fully Automated Home.");
	System.out.println("Enter your choice");
	int choice=scan.nextInt();
	System.out.println("Enter area in square feet");
	double area=scan.nextDouble();
	double cost=construct.cost(choice,area);
	System.out.println(cost);
}
}
