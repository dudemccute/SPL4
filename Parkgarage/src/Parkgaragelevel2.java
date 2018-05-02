import java.util.ArrayList;

public class Parkgaragelevel2 {

	public static void main(String[] args) {

		int n = 2;
		int autos = 4;

		String parken = "1 2 -1 3 4 -3 -4 -2";
		String[] parkvorgaenge = parken.split(" ");

		int autosInGarage = 0;
		int maxAutos = 0;
		int maxAutosWarteliste = 0;

		ArrayList<Integer> warteliste = new ArrayList<Integer>();

		for (int i = 0; i < parkvorgaenge.length; i++) {
			int parker = Integer.parseInt(parkvorgaenge[i]);

			if (parker < 0) {
				autosInGarage--;
				if (warteliste.size() > 0) {
					System.out.println("Warteliste grosse " + warteliste.size());
					warteliste.remove(0);
					autosInGarage++;
				}
			} else if (parker > 0) { // einparken
				if (autosInGarage == n) {
					warteliste.add(parker);
				} else {
					autosInGarage++;
				}
			}
			
			if (maxAutos < autosInGarage) {
				maxAutos = autosInGarage;
			}
			if (maxAutosWarteliste < warteliste.size()) {
				maxAutosWarteliste = warteliste.size();
			}
			System.out.println("So viele Autos sind zurzeit in der Garage " + autosInGarage);
			System.out.println("Warteliste " + warteliste.size());
		}
		System.out.println("Maximale Anzahl an Autos: " + maxAutos);
	}
}