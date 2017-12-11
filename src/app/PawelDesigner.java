package app; //nazwa pakietu

import java.awt.event.*; //import bibliotek
import javax.swing.*;

/**
 * Klasa PawelDesigner zawiera konstruktor i metody actionPerformed() i main().
 * @author Paweł Dudzik.
 */
public class PawelDesigner extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 0; //serializacja programu
	/**
	 * Konstruktor służy do stworzenia okna programu.
	 */
	public PawelDesigner()
	{
		setTitle("PawelDesigner");
		setSize(750,130);
		setLocation(350,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		JLabel etykieta0 = new JLabel("X0");
		panel.add(etykieta0);
		JSlider slider0 = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		slider0.setMajorTickSpacing(5);
		slider0.setMinorTickSpacing(1);
		slider0.setPaintLabels(true);
		slider0.setPaintTicks(true);
		panel.add(slider0);
		JLabel etykieta1 = new JLabel("X1");
		panel.add(etykieta1);
		JSlider slider1 = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		slider1.setMajorTickSpacing(5);
		slider1.setMinorTickSpacing(1);
		slider1.setPaintLabels(true);
		slider1.setPaintTicks(true);
		panel.add(slider1);
		JLabel etykieta2 = new JLabel("X2");
		panel.add(etykieta2);
		JSlider slider2 = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		slider2.setMajorTickSpacing(5);
		slider2.setMinorTickSpacing(1);
		slider2.setPaintLabels(true);
		slider2.setPaintTicks(true);
		panel.add(slider2);
		JButton przycisk = new JButton("Oblicz");
		panel.add(przycisk);
		JLabel etykieta3 = new JLabel("Y0");
		panel.add(etykieta3);
		JProgressBar pasek0 = new JProgressBar();
		pasek0.setStringPainted(true);
		panel.add(pasek0);
		JLabel etykieta4 = new JLabel("Y1");
		panel.add(etykieta4);
		JProgressBar pasek1 = new JProgressBar();
		pasek1.setStringPainted(true);
		panel.add(pasek1);
		przycisk.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent zdarzenie)
			{
				if (zdarzenie.getSource()==przycisk)
				{
					int x0 = slider0.getValue();
					int x1 = slider1.getValue();
					int x2 = slider2.getValue();
					if (x0<3 && x1<3 && x2<3)
					{
						pasek0.setValue(0);
						pasek1.setValue(0);
					}
					if (x0<3 && x1<3 && x2>=3 && x2<=7)
					{
						pasek0.setValue(10);
						pasek1.setValue(30);
					}
					if (x0<3 && x1<3 && x2>7)
					{
						pasek0.setValue(30);
						pasek1.setValue(70);
					}
					if (x0<3 && x1>=3 && x1<=7 && x2<3)
					{
						pasek0.setValue(10);
						pasek1.setValue(30);
					}
					if (x0<3 && x1>=3 && x1<=7 && x2>=3 && x2<=7)
					{
						pasek0.setValue(30);
						pasek1.setValue(70);
					}
					if (x0<3 && x1>=3 && x1<=7 && x2>7)
					{
						pasek0.setValue(50);
						pasek1.setValue(100);
					}
					if (x0<3 && x1>7 && x2<3)
					{
						pasek0.setValue(30);
						pasek1.setValue(70);
					}
					if (x0<3 && x1>7 && x2>=3 && x2<=7)
					{
						pasek0.setValue(50);
						pasek1.setValue(100);
					}
					if (x0<3 && x1>7 && x2>7)
					{
						pasek0.setValue(70);
						pasek1.setValue(70);
					}
					if (x0>=3 && x0<=7 && x1<3 && x2<3)
					{
						pasek0.setValue(10);
						pasek1.setValue(30);
					}
					if (x0>=3 && x0<=7 && x1<3 && x2>=3 && x2<=7)
					{
						pasek0.setValue(30);
						pasek1.setValue(70);
					}
					if (x0>=3 && x0<=7 && x1<3 && x2>7)
					{
						pasek0.setValue(50);
						pasek1.setValue(100);
					}
					if (x0>=3 && x0<=7 && x1>=3 && x1<=7 && x2<3)
					{
						pasek0.setValue(30);
						pasek1.setValue(70);
					}
					if (x0>=3 && x0<=7 && x1>=3 && x1<=7 && x2>=3 && x2<=7)
					{
						pasek0.setValue(50);
						pasek1.setValue(100);
					}
					if (x0>=3 && x0<=7 && x1>=3 && x1<=7 && x2>7)
					{
						pasek0.setValue(70);
						pasek1.setValue(70);
					}
					if (x0>=3 && x0<=7 && x1>7 && x2<3)
					{
						pasek0.setValue(50);
						pasek1.setValue(100);
					}
					if (x0>=3 && x0<=7 && x1>7 && x2>=3 && x2<=7)
					{
						pasek0.setValue(70);
						pasek1.setValue(70);
					}
					if (x0>=3 && x0<=7 && x1>7 && x2>7)
					{
						pasek0.setValue(90);
						pasek1.setValue(30);
					}
					if (x0>7 && x1<3 && x2<3)
					{
						pasek0.setValue(30);
						pasek1.setValue(70);
					}
					if (x0>7 && x1<3 && x2>=3 && x2<=7)
					{
						pasek0.setValue(50);
						pasek1.setValue(100);
					}
					if (x0>7 && x1<3 && x2>7)
					{
						pasek0.setValue(70);
						pasek1.setValue(70);
					}
					if (x0>7 && x1>=3 && x1<=7 && x2<3)
					{
						pasek0.setValue(50);
						pasek1.setValue(100);
					}
					if (x0>7 && x1>=3 && x1<=7 && x2>=3 && x2<=7)
					{
						pasek0.setValue(70);
						pasek1.setValue(70);
					}
					if (x0>7 && x1>=3 && x1<=7 && x2>7)
					{
						pasek0.setValue(90);
						pasek1.setValue(30);
					}
					if (x0>7 && x1>7 && x2<3)
					{
						pasek0.setValue(70);
						pasek1.setValue(70);
					}
					if (x0>7 && x1>7 && x2>=3 && x2<=7)
					{
						pasek0.setValue(90);
						pasek1.setValue(30);
					}
					if (x0>7 && x1>7 && x2>7)
					{
						pasek0.setValue(100);
						pasek1.setValue(0);
					}
				}
			}
		});
	}
	/**
	 * Metoda actionPerformed() jest potrzebna do działania programu.
	 * @param zdarzenie Służy do obsługi zdarzeń.
	 */
	public void actionPerformed(ActionEvent zdarzenie)
	{
	}
	/**
	 * Metoda main() inicjuje działanie programu.
	 * @param args Tablica argumentów.
	 */
	public static void main(String[] args) {
		PawelDesigner program = new PawelDesigner();
		program.setVisible(true);
	}
}
