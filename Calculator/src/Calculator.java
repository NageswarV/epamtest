class Calculator
{
public double addition(double ... numbers)
{
   double sum=0;
   for(double current_number : numbers)
	sum+=current_number;
   return sum;
}
public double multiply(double ... numbers)
{
	double product=1;
	for(double current_number : numbers)
		product*=current_number;
	return product;
}
public double divide(double dividend,double divisor)
{
	try{
		return dividend/divisor;
	}
	catch(ArithmeticException ae)
	{
	ae.printStackTrace();
	return -1;
	}
}
}
