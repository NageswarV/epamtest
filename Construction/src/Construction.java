class Construction {

	public double cost(int choice,double square_ft)
	{	
	switch(choice){
		case 1 : return square_ft*1200;
		case 2 : return square_ft*1500;
		case 3 : return square_ft*1800;
		default : return square_ft*2500;
		}
	}
}