
public class ParkgarageLevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int parkplaetze = 100;
		int autos = 100;
		String parken ="91 -91 93 74 -93 -74 16 -16 36 -36 83 63 49 -49 37 -63 -37 -83 66 60 27 -27 -66 -60 10 -10 51 89 45 12 29 -12 94 -89 90 -45 -90 92 40 -92 -40 -51 46 47 32 -47 -32 53 -46 7 54 -94 71 -71 62 34 13 -7 30 -53 61 35 14 -29 -54 6 -13 84 23 25 -84 -61 -35 -25 2 -30 -23 55 42 -6 69 -62 58 -69 22 100 65 -58 -55 -65 80 57 -80 -14 67 68 86 -57 -86 15 17 33 77 -42 -77 -17 -100 -2 87 -34 -15 -68 -33 -22 43 72 -87 -72 41 -67 5 50 11 -5 8 -43 21 -11 3 -41 79 75 78 85 -75 52 -3 24 95 -50 -85 -24 -52 -8 28 76 56 -95 18 -28 59 -78 -79 -59 19 -18 1 73 -21 26 82 4 -73 -19 81 96 -96 -4 97 70 64 44 48 -81 -48 9 20 39 98 31 -82 99 88 -98 38 -31 -99 -56 -76 -44 -38 -20 -70 -1 -64 -88 -97 -9 -26 -39";
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
