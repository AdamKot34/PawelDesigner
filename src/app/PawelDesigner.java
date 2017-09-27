package app; //nazwa pakietu

import java.util.Scanner; //import bibliotek

/**
 * Klasa PawelDesigner zawiera metody systemRozmyty() i main().
 * @author Paweł Dudzik.
 */
public class PawelDesigner {
	
	/**
	 * Metoda systemRozmyty() zawiera dwa wejścia i jedno wyjście.
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
			double max1 = 0;
			String x1 = "nieokreślona";
			if (zimna > max1)
			{
				max1 = zimna;
				x1 = "zimna";
			}
			if (letnia > max1)
			{
				max1 = letnia;
				x1 = "letnia";
			}
			if (ciepla > max1)
			{
				max1 = ciepla;
				x1 = "ciepła";
			}
			if (goraca > max1)
			{
				max1 = goraca;
				x1 = "gorąca";
			}
			System.out.println("Temperatura jest "+x1+".");
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
			double max2 = 0;
			String x2 = "nieokreślona";
			if (mala > max2)
			{
				max2 = mala;
				x2 = "mała";
			}
			if (srednia > max2)
			{
				max2 = srednia;
				x2 = "średnia";
			}
			if (duza > max2)
			{
				max2 = duza;
				x2 = "duża";
			}
			System.out.println("Wilgotność jest "+x2+".");
			String y = "nieokreślona";
			if (x1 == "zimna" && x2 == "duża"
					|| x1 == "letnia" && x2 == "duża")
			{
				y = "zerowa";
			}
			if (x1 == "zimna" && x2 == "średnia"
					|| x1 == "letnia" && x2 == "średnia"
					|| x1 == "ciepła" && x2 == "duża")
			{
				y = "mała";
			}
			if (x1 == "zimna" && x2 == "mała"
					|| x1 == "ciepła" && x2 == "średnia"
					|| x1 == "gorąca" && x2 == "duża")
			{
				y = "średnia";
			}
			if (x1 == "letnia" && x2 == "mała" 
					|| x1 == "ciepła" && x2 == "mała"
					|| x1 == "gorąca" && x2 == "średnia")
			{
				y = "duża";
			}
			if (x1 == "gorąca" && x2 == "mała")
			{
				y = "maksymalna";
			}
			System.out.println("Intensywność podlewania jest "+y+".");
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
