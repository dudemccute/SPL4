
public class ParkgarageLevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int parkplaetze = 10;
		int autos = 4;
		String parken ="6 2 -6 3 4 -3 -4 -2";
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
	    	System.out.println("Es parken" +autogarage);
	    }

	}

}
