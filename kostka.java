package kostka;

import java.util.Random;
import java.util.Scanner;

public class kostka {

	public static void main(String[] args) {

		kostka();
	}

	static void kostka() {

		System.out.println("Podaj ile razy chcialbys rzucic kostka oraz jakim jej rodzajem w formacie'xDy+z'");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		Random r = new Random(); 

		if(str.startsWith("D")&& !str.contains("-")&& !str.contains("+")) {

			int throwerI = 1;

			String wym = str.substring((str.indexOf("D")+1));
			int wymI = Integer.parseInt(wym);

			int a = r.nextInt(wymI);
			System.out.println("wyrzuciles w "+ throwerI + " rzucie liczbe oczek : " + a);		
		}

		if(!str.startsWith("D") && !str.contains("+") &&  !str.contains("-")) {

			String thrower = str.substring(0,str.indexOf("D"));
			int throwerI = Integer.parseInt(thrower);

			String wym = str.substring((str.indexOf("D")+1));
			int wymI = Integer.parseInt(wym);
			int[] arr = new int[throwerI];
			int a = 0;
			for(int i = 0; i<throwerI; i++) {
				arr[i] = r.nextInt(wymI);
				a = a + arr[i];
			}		
			System.out.println("wyrzuciles w "+ throwerI + " rzutach sume oczek:" +a);		
		}

		if(str.startsWith("D") && str.contains("+") ) {

			int throwerI = 1;

			String wym = str.substring((str.indexOf("D")+1),str.indexOf("+"));
			int wymI = Integer.parseInt(wym);

			String opc = str.substring((str.indexOf("+")+1),str.length());
			int opcI = Integer.parseInt(opc);
			int a = r.nextInt(wymI);
			int results = a+opcI;
			System.out.println("wyrzuciles w "+ throwerI + " rzucie liczbe oczek plus wartosc opcjonalna: " +results);		
		}

		if(str.startsWith("D") && str.contains("-") ) {

			int throwerI = 1;

			String wym = str.substring((str.indexOf("D")+1),str.indexOf("-"));
			int wymI = Integer.parseInt(wym);

			String opc = str.substring((str.indexOf("-")+1),str.length());
			int opcI = Integer.parseInt(opc);
			int a = r.nextInt(wymI);

			int results = a-opcI;
			System.out.println("wyrzuciles w "+ throwerI + " rzucie liczbe oczek minus wartosc opcjonalna: " +results);		
		}

		if(!str.startsWith("D") && str.contains("+") ) {

			String thrower = str.substring(0,str.indexOf("D"));
			int throwerI = Integer.parseInt(thrower);

			String wym = str.substring((str.indexOf("D")+1),str.indexOf("+"));
			int wymI = Integer.parseInt(wym);

			String opc = str.substring((str.indexOf("+")+1),str.length());
			int opcI = Integer.parseInt(opc);

			int[] arr = new int[throwerI];
			int a = 0;
			for(int i = 0; i<throwerI; i++) {
				arr[i] = r.nextInt(wymI);
				a = a + arr[i];
			}		
			int results = a+opcI;
			System.out.println("wyrzuciles w "+ throwerI + " rzutach sume oczek plus war.opcjonalna:" +results);		
		}

		if(!str.startsWith("D") && str.contains("-") ) {

			String thrower = str.substring(0,str.indexOf("D"));
			int throwerI = Integer.parseInt(thrower);

			String wym = str.substring((str.indexOf("D")+1),str.indexOf("-"));
			int wymI = Integer.parseInt(wym);

			String opc = str.substring((str.indexOf("-")+1),str.length());
			int opcI = Integer.parseInt(opc);

			int[] arr = new int[throwerI];
			int a = 0;
			for(int i = 0; i<throwerI; i++) {
				arr[i] = r.nextInt(wymI);
				a = a + arr[i];
			}		
			int results = a-opcI;
			System.out.println("wyrzuciles w "+ throwerI + " rzutach sume oczek minus war.opcjonalna:" +results);		
		}
		scan.close();
	}

}
