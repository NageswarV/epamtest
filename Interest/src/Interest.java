class Interest
{
	public double simpleInterest(double amount,double rateOfInterest,double time)
	{
	double simple_interest;
	simple_interest=amount+amount*rateOfInterest*time/100;
	return simple_interest;
	}
	public double compoundInterest(double amount,double rateOfInterest,double time)
	{
	double compound_interest;
	compound_interest=amount*Math.pow(1+rateOfInterest,time);
	return compound_interest;
	}
}