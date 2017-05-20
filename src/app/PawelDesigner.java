package app; //nazwa pakietu

import java.util.Scanner; //import bibliotek

/**
 * Klasa PawelDesigner zawiera metody systemRozmyty() i main().
 * @author Paweł Dudzik.
 */
public class PawelDesigner {
	
	/**
	 * Metoda systemRozmyty() zawiera dwa wejścia.
	 */
	public void systemRozmyty()
	{
		try {
			System.out.println("Symulator systemu rozmytego:");
			System.out.println("Podaj temperaturę w stopniach Cejcjusza:");
			Scanner wejscie1 = new Scanner(System.in);
			double temperatura = wejscie1.nextDouble();
			double zimna = 0, letnia = 0, ciepla = 0, goraca = 0;
			if (temperatura >= 0 && temperatura <= 5)
			{
				zimna = 1;
				letnia = 0;
				ciepla = 0;
				goraca = 0;
			}
			if (temperatura >= 5 && temperatura <= 15)
			{
				zimna = (15-temperatura)/10;
				letnia = (temperatura-5)/10;
				ciepla = 0;
				goraca = 0;
			}
			if (temperatura >= 15 && temperatura <= 25)
			{
				zimna = 0;
				letnia = (25-temperatura)/10;
				ciepla = (temperatura-15)/10;
				goraca = 0;
			}
			if (temperatura >= 25 && temperatura <= 35)
			{
				zimna = 0;
				letnia = 0;
				ciepla = (35-temperatura)/10;
				goraca = (temperatura-25)/10;
			}
			System.out.println("Zimna: "+zimna);
			System.out.println("Letnia: "+letnia);
			System.out.println("Ciepła: "+ciepla);
			System.out.println("Gorąca: "+goraca);
			System.out.println("Podaj wilgotność w procentach:");
			double wilgotnosc = wejscie1.nextDouble();
			double mala = 0, srednia = 0, duza = 0;
			if (wilgotnosc >= 0 && wilgotnosc <= 25)
			{
				mala = 1;
				srednia = 0;
				duza = 0;
			}
			if (wilgotnosc >= 25 && wilgotnosc <= 50)
			{
				mala = (50-wilgotnosc)/25;
				srednia = (wilgotnosc-25)/25;
				duza = 0;
			}
			if (wilgotnosc >= 50 && wilgotnosc <= 100)
			{
				mala = 0;
				srednia = (100-wilgotnosc)/50;
				duza = (wilgotnosc-50)/50;
			}
			System.out.println("Mała: "+mala);
			System.out.println("Średnia: "+srednia);
			System.out.println("Duża: "+duza);
			wejscie1.close();
		} catch (Exception e) {
			System.out.println("Błąd! Uruchom symulator ponownie.");
		}
	}
	
	/**
	 * Metoda main() inicjuje działanie programu.
	 * @param args Tablica argumentów.
	 */
	public static void main(String[] args) {
		PawelDesigner program = new PawelDesigner();
		program.systemRozmyty();
	}
}
