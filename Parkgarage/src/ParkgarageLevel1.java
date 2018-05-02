
public class ParkgarageLevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int parkplaetze = 100;
		int autos = 100;
		String parken ="19 -19 11 -11 1 -1 17 -17 10 7 -10 -7 3 14 -14 -3 13 -13 4 12 20 18 6 16 -18 -12 -16 5 -5 -20 -6 -4 8 15 -8 2 -15 9 -2 -9";
	    String[] parkvorgaenge = parken.split(" ");
	    int autogarage = 0;
	    int maxautos = 0;
	    

	
	    for (int p=0; p < parkvorgaenge.length; p++) {
		    int parker = Integer.parseInt(parkvorgaenge[p]);
	    	if(parker > 0)
	    	{
	    	 autogarage++;
	    	}
	    	else if(parker < 0)
	    	{
	    	autogarage--;	
	    	}
	    	else 
	    	{
	    	System.out.println("Etwas ist falsch");
	   
	    	}
	    	if(maxautos < autogarage)
	    	{
	    	  maxautos = autogarage;
	    	}
	    	System.out.println("Es parken" + autogarage);
	    	}
	    	System.out.println("Maximale Anzahl " +maxautos);
	    

	}

}
