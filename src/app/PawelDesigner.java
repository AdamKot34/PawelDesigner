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
		setSize(250,330);
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
		JLabel etykieta2 = new JLabel("X0/X1         M                     S                    D");
		panel.add(etykieta2);
		JLabel etykietar0 = new JLabel("  M       BM");
		panel.add(etykietar0);
		JRadioButton r0 = new JRadioButton();
		r0.setEnabled(false);
		panel.add(r0);
		JLabel etykietar1 = new JLabel("          M");
		panel.add(etykietar1);
		JRadioButton r1 = new JRadioButton();
		r1.setEnabled(false);
		panel.add(r1);
		JLabel etykietar2 = new JLabel("          S");
		panel.add(etykietar2);
		JRadioButton r2 = new JRadioButton();
		r2.setEnabled(false);
		panel.add(r2);
		JLabel etykietar3 = new JLabel("  S         M");
		panel.add(etykietar3);
		JRadioButton r3 = new JRadioButton();
		r3.setEnabled(false);
		panel.add(r3);
		JLabel etykietar4 = new JLabel("           S");
		panel.add(etykietar4);
		JRadioButton r4 = new JRadioButton();
		r4.setEnabled(false);
		panel.add(r4);
		JLabel etykietar5 = new JLabel("          D");
		panel.add(etykietar5);
		JRadioButton r5 = new JRadioButton();
		r5.setEnabled(false);
		panel.add(r5);
		JLabel etykietar6 = new JLabel("  D         S");
		panel.add(etykietar6);
		JRadioButton r6 = new JRadioButton();
		r6.setEnabled(false);
		panel.add(r6);
		JLabel etykietar7 = new JLabel("           D");
		panel.add(etykietar7);
		JRadioButton r7 = new JRadioButton();
		r7.setEnabled(false);
		panel.add(r7);
		JLabel etykietar8 = new JLabel("        BD");
		panel.add(etykietar8);
		JRadioButton r8 = new JRadioButton();
		r8.setEnabled(false);
		panel.add(r8);
		JLabel etykietay0 = new JLabel("           Y0");
		panel.add(etykietay0);
		JProgressBar pasek0 = new JProgressBar();
		pasek0.setStringPainted(true);
		panel.add(pasek0);
		JLabel etykietay1 = new JLabel("           Y1");
		panel.add(etykietay1);
		JProgressBar pasek1 = new JProgressBar();
		pasek1.setStringPainted(true);
		panel.add(pasek1);
		JButton przycisk = new JButton("Oblicz");
		panel.add(przycisk);
		przycisk.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent zdarzenie)
			{
				if (zdarzenie.getSource()==przycisk)
				{
					/**
					 * Wejście X0.
					 */
					r0.setSelected(false);
					r1.setSelected(false);
					r2.setSelected(false);
					r3.setSelected(false);
					r4.setSelected(false);
					r5.setSelected(false);
					r6.setSelected(false);
					r7.setSelected(false);
					r8.setSelected(false);
					int x0 = slider0.getValue();
					double x0M = 0, x0S = 0, x0D = 0;
					if (x0 == 0)
					{
						x0M = 1;
					}
					if (x0 == 1)
					{
						x0M = 0.8;
						x0S = 0.2;
					}
					if (x0 == 2)
					{
						x0M = 0.6;
						x0S = 0.4;
					}
					if (x0 == 3)
					{
						x0M = 0.4;
						x0S = 0.6;
					}
					if (x0 == 4)
					{
						x0M = 0.2;
						x0S = 0.8;
					}
					if (x0 == 5)
					{
						x0S = 1;
					}
					if (x0 == 6)
					{
						x0S = 0.8;
						x0D = 0.2;
					}
					if (x0 == 7)
					{
						x0S = 0.6;
						x0D = 0.4;
					}
					if (x0 == 8)
					{
						x0S = 0.4;
						x0D = 0.6;
					}
					if (x0 == 9)
					{
						x0S = 0.2;
						x0D = 0.8;
					}
					if (x0 == 10)
					{
						x0D = 1;
					}
					/**
					 * Wejście X1.
					 */
					int x1 = slider1.getValue();
					double x1M = 0, x1S = 0, x1D = 0;
					if (x1 == 0)
					{
						x1M = 1;
					}
					if (x1 == 1)
					{
						x1M = 0.8;
						x1S = 0.2;
					}
					if (x1 == 2)
					{
						x1M = 0.6;
						x1S = 0.4;
					}
					if (x1 == 3)
					{
						x1M = 0.4;
						x1S = 0.6;
					}
					if (x1 == 4)
					{
						x1M = 0.2;
						x1S = 0.8;
					}
					if (x1 == 5)
					{
						x1S = 1;
					}
					if (x1 == 6)
					{
						x1S = 0.8;
						x1D = 0.2;
					}
					if (x1 == 7)
					{
						x1S = 0.6;
						x1D = 0.4;
					}
					if (x1 == 8)
					{
						x1S = 0.4;
						x1D = 0.6;
					}
					if (x1 == 9)
					{
						x1S = 0.2;
						x1D = 0.8;
					}
					if (x1 == 10)
					{
						x1D = 1;
					}
					/**
					 * Reguły rozmyte.
					 */
					double yBM = 0, yM1 = 0, yM2 = 0;
					double yS1 = 0, yS2 = 0, yS3 = 0;
					double yD1 = 0, yD2 = 0, yBD = 0;
					if (x0M > 0 && x1M > 0)
					{
						r0.setSelected(true);
						yBM = x0M;
						if (x1M < yBM)
						{
							yBM = x1M;
						}
					}
					if (x0M > 0 && x1S > 0)
					{
						r1.setSelected(true);
						yM1 = x0M;
						if (x1S < yM1)
						{
							yM1 = x1S;
						}
					}
					if (x0M > 0 && x1D > 0)
					{
						r2.setSelected(true);
						yS1 = x0M;
						if (x1D < yS1)
						{
							yS1 = x1D;
						}
					}
					if (x0S > 0 && x1M > 0)
					{
						r3.setSelected(true);
						yM2 = x0S;
						if (x1M < yM2)
						{
							yM2 = x1M;
						}
					}
					if (x0S > 0 && x1S > 0)
					{
						r4.setSelected(true);
						yS2 = x0S;
						if (x1S < yS2)
						{
							yS2 = x1S;
						}
					}
					if (x0S > 0 && x1D > 0)
					{
						r5.setSelected(true);
						yD1 = x0S;
						if (x1D < yD1)
						{
							yD1 = x1D;
						}
					}
					if (x0D > 0 && x1M > 0)
					{
						r6.setSelected(true);
						yS3 = x0D;
						if (x1M < yS3)
						{
							yS3 = x1M;
						}
					}
					if (x0D > 0 && x1S > 0)
					{
						r7.setSelected(true);
						yD2 = x0D;
						if (x1S < yD2)
						{
							yD2 = x1S;
						}
					}
					if (x0D > 0 && x1D > 0)
					{
						r8.setSelected(true);
						yBD = x0D;
						if (x1D < yBD)
						{
							yBD = x1D;
						}
					}
					double yM = 0, yS = 0, yD = 0;
					yM = yM1;
					if (yM2 > yM)
					{
						yM = yM2;
					}
					yS = yS1;
					if (yS2 > yS)
					{
						yS = yS2;
					}
					if (yS3 > yS)
					{
						yS = yS3;
					}
					yD = yD1;
					if (yD2 > yD)
					{
						yD = yD2;
					}
					/**
					 * Wyjście Y.
					 */
					int BM = 0, M = 25, S = 50, D = 75, BD = 100;
					double y = (yBM*BM+yM*M+yS*S+yD*D+yBD*BD)/(yBM+yM+yS+yD+yBD);
					int y0 = (int) y;
					int y1 = 100 - (int) y;
					pasek0.setValue(y0);
					pasek1.setValue(y1);
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
	public static void main(String[] args)
	{
		PawelDesigner program = new PawelDesigner();
		program.setVisible(true);
	}
}
