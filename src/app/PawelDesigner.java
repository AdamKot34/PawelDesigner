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
		setSize(250,450);
		setLocation(350,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		JButton przycisk0 = new JButton("2wej/1wyj,3zb/zm");
		panel.add(przycisk0);
		JButton przycisk1 = new JButton("2wej/1wyj,5zb/zm");
		panel.add(przycisk1);
		JButton przycisk2 = new JButton("3wej/1wyj,3zb/zm");
		panel.add(przycisk2);
		JButton przycisk3 = new JButton("3wej/2wyj,5zb/zm");
		panel.add(przycisk3);
		/**
		 * 2 wejścia na 1 wyjście, 3 zbiory na zmienną.
		 */
		przycisk0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent zdarzenie)
			{
				if (zdarzenie.getSource()==przycisk0)
				{
					panel.remove(przycisk0);
					panel.remove(przycisk1);
					panel.remove(przycisk2);
					panel.remove(przycisk3);
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
					JButton przycisk4 = new JButton("Oblicz");
					panel.add(przycisk4);
					SwingUtilities.updateComponentTreeUI(panel);
					przycisk4.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent zdarzenie)
						{
							if (zdarzenie.getSource()==przycisk4)
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
								pasek0.setValue(y0);
							}
						}
					});
				}
			}
		});
		/**
		 * 2 wejścia na 1 wyjście, 5 zbiorów na zmienną.
		 */
		przycisk1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent zdarzenie)
			{
				if (zdarzenie.getSource()==przycisk1)
				{
					panel.remove(przycisk0);
					panel.remove(przycisk1);
					panel.remove(przycisk2);
					panel.remove(przycisk3);
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
					JLabel etykieta2 = new JLabel("X0/X1  M           M+        S              D-         D");
					panel.add(etykieta2);
					JLabel etykietar0 = new JLabel("M BM");
					panel.add(etykietar0);
					JRadioButton r0 = new JRadioButton();
					r0.setEnabled(false);
					panel.add(r0);
					JLabel etykietar1 = new JLabel("M-");
					panel.add(etykietar1);
					JRadioButton r1 = new JRadioButton();
					r1.setEnabled(false);
					panel.add(r1);
					JLabel etykietar2 = new JLabel("M");
					panel.add(etykietar2);
					JRadioButton r2 = new JRadioButton();
					r2.setEnabled(false);
					panel.add(r2);
					JLabel etykietar3 = new JLabel("M+");
					panel.add(etykietar3);
					JRadioButton r3 = new JRadioButton();
					r3.setEnabled(false);
					panel.add(r3);
					JLabel etykietar4 = new JLabel("S");
					panel.add(etykietar4);
					JRadioButton r4 = new JRadioButton();
					r4.setEnabled(false);
					panel.add(r4);
					JLabel etykietar5 = new JLabel("M+ M-");
					panel.add(etykietar5);
					JRadioButton r5 = new JRadioButton();
					r5.setEnabled(false);
					panel.add(r5);
					JLabel etykietar6 = new JLabel("M");
					panel.add(etykietar6);
					JRadioButton r6 = new JRadioButton();
					r6.setEnabled(false);
					panel.add(r6);
					JLabel etykietar7 = new JLabel("M+");
					panel.add(etykietar7);
					JRadioButton r7 = new JRadioButton();
					r7.setEnabled(false);
					panel.add(r7);
					JLabel etykietar8 = new JLabel("S");
					panel.add(etykietar8);
					JRadioButton r8 = new JRadioButton();
					r8.setEnabled(false);
					panel.add(r8);
					JLabel etykietar9 = new JLabel("D-");
					panel.add(etykietar9);
					JRadioButton r9 = new JRadioButton();
					r9.setEnabled(false);
					panel.add(r9);
					JLabel etykietar10 = new JLabel("S    M");
					panel.add(etykietar10);
					JRadioButton r10 = new JRadioButton();
					r10.setEnabled(false);
					panel.add(r10);
					JLabel etykietar11 = new JLabel("M+");
					panel.add(etykietar11);
					JRadioButton r11 = new JRadioButton();
					r11.setEnabled(false);
					panel.add(r11);
					JLabel etykietar12 = new JLabel("S");
					panel.add(etykietar12);
					JRadioButton r12 = new JRadioButton();
					r12.setEnabled(false);
					panel.add(r12);
					JLabel etykietar13 = new JLabel("D-");
					panel.add(etykietar13);
					JRadioButton r13 = new JRadioButton();
					r13.setEnabled(false);
					panel.add(r13);
					JLabel etykietar14 = new JLabel("D");
					panel.add(etykietar14);
					JRadioButton r14 = new JRadioButton();
					r14.setEnabled(false);
					panel.add(r14);
					JLabel etykietar15 = new JLabel("D- M+");
					panel.add(etykietar15);
					JRadioButton r15 = new JRadioButton();
					r15.setEnabled(false);
					panel.add(r15);
					JLabel etykietar16 = new JLabel("S");
					panel.add(etykietar16);
					JRadioButton r16 = new JRadioButton();
					r16.setEnabled(false);
					panel.add(r16);
					JLabel etykietar17 = new JLabel("D-");
					panel.add(etykietar17);
					JRadioButton r17 = new JRadioButton();
					r17.setEnabled(false);
					panel.add(r17);
					JLabel etykietar18 = new JLabel("D");
					panel.add(etykietar18);
					JRadioButton r18 = new JRadioButton();
					r18.setEnabled(false);
					panel.add(r18);
					JLabel etykietar19 = new JLabel("D+");
					panel.add(etykietar19);
					JRadioButton r19 = new JRadioButton();
					r19.setEnabled(false);
					panel.add(r19);
					JLabel etykietar20 = new JLabel("D     S");
					panel.add(etykietar20);
					JRadioButton r20 = new JRadioButton();
					r20.setEnabled(false);
					panel.add(r20);
					JLabel etykietar21 = new JLabel("D-");
					panel.add(etykietar21);
					JRadioButton r21 = new JRadioButton();
					r21.setEnabled(false);
					panel.add(r21);
					JLabel etykietar22 = new JLabel("D");
					panel.add(etykietar22);
					JRadioButton r22 = new JRadioButton();
					r22.setEnabled(false);
					panel.add(r22);
					JLabel etykietar23 = new JLabel("D+");
					panel.add(etykietar23);
					JRadioButton r23 = new JRadioButton();
					r23.setEnabled(false);
					panel.add(r23);
					JLabel etykietar24 = new JLabel("BD");
					panel.add(etykietar24);
					JRadioButton r24 = new JRadioButton();
					r24.setEnabled(false);
					panel.add(r24);
					JLabel etykietay0 = new JLabel("           Y0");
					panel.add(etykietay0);
					JProgressBar pasek0 = new JProgressBar();
					pasek0.setStringPainted(true);
					panel.add(pasek0);
					JButton przycisk4 = new JButton("Oblicz");
					panel.add(przycisk4);
					SwingUtilities.updateComponentTreeUI(panel);
					przycisk4.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent zdarzenie)
						{
							if (zdarzenie.getSource()==przycisk4)
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
								r9.setSelected(false);
								r10.setSelected(false);
								r11.setSelected(false);
								r12.setSelected(false);
								r13.setSelected(false);
								r14.setSelected(false);
								r15.setSelected(false);
								r16.setSelected(false);
								r17.setSelected(false);
								r18.setSelected(false);
								r19.setSelected(false);
								r20.setSelected(false);
								r21.setSelected(false);
								r22.setSelected(false);
								r23.setSelected(false);
								r24.setSelected(false);
								int x0 = slider0.getValue();
								double x0M = 0, x0Mp = 0, x0S = 0, x0Dm = 0, x0D = 0;
								if (x0 == 0)
								{
									x0M = 1;
								}
								if (x0 == 1)
								{
									x0M = 0.6;
									x0Mp = 0.4;
								}
								if (x0 == 2)
								{
									x0M = 0.2;
									x0Mp = 0.8;
								}
								if (x0 == 3)
								{
									x0Mp = 0.8;
									x0S = 0.2;
								}
								if (x0 == 4)
								{
									x0Mp = 0.4;
									x0S = 0.6;
								}
								if (x0 == 5)
								{
									x0S = 1;
								}
								if (x0 == 6)
								{
									x0S = 0.6;
									x0Dm = 0.4;
								}
								if (x0 == 7)
								{
									x0S = 0.2;
									x0Dm = 0.8;
								}
								if (x0 == 8)
								{
									x0Dm = 0.8;
									x0D = 0.2;
								}
								if (x0 == 9)
								{
									x0Dm = 0.4;
									x0D = 0.6;
								}
								if (x0 == 10)
								{
									x0D = 1;
								}
								/**
								 * Wejście X1.
								 */
								int x1 = slider1.getValue();
								double x1M = 0, x1Mp = 0, x1S = 0, x1Dm = 0, x1D = 0;
								if (x1 == 0)
								{
									x1M = 1;
								}
								if (x1 == 1)
								{
									x1M = 0.6;
									x1Mp = 0.4;
								}
								if (x1 == 2)
								{
									x1M = 0.2;
									x1Mp = 0.8;
								}
								if (x1 == 3)
								{
									x1Mp = 0.8;
									x1S = 0.2;
								}
								if (x1 == 4)
								{
									x1Mp = 0.4;
									x1S = 0.6;
								}
								if (x1 == 5)
								{
									x1S = 1;
								}
								if (x1 == 6)
								{
									x1S = 0.6;
									x1Dm = 0.4;
								}
								if (x1 == 7)
								{
									x1S = 0.2;
									x1Dm = 0.8;
								}
								if (x1 == 8)
								{
									x1Dm = 0.8;
									x1D = 0.2;
								}
								if (x1 == 9)
								{
									x1Dm = 0.4;
									x1D = 0.6;
								}
								if (x1 == 10)
								{
									x1D = 1;
								}
								/**
								 * Reguły rozmyte.
								 */
								double yBM = 0, yMm1 = 0, yMm2 = 0;
								double yM1 = 0, yM2 = 0, yM3 = 0;
								double yMp1 = 0, yMp2 = 0, yMp3 = 0, yMp4 = 0;
								double yS1 = 0, yS2 = 0, yS3 = 0, yS4 = 0, yS5 = 0;
								double yDm1 = 0, yDm2 = 0, yDm3 = 0, yDm4 = 0;
								double yD1 = 0, yD2 = 0, yD3 = 0;
								double yDp1 = 0, yDp2 = 0, yBD = 0;
								if (x0M > 0 && x1M > 0)
								{
									r0.setSelected(true);
									yBM = x0M;
									if (x1M < yBM)
									{
										yBM = x1M;
									}
								}
								if (x0M > 0 && x1Mp > 0)
								{
									r1.setSelected(true);
									yMm1 = x0M;
									if (x1Mp < yMm1)
									{
										yMm1 = x1Mp;
									}
								}
								if (x0M > 0 && x1S > 0)
								{
									r2.setSelected(true);
									yM1 = x0M;
									if (x1S < yM1)
									{
										yM1 = x1S;
									}
								}
								if (x0M > 0 && x1Dm > 0)
								{
									r3.setSelected(true);
									yMp1 = x0M;
									if (x1Dm < yMp1)
									{
										yMp1 = x1Dm;
									}
								}
								if (x0M > 0 && x1D > 0)
								{
									r4.setSelected(true);
									yS1 = x0M;
									if (x1D < yS1)
									{
										yS1 = x1D;
									}
								}
								if (x0Mp > 0 && x1M > 0)
								{
									r5.setSelected(true);
									yMm2 = x0Mp;
									if (x1M < yMm2)
									{
										yMm2 = x1M;
									}
								}
								if (x0Mp > 0 && x1Mp > 0)
								{
									r6.setSelected(true);
									yM2 = x0Mp;
									if (x1Mp < yM2)
									{
										yM2 = x1Mp;
									}
								}
								if (x0Mp > 0 && x1S > 0)
								{
									r7.setSelected(true);
									yMp2 = x0Mp;
									if (x1S < yMp2)
									{
										yMp2 = x1S;
									}
								}
								if (x0Mp > 0 && x1Dm > 0)
								{
									r8.setSelected(true);
									yS2 = x0Mp;
									if (x1Dm < yS2)
									{
										yS2 = x1Dm;
									}
								}
								if (x0Mp > 0 && x1D > 0)
								{
									r9.setSelected(true);
									yDm1 = x0Mp;
									if (x1D < yDm1)
									{
										yDm1 = x1D;
									}
								}
								if (x0S > 0 && x1M > 0)
								{
									r10.setSelected(true);
									yM3 = x0S;
									if (x1M < yM3)
									{
										yM3 = x1M;
									}
								}
								if (x0S > 0 && x1Mp > 0)
								{
									r11.setSelected(true);
									yMp3 = x0S;
									if (x1Mp < yMp3)
									{
										yMp3 = x1Mp;
									}
								}
								if (x0S > 0 && x1S > 0)
								{
									r12.setSelected(true);
									yS3 = x0S;
									if (x1S < yS3)
									{
										yS3 = x1S;
									}
								}
								if (x0S > 0 && x1Dm > 0)
								{
									r13.setSelected(true);
									yDm2 = x0S;
									if (x1Dm < yDm2)
									{
										yDm2 = x1Dm;
									}
								}
								if (x0S > 0 && x1D > 0)
								{
									r14.setSelected(true);
									yD1 = x0S;
									if (x1D < yD1)
									{
										yD1 = x1D;
									}
								}
								if (x0Dm > 0 && x1M > 0)
								{
									r15.setSelected(true);
									yMp4 = x0Dm;
									if (x1M < yMp4)
									{
										yMp4 = x1M;
									}
								}
								if (x0Dm > 0 && x1Mp > 0)
								{
									r16.setSelected(true);
									yS4 = x0Dm;
									if (x1Mp < yS4)
									{
										yS4 = x1Mp;
									}
								}
								if (x0Dm > 0 && x1S > 0)
								{
									r17.setSelected(true);
									yDm3 = x0Dm;
									if (x1S < yDm3)
									{
										yDm3 = x1S;
									}
								}
								if (x0Dm > 0 && x1Dm > 0)
								{
									r18.setSelected(true);
									yD2 = x0Dm;
									if (x1Dm < yD2)
									{
										yD2 = x1Dm;
									}
								}
								if (x0Dm > 0 && x1D > 0)
								{
									r19.setSelected(true);
									yDp1 = x0Dm;
									if (x1D < yDp1)
									{
										yDp1 = x1D;
									}
								}
								if (x0D > 0 && x1M > 0)
								{
									r20.setSelected(true);
									yS5 = x0D;
									if (x1M < yS5)
									{
										yS5 = x1M;
									}
								}
								if (x0D > 0 && x1Mp > 0)
								{
									r21.setSelected(true);
									yDm4 = x0D;
									if (x1Mp < yDm4)
									{
										yDm4 = x1Mp;
									}
								}
								if (x0D > 0 && x1S > 0)
								{
									r22.setSelected(true);
									yD3 = x0D;
									if (x1S < yD3)
									{
										yD3 = x1S;
									}
								}
								if (x0D > 0 && x1Dm > 0)
								{
									r23.setSelected(true);
									yDp2 = x0D;
									if (x1Dm < yDp2)
									{
										yDp2 = x1Dm;
									}
								}
								if (x0D > 0 && x1D > 0)
								{
									r24.setSelected(true);
									yBD = x0D;
									if (x1D < yBD)
									{
										yBD = x1D;
									}
								}
								double yMm = 0, yM = 0, yMp = 0, yS = 0, yDm = 0, yD = 0, yDp = 0;
								yMm = yMm1;
								if (yMm2 > yMm)
								{
									yMm = yMm2;
								}
								yM = yM1;
								if (yM2 > yM)
								{
									yM = yM2;
								}
								if (yM3 > yM)
								{
									yM = yM3;
								}
								yMp = yMp1;
								if (yMp2 > yMp)
								{
									yMp = yMp2;
								}
								if (yMp3 > yMp)
								{
									yMp = yMp3;
								}
								if (yMp4 > yMp)
								{
									yMp = yMp4;
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
								if (yS4 > yS)
								{
									yS = yS4;
								}
								if (yS5 > yS)
								{
									yS = yS5;
								}
								yDm = yDm1;
								if (yDm2 > yDm)
								{
									yDm = yDm2;
								}
								if (yDm3 > yDm)
								{
									yDm = yDm3;
								}
								if (yDm4 > yDm)
								{
									yDm = yDm4;
								}
								yD = yD1;
								if (yD2 > yD)
								{
									yD = yD2;
								}
								if (yD3 > yD)
								{
									yD = yD3;
								}
								yDp = yDp1;
								if (yDp2 > yDp)
								{
									yDp = yDp2;
								}
								/**
								 * Wyjście Y.
								 */
								int BM = 0, M = 25, S = 50, D = 75, BD = 100;
								double Mm = 12.5, Mp = 37.5, Dm = 62.5, Dp = 87.5;
								double y = (yBM*BM+yMm*Mm+yM*M+yMp*Mp+yS*S+yDm*Dm+yD*D+yDp*Dp+yBD*BD)/(yBM+yMm+yM+yMp+yS+yDm+yD+yDp+yBD);
								int y0 = (int) y;
								pasek0.setValue(y0);
							}
						}
					});
				}
			}
		});
		/**
		 * 3 wejścia na 1 wyjście, 3 zbiory na zmienną.
		 */
		przycisk2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent zdarzenie)
			{
				if (zdarzenie.getSource()==przycisk2)
				{
					panel.remove(przycisk0);
					panel.remove(przycisk1);
					panel.remove(przycisk2);
					panel.remove(przycisk3);
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
					JLabel etykieta3 = new JLabel("X0/X1         M                     S                    D");
					panel.add(etykieta3);
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
					JLabel etykietar9 = new JLabel("X2       M");
					panel.add(etykietar9);
					JRadioButton r9 = new JRadioButton();
					r9.setEnabled(false);
					panel.add(r9);
					JLabel etykietar10 = new JLabel("           S");
					panel.add(etykietar10);
					JRadioButton r10 = new JRadioButton();
					r10.setEnabled(false);
					panel.add(r10);
					JLabel etykietar11 = new JLabel("           D");
					panel.add(etykietar11);
					JRadioButton r11 = new JRadioButton();
					r11.setEnabled(false);
					panel.add(r11);
					JLabel etykietay0 = new JLabel("           Y0");
					panel.add(etykietay0);
					JProgressBar pasek0 = new JProgressBar();
					pasek0.setStringPainted(true);
					panel.add(pasek0);
					JButton przycisk4 = new JButton("Oblicz");
					panel.add(przycisk4);
					SwingUtilities.updateComponentTreeUI(panel);
					przycisk4.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent zdarzenie)
						{
							if (zdarzenie.getSource()==przycisk4)
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
								r9.setSelected(false);
								r10.setSelected(false);
								r11.setSelected(false);
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
								 * Wejście X2.
								 */
								int x2 = slider2.getValue();
								double x2M = 0, x2S = 0, x2D = 0;
								if (x2 == 0)
								{
									x2M = 1;
								}
								if (x2 == 1)
								{
									x2M = 0.8;
									x2S = 0.2;
								}
								if (x2 == 2)
								{
									x2M = 0.6;
									x2S = 0.4;
								}
								if (x2 == 3)
								{
									x2M = 0.4;
									x2S = 0.6;
								}
								if (x2 == 4)
								{
									x2M = 0.2;
									x2S = 0.8;
								}
								if (x2 == 5)
								{
									x2S = 1;
								}
								if (x2 == 6)
								{
									x2S = 0.8;
									x2D = 0.2;
								}
								if (x2 == 7)
								{
									x2S = 0.6;
									x2D = 0.4;
								}
								if (x2 == 8)
								{
									x2S = 0.4;
									x2D = 0.6;
								}
								if (x2 == 9)
								{
									x2S = 0.2;
									x2D = 0.8;
								}
								if (x2 == 10)
								{
									x2D = 1;
								}
								/**
								 * Reguły rozmyte.
								 */
								double yBM = 0, yM1 = 0, yM2 = 0;
								double yS1 = 0, yS2 = 0, yS3 = 0;
								double yD1 = 0, yD2 = 0, yBD = 0;
								double yM3 = 0, yS4 = 0, yD3 = 0;
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
								if (x2M > 0)
								{
									r9.setSelected(true);
									yM3 = x2M;
								}
								if (x2S > 0)
								{
									r10.setSelected(true);
									yS4 = x2S;
								}
								if (x2D > 0)
								{
									r11.setSelected(true);
									yD3 = x2D;
								}
								double yM = 0, yS = 0, yD = 0;
								yM = yM1;
								if (yM2 > yM)
								{
									yM = yM2;
								}
								if (yM3 > yM)
								{
									yM = yM3;
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
								if (yS4 > yS)
								{
									yS = yS4;
								}
								yD = yD1;
								if (yD2 > yD)
								{
									yD = yD2;
								}
								if (yD3 > yD)
								{
									yD = yD3;
								}
								/**
								 * Wyjście Y.
								 */
								int BM = 0, M = 25, S = 50, D = 75, BD = 100;
								double y = (yBM*BM+yM*M+yS*S+yD*D+yBD*BD)/(yBM+yM+yS+yD+yBD);
								int y0 = (int) y;
								pasek0.setValue(y0);
							}
						}
					});
				}
			}
		});
		/**
		 * 3 wejścia na 2 wyjścia, 5 zbiorów na zmienną.
		 */
		przycisk3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent zdarzenie)
			{
				if (zdarzenie.getSource()==przycisk3)
				{
					panel.remove(przycisk0);
					panel.remove(przycisk1);
					panel.remove(przycisk2);
					panel.remove(przycisk3);
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
					JLabel etykieta3 = new JLabel("X0/X1  M           M+        S              D-         D");
					panel.add(etykieta3);
					JLabel etykietar0 = new JLabel("M BM");
					panel.add(etykietar0);
					JRadioButton r0 = new JRadioButton();
					r0.setEnabled(false);
					panel.add(r0);
					JLabel etykietar1 = new JLabel("M-");
					panel.add(etykietar1);
					JRadioButton r1 = new JRadioButton();
					r1.setEnabled(false);
					panel.add(r1);
					JLabel etykietar2 = new JLabel("M");
					panel.add(etykietar2);
					JRadioButton r2 = new JRadioButton();
					r2.setEnabled(false);
					panel.add(r2);
					JLabel etykietar3 = new JLabel("M+");
					panel.add(etykietar3);
					JRadioButton r3 = new JRadioButton();
					r3.setEnabled(false);
					panel.add(r3);
					JLabel etykietar4 = new JLabel("S");
					panel.add(etykietar4);
					JRadioButton r4 = new JRadioButton();
					r4.setEnabled(false);
					panel.add(r4);
					JLabel etykietar5 = new JLabel("M+ M-");
					panel.add(etykietar5);
					JRadioButton r5 = new JRadioButton();
					r5.setEnabled(false);
					panel.add(r5);
					JLabel etykietar6 = new JLabel("M");
					panel.add(etykietar6);
					JRadioButton r6 = new JRadioButton();
					r6.setEnabled(false);
					panel.add(r6);
					JLabel etykietar7 = new JLabel("M+");
					panel.add(etykietar7);
					JRadioButton r7 = new JRadioButton();
					r7.setEnabled(false);
					panel.add(r7);
					JLabel etykietar8 = new JLabel("S");
					panel.add(etykietar8);
					JRadioButton r8 = new JRadioButton();
					r8.setEnabled(false);
					panel.add(r8);
					JLabel etykietar9 = new JLabel("D-");
					panel.add(etykietar9);
					JRadioButton r9 = new JRadioButton();
					r9.setEnabled(false);
					panel.add(r9);
					JLabel etykietar10 = new JLabel("S    M");
					panel.add(etykietar10);
					JRadioButton r10 = new JRadioButton();
					r10.setEnabled(false);
					panel.add(r10);
					JLabel etykietar11 = new JLabel("M+");
					panel.add(etykietar11);
					JRadioButton r11 = new JRadioButton();
					r11.setEnabled(false);
					panel.add(r11);
					JLabel etykietar12 = new JLabel("S");
					panel.add(etykietar12);
					JRadioButton r12 = new JRadioButton();
					r12.setEnabled(false);
					panel.add(r12);
					JLabel etykietar13 = new JLabel("D-");
					panel.add(etykietar13);
					JRadioButton r13 = new JRadioButton();
					r13.setEnabled(false);
					panel.add(r13);
					JLabel etykietar14 = new JLabel("D");
					panel.add(etykietar14);
					JRadioButton r14 = new JRadioButton();
					r14.setEnabled(false);
					panel.add(r14);
					JLabel etykietar15 = new JLabel("D- M+");
					panel.add(etykietar15);
					JRadioButton r15 = new JRadioButton();
					r15.setEnabled(false);
					panel.add(r15);
					JLabel etykietar16 = new JLabel("S");
					panel.add(etykietar16);
					JRadioButton r16 = new JRadioButton();
					r16.setEnabled(false);
					panel.add(r16);
					JLabel etykietar17 = new JLabel("D-");
					panel.add(etykietar17);
					JRadioButton r17 = new JRadioButton();
					r17.setEnabled(false);
					panel.add(r17);
					JLabel etykietar18 = new JLabel("D");
					panel.add(etykietar18);
					JRadioButton r18 = new JRadioButton();
					r18.setEnabled(false);
					panel.add(r18);
					JLabel etykietar19 = new JLabel("D+");
					panel.add(etykietar19);
					JRadioButton r19 = new JRadioButton();
					r19.setEnabled(false);
					panel.add(r19);
					JLabel etykietar20 = new JLabel("D     S");
					panel.add(etykietar20);
					JRadioButton r20 = new JRadioButton();
					r20.setEnabled(false);
					panel.add(r20);
					JLabel etykietar21 = new JLabel("D-");
					panel.add(etykietar21);
					JRadioButton r21 = new JRadioButton();
					r21.setEnabled(false);
					panel.add(r21);
					JLabel etykietar22 = new JLabel("D");
					panel.add(etykietar22);
					JRadioButton r22 = new JRadioButton();
					r22.setEnabled(false);
					panel.add(r22);
					JLabel etykietar23 = new JLabel("D+");
					panel.add(etykietar23);
					JRadioButton r23 = new JRadioButton();
					r23.setEnabled(false);
					panel.add(r23);
					JLabel etykietar24 = new JLabel("BD");
					panel.add(etykietar24);
					JRadioButton r24 = new JRadioButton();
					r24.setEnabled(false);
					panel.add(r24);
					JLabel etykietar25 = new JLabel("X2   M");
					panel.add(etykietar25);
					JRadioButton r25 = new JRadioButton();
					r25.setEnabled(false);
					panel.add(r25);
					JLabel etykietar26 = new JLabel("M+");
					panel.add(etykietar26);
					JRadioButton r26 = new JRadioButton();
					r26.setEnabled(false);
					panel.add(r26);
					JLabel etykietar27 = new JLabel("S");
					panel.add(etykietar27);
					JRadioButton r27 = new JRadioButton();
					r27.setEnabled(false);
					panel.add(r27);
					JLabel etykietar28 = new JLabel("D-");
					panel.add(etykietar28);
					JRadioButton r28 = new JRadioButton();
					r28.setEnabled(false);
					panel.add(r28);
					JLabel etykietar29 = new JLabel("D");
					panel.add(etykietar29);
					JRadioButton r29 = new JRadioButton();
					r29.setEnabled(false);
					panel.add(r29);
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
					JButton przycisk4 = new JButton("Oblicz");
					panel.add(przycisk4);
					SwingUtilities.updateComponentTreeUI(panel);
					przycisk4.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent zdarzenie)
						{
							if (zdarzenie.getSource()==przycisk4)
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
								r9.setSelected(false);
								r10.setSelected(false);
								r11.setSelected(false);
								r12.setSelected(false);
								r13.setSelected(false);
								r14.setSelected(false);
								r15.setSelected(false);
								r16.setSelected(false);
								r17.setSelected(false);
								r18.setSelected(false);
								r19.setSelected(false);
								r20.setSelected(false);
								r21.setSelected(false);
								r22.setSelected(false);
								r23.setSelected(false);
								r24.setSelected(false);
								r25.setSelected(false);
								r26.setSelected(false);
								r27.setSelected(false);
								r28.setSelected(false);
								r29.setSelected(false);
								int x0 = slider0.getValue();
								double x0M = 0, x0Mp = 0, x0S = 0, x0Dm = 0, x0D = 0;
								if (x0 == 0)
								{
									x0M = 1;
								}
								if (x0 == 1)
								{
									x0M = 0.6;
									x0Mp = 0.4;
								}
								if (x0 == 2)
								{
									x0M = 0.2;
									x0Mp = 0.8;
								}
								if (x0 == 3)
								{
									x0Mp = 0.8;
									x0S = 0.2;
								}
								if (x0 == 4)
								{
									x0Mp = 0.4;
									x0S = 0.6;
								}
								if (x0 == 5)
								{
									x0S = 1;
								}
								if (x0 == 6)
								{
									x0S = 0.6;
									x0Dm = 0.4;
								}
								if (x0 == 7)
								{
									x0S = 0.2;
									x0Dm = 0.8;
								}
								if (x0 == 8)
								{
									x0Dm = 0.8;
									x0D = 0.2;
								}
								if (x0 == 9)
								{
									x0Dm = 0.4;
									x0D = 0.6;
								}
								if (x0 == 10)
								{
									x0D = 1;
								}
								/**
								 * Wejście X1.
								 */
								int x1 = slider1.getValue();
								double x1M = 0, x1Mp = 0, x1S = 0, x1Dm = 0, x1D = 0;
								if (x1 == 0)
								{
									x1M = 1;
								}
								if (x1 == 1)
								{
									x1M = 0.6;
									x1Mp = 0.4;
								}
								if (x1 == 2)
								{
									x1M = 0.2;
									x1Mp = 0.8;
								}
								if (x1 == 3)
								{
									x1Mp = 0.8;
									x1S = 0.2;
								}
								if (x1 == 4)
								{
									x1Mp = 0.4;
									x1S = 0.6;
								}
								if (x1 == 5)
								{
									x1S = 1;
								}
								if (x1 == 6)
								{
									x1S = 0.6;
									x1Dm = 0.4;
								}
								if (x1 == 7)
								{
									x1S = 0.2;
									x1Dm = 0.8;
								}
								if (x1 == 8)
								{
									x1Dm = 0.8;
									x1D = 0.2;
								}
								if (x1 == 9)
								{
									x1Dm = 0.4;
									x1D = 0.6;
								}
								if (x1 == 10)
								{
									x1D = 1;
								}
								/**
								 * Wejście X2.
								 */
								int x2 = slider2.getValue();
								double x2M = 0, x2Mp = 0, x2S = 0, x2Dm = 0, x2D = 0;
								if (x2 == 0)
								{
									x2M = 1;
								}
								if (x2 == 1)
								{
									x2M = 0.6;
									x2Mp = 0.4;
								}
								if (x2 == 2)
								{
									x2M = 0.2;
									x2Mp = 0.8;
								}
								if (x2 == 3)
								{
									x2Mp = 0.8;
									x2S = 0.2;
								}
								if (x2 == 4)
								{
									x2Mp = 0.4;
									x2S = 0.6;
								}
								if (x2 == 5)
								{
									x2S = 1;
								}
								if (x2 == 6)
								{
									x2S = 0.6;
									x2Dm = 0.4;
								}
								if (x2 == 7)
								{
									x2S = 0.2;
									x2Dm = 0.8;
								}
								if (x2 == 8)
								{
									x2Dm = 0.8;
									x2D = 0.2;
								}
								if (x2 == 9)
								{
									x2Dm = 0.4;
									x2D = 0.6;
								}
								if (x2 == 10)
								{
									x2D = 1;
								}
								/**
								 * Reguły rozmyte.
								 */
								double yBM = 0, yMm1 = 0, yMm2 = 0;
								double yM1 = 0, yM2 = 0, yM3 = 0;
								double yMp1 = 0, yMp2 = 0, yMp3 = 0, yMp4 = 0;
								double yS1 = 0, yS2 = 0, yS3 = 0, yS4 = 0, yS5 = 0;
								double yDm1 = 0, yDm2 = 0, yDm3 = 0, yDm4 = 0;
								double yD1 = 0, yD2 = 0, yD3 = 0;
								double yDp1 = 0, yDp2 = 0, yBD = 0;
								double yM4 = 0, yMp5 = 0, yS6 = 0, yDm5 = 0, yD4 = 0;
								if (x0M > 0 && x1M > 0)
								{
									r0.setSelected(true);
									yBM = x0M;
									if (x1M < yBM)
									{
										yBM = x1M;
									}
								}
								if (x0M > 0 && x1Mp > 0)
								{
									r1.setSelected(true);
									yMm1 = x0M;
									if (x1Mp < yMm1)
									{
										yMm1 = x1Mp;
									}
								}
								if (x0M > 0 && x1S > 0)
								{
									r2.setSelected(true);
									yM1 = x0M;
									if (x1S < yM1)
									{
										yM1 = x1S;
									}
								}
								if (x0M > 0 && x1Dm > 0)
								{
									r3.setSelected(true);
									yMp1 = x0M;
									if (x1Dm < yMp1)
									{
										yMp1 = x1Dm;
									}
								}
								if (x0M > 0 && x1D > 0)
								{
									r4.setSelected(true);
									yS1 = x0M;
									if (x1D < yS1)
									{
										yS1 = x1D;
									}
								}
								if (x0Mp > 0 && x1M > 0)
								{
									r5.setSelected(true);
									yMm2 = x0Mp;
									if (x1M < yMm2)
									{
										yMm2 = x1M;
									}
								}
								if (x0Mp > 0 && x1Mp > 0)
								{
									r6.setSelected(true);
									yM2 = x0Mp;
									if (x1Mp < yM2)
									{
										yM2 = x1Mp;
									}
								}
								if (x0Mp > 0 && x1S > 0)
								{
									r7.setSelected(true);
									yMp2 = x0Mp;
									if (x1S < yMp2)
									{
										yMp2 = x1S;
									}
								}
								if (x0Mp > 0 && x1Dm > 0)
								{
									r8.setSelected(true);
									yS2 = x0Mp;
									if (x1Dm < yS2)
									{
										yS2 = x1Dm;
									}
								}
								if (x0Mp > 0 && x1D > 0)
								{
									r9.setSelected(true);
									yDm1 = x0Mp;
									if (x1D < yDm1)
									{
										yDm1 = x1D;
									}
								}
								if (x0S > 0 && x1M > 0)
								{
									r10.setSelected(true);
									yM3 = x0S;
									if (x1M < yM3)
									{
										yM3 = x1M;
									}
								}
								if (x0S > 0 && x1Mp > 0)
								{
									r11.setSelected(true);
									yMp3 = x0S;
									if (x1Mp < yMp3)
									{
										yMp3 = x1Mp;
									}
								}
								if (x0S > 0 && x1S > 0)
								{
									r12.setSelected(true);
									yS3 = x0S;
									if (x1S < yS3)
									{
										yS3 = x1S;
									}
								}
								if (x0S > 0 && x1Dm > 0)
								{
									r13.setSelected(true);
									yDm2 = x0S;
									if (x1Dm < yDm2)
									{
										yDm2 = x1Dm;
									}
								}
								if (x0S > 0 && x1D > 0)
								{
									r14.setSelected(true);
									yD1 = x0S;
									if (x1D < yD1)
									{
										yD1 = x1D;
									}
								}
								if (x0Dm > 0 && x1M > 0)
								{
									r15.setSelected(true);
									yMp4 = x0Dm;
									if (x1M < yMp4)
									{
										yMp4 = x1M;
									}
								}
								if (x0Dm > 0 && x1Mp > 0)
								{
									r16.setSelected(true);
									yS4 = x0Dm;
									if (x1Mp < yS4)
									{
										yS4 = x1Mp;
									}
								}
								if (x0Dm > 0 && x1S > 0)
								{
									r17.setSelected(true);
									yDm3 = x0Dm;
									if (x1S < yDm3)
									{
										yDm3 = x1S;
									}
								}
								if (x0Dm > 0 && x1Dm > 0)
								{
									r18.setSelected(true);
									yD2 = x0Dm;
									if (x1Dm < yD2)
									{
										yD2 = x1Dm;
									}
								}
								if (x0Dm > 0 && x1D > 0)
								{
									r19.setSelected(true);
									yDp1 = x0Dm;
									if (x1D < yDp1)
									{
										yDp1 = x1D;
									}
								}
								if (x0D > 0 && x1M > 0)
								{
									r20.setSelected(true);
									yS5 = x0D;
									if (x1M < yS5)
									{
										yS5 = x1M;
									}
								}
								if (x0D > 0 && x1Mp > 0)
								{
									r21.setSelected(true);
									yDm4 = x0D;
									if (x1Mp < yDm4)
									{
										yDm4 = x1Mp;
									}
								}
								if (x0D > 0 && x1S > 0)
								{
									r22.setSelected(true);
									yD3 = x0D;
									if (x1S < yD3)
									{
										yD3 = x1S;
									}
								}
								if (x0D > 0 && x1Dm > 0)
								{
									r23.setSelected(true);
									yDp2 = x0D;
									if (x1Dm < yDp2)
									{
										yDp2 = x1Dm;
									}
								}
								if (x0D > 0 && x1D > 0)
								{
									r24.setSelected(true);
									yBD = x0D;
									if (x1D < yBD)
									{
										yBD = x1D;
									}
								}
								if (x2M > 0)
								{
									r25.setSelected(true);
									yM4 = x2M;
								}
								if (x2Mp > 0)
								{
									r26.setSelected(true);
									yMp5 = x2Mp;
								}
								if (x2S > 0)
								{
									r27.setSelected(true);
									yS6 = x2S;
								}
								if (x2Dm > 0)
								{
									r28.setSelected(true);
									yDm5 = x2Dm;
								}
								if (x2D > 0)
								{
									r29.setSelected(true);
									yD4 = x2D;
								}
								double yMm = 0, yM = 0, yMp = 0, yS = 0, yDm = 0, yD = 0, yDp = 0;
								yMm = yMm1;
								if (yMm2 > yMm)
								{
									yMm = yMm2;
								}
								yM = yM1;
								if (yM2 > yM)
								{
									yM = yM2;
								}
								if (yM3 > yM)
								{
									yM = yM3;
								}
								if (yM4 > yM)
								{
									yM = yM4;
								}
								yMp = yMp1;
								if (yMp2 > yMp)
								{
									yMp = yMp2;
								}
								if (yMp3 > yMp)
								{
									yMp = yMp3;
								}
								if (yMp4 > yMp)
								{
									yMp = yMp4;
								}
								if (yMp5 > yMp)
								{
									yMp = yMp5;
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
								if (yS4 > yS)
								{
									yS = yS4;
								}
								if (yS5 > yS)
								{
									yS = yS5;
								}
								if (yS6 > yS)
								{
									yS = yS6;
								}
								yDm = yDm1;
								if (yDm2 > yDm)
								{
									yDm = yDm2;
								}
								if (yDm3 > yDm)
								{
									yDm = yDm3;
								}
								if (yDm4 > yDm)
								{
									yDm = yDm4;
								}
								if (yDm5 > yDm)
								{
									yDm = yDm5;
								}
								yD = yD1;
								if (yD2 > yD)
								{
									yD = yD2;
								}
								if (yD3 > yD)
								{
									yD = yD3;
								}
								if (yD4 > yD)
								{
									yD = yD4;
								}
								yDp = yDp1;
								if (yDp2 > yDp)
								{
									yDp = yDp2;
								}
								/**
								 * Wyjście Y.
								 */
								int BM = 0, M = 25, S = 50, D = 75, BD = 100;
								double Mm = 12.5, Mp = 37.5, Dm = 62.5, Dp = 87.5;
								double y = (yBM*BM+yMm*Mm+yM*M+yMp*Mp+yS*S+yDm*Dm+yD*D+yDp*Dp+yBD*BD)/(yBM+yMm+yM+yMp+yS+yDm+yD+yDp+yBD);
								int y0 = (int) y;
								int y1 = 100 - (int) y;
								pasek0.setValue(y0);
								pasek1.setValue(y1);
							}
						}
					});
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
