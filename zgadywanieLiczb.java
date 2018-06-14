
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class zgadywanieLiczb {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner	scan = new	Scanner(System.in);
		boolean wynik = false;
		Random rand = new Random();
		int liczba = rand.nextInt(100);

		while(wynik==false)
		{
			System.out.print("Zgadnij liczbę ");
			String zgadnij = scan.next();

			if (isInt(zgadnij)==true) {		    		    
				if(Integer.parseInt(zgadnij)==liczba)
				{
					System.out.println("Znalazłeś szukaną liczbę!!!");
					wynik=true;
				} 
				else if (Integer.parseInt(zgadnij)>liczba)
				{
					System.out.println("Za dużo!");
					wynik=false;
				} 
				else if (Integer.parseInt(zgadnij)<liczba)
				{
					System.out.println("Za mało!");
					wynik=false;
				} 
			} else {
				System.out.println("To nie jest liczba.");
			}
		}		
	}

	public static boolean isInt(String str) {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
