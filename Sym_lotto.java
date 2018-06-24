package symulator_lotto;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Sym_lotto {

	public static void main(String[] args) throws IOException {

		try {
			lotto();
		} catch (NumberFormatException e) {
			System.out.println("nie wprowadzaj spacji na poczatku ciagu znakow,oraz podwojnych pomiedzy nimi!");
			lotto();
		} 
	}
	static void lotto() {
		System.out.println("Podaj 6 liczb bez powtorzen z zakresu 0-49 do wylosowania w nastepujacym formacie: '1 2 3 4 5 6'");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		if(!StringUtils.isNumericSpace(str)) {
			System.out.println("ktoras z podanych wartosci nie jest liczba!");
			lotto();
		}
		String[] parts = str.split(" ");
		int[] arr = new int[parts.length];
		for (int i = 0; i < parts.length; i++) {
			arr[i]=Integer.parseInt(parts[i]);
		}
		
		Arrays.sort(arr);
		for(int j = 1; j<arr.length;j++) {
			if(arr[j]==arr[j-1]) {
				System.out.println("liczby nie moga sie powtarzac!");
				lotto();
			}

		}
		for (int k = 0; k<arr.length; k++) {
			if(0 > arr[k] || arr[k]> 49) {
				System.out.println("liczby musza byc z zakresu od 0-49!");
				lotto();
			}	
		}
		System.out.println("poprawnie! liczby ktore wprowadziles to: "+Arrays.toString(arr));

		Integer[] arrTmp = new Integer[49];
		for (int l = 0; l < arrTmp.length; l++) {
			arrTmp[l] = l;
		}
		Collections.shuffle(Arrays.asList(arrTmp));
		int[] tmp = new int[6];
		for (int m = 0; m<6; m++) {
			tmp[m] = arrTmp[m];
		}
		System.out.println("liczby ktore wylosowales to: "+Arrays.toString(tmp));
		int count = 0;
		for (int n = 0; n<tmp.length;n++) {
			for(int o = 0; o < tmp.length;o++) {
				if(tmp[n]==arr[o]) {
					count++;
				}
			}
		} if(count>=3) {
			System.out.println("brawo! trafileś: "+count);
		} else {
			System.out.println("Niestety, nie trafileś przynajmniej 3 :(");
		}
	}
}

