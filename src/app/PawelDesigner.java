package app; //nazwa pakietu

import java.awt.*; //import bibliotek
import java.awt.event.*;
import javax.swing.*;

/**
 * Klasa PawelDesigner zawiera konstruktor i metody actionPerformed() i main().
 * @author Paweł Dudzik.
 */
public class PawelDesigner extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 0; //serializacja programu
	JPanel panel = new JPanel();
	JButton przycisk0 = new JButton("2wej/1wyj,3zb/zm");
	JButton przycisk1 = new JButton("2wej/1wyj,5zb/zm");
	JButton przycisk2 = new JButton("3wej/1wyj,3zb/zm");
	JButton przycisk3 = new JButton("3wej/2wyj,5zb/zm");
	JButton przycisk4 = new JButton("Oblicz");
	JSlider slider0 = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
	JSlider slider1 = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
	JSlider slider2 = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
	JRadioButton r0 = new JRadioButton();
	JRadioButton r1 = new JRadioButton();
	JRadioButton r2 = new JRadioButton();
	JRadioButton r3 = new JRadioButton();
	JRadioButton r4 = new JRadioButton();
	JRadioButton r5 = new JRadioButton();
	JRadioButton r6 = new JRadioButton();
	JRadioButton r7 = new JRadioButton();
	JRadioButton r8 = new JRadioButton();
	JRadioButton r9 = new JRadioButton();
	JRadioButton r10 = new JRadioButton();
	JRadioButton r11 = new JRadioButton();
	JRadioButton r12 = new JRadioButton();
	JRadioButton r13 = new JRadioButton();
	JRadioButton r14 = new JRadioButton();
	JRadioButton r15 = new JRadioButton();
	JRadioButton r16 = new JRadioButton();
	JRadioButton r17 = new JRadioButton();
	JRadioButton r18 = new JRadioButton();
	JRadioButton r19 = new JRadioButton();
	JRadioButton r20 = new JRadioButton();
	JRadioButton r21 = new JRadioButton();
	JRadioButton r22 = new JRadioButton();
	JRadioButton r23 = new JRadioButton();
	JRadioButton r24 = new JRadioButton();
	JRadioButton r25 = new JRadioButton();
	JRadioButton r26 = new JRadioButton();
	JRadioButton r27 = new JRadioButton();
	JRadioButton r28 = new JRadioButton();
	JRadioButton r29 = new JRadioButton();
	JLabel r0a = new JLabel("R0: IF X0 = M AND X1 = M THEN Y0 = BM");
	JLabel r1a = new JLabel("R1: IF X0 = M AND X1 = S THEN Y0 = M");
	JLabel r2a = new JLabel("R2: IF X0 = M AND X1 = D THEN Y0 = S");
	JLabel r3a = new JLabel("R3: IF X0 = S AND X1 = M THEN Y0 = M");
	JLabel r4a = new JLabel("R4: IF X0 = S AND X1 = S THEN Y0 = S");
	JLabel r5a = new JLabel("R5: IF X0 = S AND X1 = D THEN Y0 = D");
	JLabel r6a = new JLabel("R6: IF X0 = D AND X1 = M THEN Y0 = S");
	JLabel r7a = new JLabel("R7: IF X0 = D AND X1 = S THEN Y0 = D");
	JLabel r8a = new JLabel("R8: IF X0 = D AND X1 = D THEN Y0 = BD");
	JLabel r9a = new JLabel("R9: IF X2 = M THEN Y0 = M");
	JLabel r10a = new JLabel("R10: IF X2 = S THEN Y0 = S");
	JLabel r11a = new JLabel("            R11: IF X2 = D THEN Y0 = D            ");
	JLabel r0e = new JLabel("R0: IF X0 = M AND X1 = M THEN Y0 = BM");
	JLabel r1e = new JLabel("R1: IF X0 = M AND X1 = M+ THEN Y0 = M-");
	JLabel r2e = new JLabel("R2: IF X0 = M AND X1 = S THEN Y0 = M");
	JLabel r3e = new JLabel("R3: IF X0 = M AND X1 = D- THEN Y0 = M+");
	JLabel r4e = new JLabel("R4: IF X0 = M AND X1 = D THEN Y0 = S");
	JLabel r5e = new JLabel("R5: IF X0 = M+ AND X1 = M THEN Y0 = M-");
	JLabel r6e = new JLabel("R6: IF X0 = M+ AND X1 = M+ THEN Y0 = M");
	JLabel r7e = new JLabel("R7: IF X0 = M+ AND X1 = S THEN Y0 = M+");
	JLabel r8e = new JLabel("R8: IF X0 = M+ AND X1 = D- THEN Y0 = S");
	JLabel r9e = new JLabel("R9: IF X0 = M+ AND X1 = D THEN Y0 = D-");
	JLabel r10e = new JLabel("R10: IF X0 = S AND X1 = M THEN Y0 = M");
	JLabel r11e = new JLabel("R11: IF X0 = S AND X1 = M+ THEN Y0 = M+");
	JLabel r12e = new JLabel("R12: IF X0 = S AND X1 = S THEN Y0 = S");
	JLabel r13e = new JLabel("R13: IF X0 = S AND X1 = D- THEN Y0 = D-");
	JLabel r14e = new JLabel("R14: IF X0 = S AND X1 = D THEN Y0 = D");
	JLabel r15e = new JLabel("R15: IF X0 = D- AND X1 = M THEN Y0 = M+");
	JLabel r16e = new JLabel("R16: IF X0 = D- AND X1 = M+ THEN Y0 = S");
	JLabel r17e = new JLabel("R17: IF X0 = D- AND X1 = S THEN Y0 = D-");
	JLabel r18e = new JLabel("R18: IF X0 = D- AND X1 = D- THEN Y0 = D");
	JLabel r19e = new JLabel("R19: IF X0 = D- AND X1 = D THEN Y0 = D+");
	JLabel r20e = new JLabel("R20: IF X0 = D AND X1 = M THEN Y0 = S");
	JLabel r21e = new JLabel("R21: IF X0 = D AND X1 = M+ THEN Y0 = D-");
	JLabel r22e = new JLabel("R22: IF X0 = D AND X1 = S THEN Y0 = D");
	JLabel r23e = new JLabel("R23: IF X0 = D AND X1 = D- THEN Y0 = D+");
	JLabel r24e = new JLabel("R24: IF X0 = D AND X1 = D THEN Y0 = BD");
	JLabel r25e = new JLabel("R25: IF X2 = M THEN Y0 = M");
	JLabel r26e = new JLabel("R26: IF X2 = M+ THEN Y0 = M+");
	JLabel r27e = new JLabel("R27: IF X2 = S THEN Y0 = S");
	JLabel r28e = new JLabel("R28: IF X2 = D- THEN Y0 = D-");
	JLabel r29e = new JLabel("            R29: IF X2 = D THEN Y0 = D            ");
	JProgressBar pasek0 = new JProgressBar();
	JProgressBar pasek1 = new JProgressBar();
	/**
	 * Konstruktor służy do stworzenia okna programu.
	 */
	public PawelDesigner()
	{
		setTitle("PawelDesigner");
		setSize(250,1020);
		setLocation(350,0);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(panel);
		przycisk0.addActionListener(this);
		panel.add(przycisk0);
		przycisk1.addActionListener(this);
		panel.add(przycisk1);
		przycisk2.addActionListener(this);
		panel.add(przycisk2);
		przycisk3.addActionListener(this);
		panel.add(przycisk3);
	}
	/**
	 * Metoda actionPerformed() jest potrzebna do działania programu.
	 * @param zdarzenie Służy do obsługi zdarzeń.
	 */
	public void actionPerformed(ActionEvent zdarzenie)
	{
		if (zdarzenie.getSource()==(przycisk0) || zdarzenie.getSource()==(przycisk1)
				|| zdarzenie.getSource()==(przycisk2) || zdarzenie.getSource()==(przycisk3))
		{
			panel.remove(przycisk0);
			panel.remove(przycisk1);
			panel.remove(przycisk2);
			panel.remove(przycisk3);
			JLabel etykieta0 = new JLabel("X0");
			panel.add(etykieta0);
			slider0.setMajorTickSpacing(5);
			slider0.setMinorTickSpacing(1);
			slider0.setPaintLabels(true);
			slider0.setPaintTicks(true);
			panel.add(slider0);
			JLabel etykieta1 = new JLabel("X1");
			panel.add(etykieta1);
			slider1.setMajorTickSpacing(5);
			slider1.setMinorTickSpacing(1);
			slider1.setPaintLabels(true);
			slider1.setPaintTicks(true);
			panel.add(slider1);
		}
		if (zdarzenie.getSource()==(przycisk2) || zdarzenie.getSource()==(przycisk3))
		{
			JLabel etykieta2 = new JLabel("X2");
			panel.add(etykieta2);
			slider2.setMajorTickSpacing(5);
			slider2.setMinorTickSpacing(1);
			slider2.setPaintLabels(true);
			slider2.setPaintTicks(true);
			panel.add(slider2);
		}
		if (zdarzenie.getSource()==(przycisk0) || zdarzenie.getSource()==(przycisk2))
		{
			JLabel etykieta3 = new JLabel("X0/X1         M                     S                    D");
			panel.add(etykieta3);
			JLabel etykietar0 = new JLabel("  M       BM");
			panel.add(etykietar0);
			r0.setEnabled(false);
			panel.add(r0);
			JLabel etykietar1 = new JLabel("          M");
			panel.add(etykietar1);
			r1.setEnabled(false);
			panel.add(r1);
			JLabel etykietar2 = new JLabel("          S");
			panel.add(etykietar2);
			r2.setEnabled(false);
			panel.add(r2);
			JLabel etykietar3 = new JLabel("  S         M");
			panel.add(etykietar3);
			r3.setEnabled(false);
			panel.add(r3);
			JLabel etykietar4 = new JLabel("           S");
			panel.add(etykietar4);
			r4.setEnabled(false);
			panel.add(r4);
			JLabel etykietar5 = new JLabel("          D");
			panel.add(etykietar5);
			r5.setEnabled(false);
			panel.add(r5);
			JLabel etykietar6 = new JLabel("  D         S");
			panel.add(etykietar6);
			r6.setEnabled(false);
			panel.add(r6);
			JLabel etykietar7 = new JLabel("           D");
			panel.add(etykietar7);
			r7.setEnabled(false);
			panel.add(r7);
			JLabel etykietar8 = new JLabel("        BD");
			panel.add(etykietar8);
			r8.setEnabled(false);
			panel.add(r8);
		}
		if (zdarzenie.getSource()==(przycisk1) || zdarzenie.getSource()==(przycisk3))
		{
			JLabel etykieta3 = new JLabel("X0/X1  M           M+        S              D-         D");
			panel.add(etykieta3);
			JLabel etykietar0 = new JLabel("M BM");
			panel.add(etykietar0);
			r0.setEnabled(false);
			panel.add(r0);
			JLabel etykietar1 = new JLabel("M-");
			panel.add(etykietar1);
			r1.setEnabled(false);
			panel.add(r1);
			JLabel etykietar2 = new JLabel("M");
			panel.add(etykietar2);
			r2.setEnabled(false);
			panel.add(r2);
			JLabel etykietar3 = new JLabel("M+");
			panel.add(etykietar3);
			r3.setEnabled(false);
			panel.add(r3);
			JLabel etykietar4 = new JLabel("S");
			panel.add(etykietar4);
			r4.setEnabled(false);
			panel.add(r4);
			JLabel etykietar5 = new JLabel("M+ M-");
			panel.add(etykietar5);
			r5.setEnabled(false);
			panel.add(r5);
			JLabel etykietar6 = new JLabel("M");
			panel.add(etykietar6);
			r6.setEnabled(false);
			panel.add(r6);
			JLabel etykietar7 = new JLabel("M+");
			panel.add(etykietar7);
			r7.setEnabled(false);
			panel.add(r7);
			JLabel etykietar8 = new JLabel("S");
			panel.add(etykietar8);
			r8.setEnabled(false);
			panel.add(r8);
			JLabel etykietar9 = new JLabel("D-");
			panel.add(etykietar9);
			r9.setEnabled(false);
			panel.add(r9);
			JLabel etykietar10 = new JLabel("S    M");
			panel.add(etykietar10);
			r10.setEnabled(false);
			panel.add(r10);
			JLabel etykietar11 = new JLabel("M+");
			panel.add(etykietar11);
			r11.setEnabled(false);
			panel.add(r11);
			JLabel etykietar12 = new JLabel("S");
			panel.add(etykietar12);
			r12.setEnabled(false);
			panel.add(r12);
			JLabel etykietar13 = new JLabel("D-");
			panel.add(etykietar13);
			r13.setEnabled(false);
			panel.add(r13);
			JLabel etykietar14 = new JLabel("D");
			panel.add(etykietar14);
			r14.setEnabled(false);
			panel.add(r14);
			JLabel etykietar15 = new JLabel("D- M+");
			panel.add(etykietar15);
			r15.setEnabled(false);
			panel.add(r15);
			JLabel etykietar16 = new JLabel("S");
			panel.add(etykietar16);
			r16.setEnabled(false);
			panel.add(r16);
			JLabel etykietar17 = new JLabel("D-");
			panel.add(etykietar17);
			r17.setEnabled(false);
			panel.add(r17);
			JLabel etykietar18 = new JLabel("D");
			panel.add(etykietar18);
			r18.setEnabled(false);
			panel.add(r18);
			JLabel etykietar19 = new JLabel("D+");
			panel.add(etykietar19);
			r19.setEnabled(false);
			panel.add(r19);
			JLabel etykietar20 = new JLabel("D     S");
			panel.add(etykietar20);
			r20.setEnabled(false);
			panel.add(r20);
			JLabel etykietar21 = new JLabel("D-");
			panel.add(etykietar21);
			r21.setEnabled(false);
			panel.add(r21);
			JLabel etykietar22 = new JLabel("D");
			panel.add(etykietar22);
			r22.setEnabled(false);
			panel.add(r22);
			JLabel etykietar23 = new JLabel("D+");
			panel.add(etykietar23);
			r23.setEnabled(false);
			panel.add(r23);
			JLabel etykietar24 = new JLabel("BD");
			panel.add(etykietar24);
			r24.setEnabled(false);
			panel.add(r24);
		}
		/**
		 * 2 wejścia na 1 wyjście, 3 zbiory na zmienną.
		 */
		if (zdarzenie.getSource()==przycisk0)
		{
			panel.add(r0a);
			panel.add(r1a);
			panel.add(r2a);
			panel.add(r3a);
			panel.add(r4a);
			panel.add(r5a);
			panel.add(r6a);
			panel.add(r7a);
			panel.add(r8a);
			JLabel etykietay0 = new JLabel("           Y0");
			panel.add(etykietay0);
			pasek0.setStringPainted(true);
			panel.add(pasek0);
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
						r0a.setForeground(Color.LIGHT_GRAY);
						r1a.setForeground(Color.LIGHT_GRAY);
						r2a.setForeground(Color.LIGHT_GRAY);
						r3a.setForeground(Color.LIGHT_GRAY);
						r4a.setForeground(Color.LIGHT_GRAY);
						r5a.setForeground(Color.LIGHT_GRAY);
						r6a.setForeground(Color.LIGHT_GRAY);
						r7a.setForeground(Color.LIGHT_GRAY);
						r8a.setForeground(Color.LIGHT_GRAY);
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
							r0a.setForeground(Color.BLACK);
							yBM = x0M;
							if (x1M < yBM)
							{
								yBM = x1M;
							}
						}
						if (x0M > 0 && x1S > 0)
						{
							r1.setSelected(true);
							r1a.setForeground(Color.BLACK);
							yM1 = x0M;
							if (x1S < yM1)
							{
								yM1 = x1S;
							}
						}
						if (x0M > 0 && x1D > 0)
						{
							r2.setSelected(true);
							r2a.setForeground(Color.BLACK);
							yS1 = x0M;
							if (x1D < yS1)
							{
								yS1 = x1D;
							}
						}
						if (x0S > 0 && x1M > 0)
						{
							r3.setSelected(true);
							r3a.setForeground(Color.BLACK);
							yM2 = x0S;
							if (x1M < yM2)
							{
								yM2 = x1M;
							}
						}
						if (x0S > 0 && x1S > 0)
						{
							r4.setSelected(true);
							r4a.setForeground(Color.BLACK);
							yS2 = x0S;
							if (x1S < yS2)
							{
								yS2 = x1S;
							}
						}
						if (x0S > 0 && x1D > 0)
						{
							r5.setSelected(true);
							r5a.setForeground(Color.BLACK);
							yD1 = x0S;
							if (x1D < yD1)
							{
								yD1 = x1D;
							}
						}
						if (x0D > 0 && x1M > 0)
						{
							r6.setSelected(true);
							r6a.setForeground(Color.BLACK);
							yS3 = x0D;
							if (x1M < yS3)
							{
								yS3 = x1M;
							}
						}
						if (x0D > 0 && x1S > 0)
						{
							r7.setSelected(true);
							r7a.setForeground(Color.BLACK);
							yD2 = x0D;
							if (x1S < yD2)
							{
								yD2 = x1S;
							}
						}
						if (x0D > 0 && x1D > 0)
						{
							r8.setSelected(true);
							r8a.setForeground(Color.BLACK);
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
		/**
		 * 2 wejścia na 1 wyjście, 5 zbiorów na zmienną.
		 */
		if (zdarzenie.getSource()==przycisk1)
		{
			r0e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r0e);
			r1e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r1e);
			r2e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r2e);
			r3e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r3e);
			r4e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r4e);
			r5e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r5e);
			r6e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r6e);
			r7e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r7e);
			r8e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r8e);
			r9e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r9e);
			r10e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r10e);
			r11e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r11e);
			r12e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r12e);
			r13e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r13e);
			r14e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r14e);
			r15e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r15e);
			r16e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r16e);
			r17e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r17e);
			r18e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r18e);
			r19e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r19e);
			r20e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r20e);
			r21e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r21e);
			r22e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r22e);
			r23e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r23e);
			r24e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r24e);
			JLabel etykietay0 = new JLabel("           Y0");
			panel.add(etykietay0);
			pasek0.setStringPainted(true);
			panel.add(pasek0);
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
						r0e.setForeground(Color.LIGHT_GRAY);
						r1e.setForeground(Color.LIGHT_GRAY);
						r2e.setForeground(Color.LIGHT_GRAY);
						r3e.setForeground(Color.LIGHT_GRAY);
						r4e.setForeground(Color.LIGHT_GRAY);
						r5e.setForeground(Color.LIGHT_GRAY);
						r6e.setForeground(Color.LIGHT_GRAY);
						r7e.setForeground(Color.LIGHT_GRAY);
						r8e.setForeground(Color.LIGHT_GRAY);
						r9e.setForeground(Color.LIGHT_GRAY);
						r10e.setForeground(Color.LIGHT_GRAY);
						r11e.setForeground(Color.LIGHT_GRAY);
						r12e.setForeground(Color.LIGHT_GRAY);
						r13e.setForeground(Color.LIGHT_GRAY);
						r14e.setForeground(Color.LIGHT_GRAY);
						r15e.setForeground(Color.LIGHT_GRAY);
						r16e.setForeground(Color.LIGHT_GRAY);
						r17e.setForeground(Color.LIGHT_GRAY);
						r18e.setForeground(Color.LIGHT_GRAY);
						r19e.setForeground(Color.LIGHT_GRAY);
						r20e.setForeground(Color.LIGHT_GRAY);
						r21e.setForeground(Color.LIGHT_GRAY);
						r22e.setForeground(Color.LIGHT_GRAY);
						r23e.setForeground(Color.LIGHT_GRAY);
						r24e.setForeground(Color.LIGHT_GRAY);
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
							r0e.setForeground(Color.BLACK);
							yBM = x0M;
							if (x1M < yBM)
							{
								yBM = x1M;
							}
						}
						if (x0M > 0 && x1Mp > 0)
						{
							r1.setSelected(true);
							r1e.setForeground(Color.BLACK);
							yMm1 = x0M;
							if (x1Mp < yMm1)
							{
								yMm1 = x1Mp;
							}
						}
						if (x0M > 0 && x1S > 0)
						{
							r2.setSelected(true);
							r2e.setForeground(Color.BLACK);
							yM1 = x0M;
							if (x1S < yM1)
							{
								yM1 = x1S;
							}
						}
						if (x0M > 0 && x1Dm > 0)
						{
							r3.setSelected(true);
							r3e.setForeground(Color.BLACK);
							yMp1 = x0M;
							if (x1Dm < yMp1)
							{
								yMp1 = x1Dm;
							}
						}
						if (x0M > 0 && x1D > 0)
						{
							r4.setSelected(true);
							r4e.setForeground(Color.BLACK);
							yS1 = x0M;
							if (x1D < yS1)
							{
								yS1 = x1D;
							}
						}
						if (x0Mp > 0 && x1M > 0)
						{
							r5.setSelected(true);
							r5e.setForeground(Color.BLACK);
							yMm2 = x0Mp;
							if (x1M < yMm2)
							{
								yMm2 = x1M;
							}
						}
						if (x0Mp > 0 && x1Mp > 0)
						{
							r6.setSelected(true);
							r6e.setForeground(Color.BLACK);
							yM2 = x0Mp;
							if (x1Mp < yM2)
							{
								yM2 = x1Mp;
							}
						}
						if (x0Mp > 0 && x1S > 0)
						{
							r7.setSelected(true);
							r7e.setForeground(Color.BLACK);
							yMp2 = x0Mp;
							if (x1S < yMp2)
							{
								yMp2 = x1S;
							}
						}
						if (x0Mp > 0 && x1Dm > 0)
						{
							r8.setSelected(true);
							r8e.setForeground(Color.BLACK);
							yS2 = x0Mp;
							if (x1Dm < yS2)
							{
								yS2 = x1Dm;
							}
						}
						if (x0Mp > 0 && x1D > 0)
						{
							r9.setSelected(true);
							r9e.setForeground(Color.BLACK);
							yDm1 = x0Mp;
							if (x1D < yDm1)
							{
								yDm1 = x1D;
							}
						}
						if (x0S > 0 && x1M > 0)
						{
							r10.setSelected(true);
							r10e.setForeground(Color.BLACK);
							yM3 = x0S;
							if (x1M < yM3)
							{
								yM3 = x1M;
							}
						}
						if (x0S > 0 && x1Mp > 0)
						{
							r11.setSelected(true);
							r11e.setForeground(Color.BLACK);
							yMp3 = x0S;
							if (x1Mp < yMp3)
							{
								yMp3 = x1Mp;
							}
						}
						if (x0S > 0 && x1S > 0)
						{
							r12.setSelected(true);
							r12e.setForeground(Color.BLACK);
							yS3 = x0S;
							if (x1S < yS3)
							{
								yS3 = x1S;
							}
						}
						if (x0S > 0 && x1Dm > 0)
						{
							r13.setSelected(true);
							r13e.setForeground(Color.BLACK);
							yDm2 = x0S;
							if (x1Dm < yDm2)
							{
								yDm2 = x1Dm;
							}
						}
						if (x0S > 0 && x1D > 0)
						{
							r14.setSelected(true);
							r14e.setForeground(Color.BLACK);
							yD1 = x0S;
							if (x1D < yD1)
							{
								yD1 = x1D;
							}
						}
						if (x0Dm > 0 && x1M > 0)
						{
							r15.setSelected(true);
							r15e.setForeground(Color.BLACK);
							yMp4 = x0Dm;
							if (x1M < yMp4)
							{
								yMp4 = x1M;
							}
						}
						if (x0Dm > 0 && x1Mp > 0)
						{
							r16.setSelected(true);
							r16e.setForeground(Color.BLACK);
							yS4 = x0Dm;
							if (x1Mp < yS4)
							{
								yS4 = x1Mp;
							}
						}
						if (x0Dm > 0 && x1S > 0)
						{
							r17.setSelected(true);
							r17e.setForeground(Color.BLACK);
							yDm3 = x0Dm;
							if (x1S < yDm3)
							{
								yDm3 = x1S;
							}
						}
						if (x0Dm > 0 && x1Dm > 0)
						{
							r18.setSelected(true);
							r18e.setForeground(Color.BLACK);
							yD2 = x0Dm;
							if (x1Dm < yD2)
							{
								yD2 = x1Dm;
							}
						}
						if (x0Dm > 0 && x1D > 0)
						{
							r19.setSelected(true);
							r19e.setForeground(Color.BLACK);
							yDp1 = x0Dm;
							if (x1D < yDp1)
							{
								yDp1 = x1D;
							}
						}
						if (x0D > 0 && x1M > 0)
						{
							r20.setSelected(true);
							r20e.setForeground(Color.BLACK);
							yS5 = x0D;
							if (x1M < yS5)
							{
								yS5 = x1M;
							}
						}
						if (x0D > 0 && x1Mp > 0)
						{
							r21.setSelected(true);
							r21e.setForeground(Color.BLACK);
							yDm4 = x0D;
							if (x1Mp < yDm4)
							{
								yDm4 = x1Mp;
							}
						}
						if (x0D > 0 && x1S > 0)
						{
							r22.setSelected(true);
							r22e.setForeground(Color.BLACK);
							yD3 = x0D;
							if (x1S < yD3)
							{
								yD3 = x1S;
							}
						}
						if (x0D > 0 && x1Dm > 0)
						{
							r23.setSelected(true);
							r23e.setForeground(Color.BLACK);
							yDp2 = x0D;
							if (x1Dm < yDp2)
							{
								yDp2 = x1Dm;
							}
						}
						if (x0D > 0 && x1D > 0)
						{
							r24.setSelected(true);
							r24e.setForeground(Color.BLACK);
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
		/**
		 * 3 wejścia na 1 wyjście, 3 zbiory na zmienną.
		 */
		if (zdarzenie.getSource()==przycisk2)
		{
			JLabel etykietar9 = new JLabel("X2       M");
			panel.add(etykietar9);
			r9.setEnabled(false);
			panel.add(r9);
			JLabel etykietar10 = new JLabel("           S");
			panel.add(etykietar10);
			r10.setEnabled(false);
			panel.add(r10);
			JLabel etykietar11 = new JLabel("           D");
			panel.add(etykietar11);
			r11.setEnabled(false);
			panel.add(r11);
			panel.add(r0a);
			panel.add(r1a);
			panel.add(r2a);
			panel.add(r3a);
			panel.add(r4a);
			panel.add(r5a);
			panel.add(r6a);
			panel.add(r7a);
			panel.add(r8a);
			panel.add(r9a);
			panel.add(r10a);
			panel.add(r11a);
			JLabel etykietay0 = new JLabel("           Y0");
			panel.add(etykietay0);
			pasek0.setStringPainted(true);
			panel.add(pasek0);
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
						r0a.setForeground(Color.LIGHT_GRAY);
						r1a.setForeground(Color.LIGHT_GRAY);
						r2a.setForeground(Color.LIGHT_GRAY);
						r3a.setForeground(Color.LIGHT_GRAY);
						r4a.setForeground(Color.LIGHT_GRAY);
						r5a.setForeground(Color.LIGHT_GRAY);
						r6a.setForeground(Color.LIGHT_GRAY);
						r7a.setForeground(Color.LIGHT_GRAY);
						r8a.setForeground(Color.LIGHT_GRAY);
						r9a.setForeground(Color.LIGHT_GRAY);
						r10a.setForeground(Color.LIGHT_GRAY);
						r11a.setForeground(Color.LIGHT_GRAY);
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
							r0a.setForeground(Color.BLACK);
							yBM = x0M;
							if (x1M < yBM)
							{
								yBM = x1M;
							}
						}
						if (x0M > 0 && x1S > 0)
						{
							r1.setSelected(true);
							r1a.setForeground(Color.BLACK);
							yM1 = x0M;
							if (x1S < yM1)
							{
								yM1 = x1S;
							}
						}
						if (x0M > 0 && x1D > 0)
						{
							r2.setSelected(true);
							r2a.setForeground(Color.BLACK);
							yS1 = x0M;
							if (x1D < yS1)
							{
								yS1 = x1D;
							}
						}
						if (x0S > 0 && x1M > 0)
						{
							r3.setSelected(true);
							r3a.setForeground(Color.BLACK);
							yM2 = x0S;
							if (x1M < yM2)
							{
								yM2 = x1M;
							}
						}
						if (x0S > 0 && x1S > 0)
						{
							r4.setSelected(true);
							r4a.setForeground(Color.BLACK);
							yS2 = x0S;
							if (x1S < yS2)
							{
								yS2 = x1S;
							}
						}
						if (x0S > 0 && x1D > 0)
						{
							r5.setSelected(true);
							r5a.setForeground(Color.BLACK);
							yD1 = x0S;
							if (x1D < yD1)
							{
								yD1 = x1D;
							}
						}
						if (x0D > 0 && x1M > 0)
						{
							r6.setSelected(true);
							r6a.setForeground(Color.BLACK);
							yS3 = x0D;
							if (x1M < yS3)
							{
								yS3 = x1M;
							}
						}
						if (x0D > 0 && x1S > 0)
						{
							r7.setSelected(true);
							r7a.setForeground(Color.BLACK);
							yD2 = x0D;
							if (x1S < yD2)
							{
								yD2 = x1S;
							}
						}
						if (x0D > 0 && x1D > 0)
						{
							r8.setSelected(true);
							r8a.setForeground(Color.BLACK);
							yBD = x0D;
							if (x1D < yBD)
							{
								yBD = x1D;
							}
						}
						if (x2M > 0)
						{
							r9.setSelected(true);
							r9a.setForeground(Color.BLACK);
							yM3 = x2M;
						}
						if (x2S > 0)
						{
							r10.setSelected(true);
							r10a.setForeground(Color.BLACK);
							yS4 = x2S;
						}
						if (x2D > 0)
						{
							r11.setSelected(true);
							r11a.setForeground(Color.BLACK);
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
		/**
		 * 3 wejścia na 2 wyjścia, 5 zbiorów na zmienną.
		 */
		if (zdarzenie.getSource()==przycisk3)
		{
			JLabel etykietar25 = new JLabel("X2   M");
			panel.add(etykietar25);
			r25.setEnabled(false);
			panel.add(r25);
			JLabel etykietar26 = new JLabel("M+");
			panel.add(etykietar26);
			r26.setEnabled(false);
			panel.add(r26);
			JLabel etykietar27 = new JLabel("S");
			panel.add(etykietar27);
			r27.setEnabled(false);
			panel.add(r27);
			JLabel etykietar28 = new JLabel("D-");
			panel.add(etykietar28);
			r28.setEnabled(false);
			panel.add(r28);
			JLabel etykietar29 = new JLabel("D");
			panel.add(etykietar29);
			r29.setEnabled(false);
			panel.add(r29);
			r0e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r0e);
			r1e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r1e);
			r2e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r2e);
			r3e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r3e);
			r4e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r4e);
			r5e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r5e);
			r6e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r6e);
			r7e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r7e);
			r8e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r8e);
			r9e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r9e);
			r10e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r10e);
			r11e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r11e);
			r12e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r12e);
			r13e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r13e);
			r14e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r14e);
			r15e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r15e);
			r16e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r16e);
			r17e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r17e);
			r18e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r18e);
			r19e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r19e);
			r20e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r20e);
			r21e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r21e);
			r22e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r22e);
			r23e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r23e);;
			r24e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r24e);
			r25e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r25e);
			r26e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r26e);;
			r27e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r27e);
			r28e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r28e);
			r29e.setFont(new Font("Dialog", Font.BOLD, 10));
			panel.add(r29e);
			JLabel etykietay0 = new JLabel("           Y0");
			panel.add(etykietay0);
			pasek0.setStringPainted(true);
			panel.add(pasek0);
			JLabel etykietay1 = new JLabel("           Y1");
			panel.add(etykietay1);
			pasek1.setStringPainted(true);
			panel.add(pasek1);
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
						r0e.setForeground(Color.LIGHT_GRAY);
						r1e.setForeground(Color.LIGHT_GRAY);
						r2e.setForeground(Color.LIGHT_GRAY);
						r3e.setForeground(Color.LIGHT_GRAY);
						r4e.setForeground(Color.LIGHT_GRAY);
						r5e.setForeground(Color.LIGHT_GRAY);
						r6e.setForeground(Color.LIGHT_GRAY);
						r7e.setForeground(Color.LIGHT_GRAY);
						r8e.setForeground(Color.LIGHT_GRAY);
						r9e.setForeground(Color.LIGHT_GRAY);
						r10e.setForeground(Color.LIGHT_GRAY);
						r11e.setForeground(Color.LIGHT_GRAY);
						r12e.setForeground(Color.LIGHT_GRAY);
						r13e.setForeground(Color.LIGHT_GRAY);
						r14e.setForeground(Color.LIGHT_GRAY);
						r15e.setForeground(Color.LIGHT_GRAY);
						r16e.setForeground(Color.LIGHT_GRAY);
						r17e.setForeground(Color.LIGHT_GRAY);
						r18e.setForeground(Color.LIGHT_GRAY);
						r19e.setForeground(Color.LIGHT_GRAY);
						r20e.setForeground(Color.LIGHT_GRAY);
						r21e.setForeground(Color.LIGHT_GRAY);
						r22e.setForeground(Color.LIGHT_GRAY);
						r23e.setForeground(Color.LIGHT_GRAY);
						r24e.setForeground(Color.LIGHT_GRAY);
						r25e.setForeground(Color.LIGHT_GRAY);
						r26e.setForeground(Color.LIGHT_GRAY);
						r27e.setForeground(Color.LIGHT_GRAY);
						r28e.setForeground(Color.LIGHT_GRAY);
						r29e.setForeground(Color.LIGHT_GRAY);
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
							r0e.setForeground(Color.BLACK);
							yBM = x0M;
							if (x1M < yBM)
							{
								yBM = x1M;
							}
						}
						if (x0M > 0 && x1Mp > 0)
						{
							r1.setSelected(true);
							r1e.setForeground(Color.BLACK);
							yMm1 = x0M;
							if (x1Mp < yMm1)
							{
								yMm1 = x1Mp;
							}
						}
						if (x0M > 0 && x1S > 0)
						{
							r2.setSelected(true);
							r2e.setForeground(Color.BLACK);
							yM1 = x0M;
							if (x1S < yM1)
							{
								yM1 = x1S;
							}
						}
						if (x0M > 0 && x1Dm > 0)
						{
							r3.setSelected(true);
							r3e.setForeground(Color.BLACK);
							yMp1 = x0M;
							if (x1Dm < yMp1)
							{
								yMp1 = x1Dm;
							}
						}
						if (x0M > 0 && x1D > 0)
						{
							r4.setSelected(true);
							r4e.setForeground(Color.BLACK);
							yS1 = x0M;
							if (x1D < yS1)
							{
								yS1 = x1D;
							}
						}
						if (x0Mp > 0 && x1M > 0)
						{
							r5.setSelected(true);
							r5e.setForeground(Color.BLACK);
							yMm2 = x0Mp;
							if (x1M < yMm2)
							{
								yMm2 = x1M;
							}
						}
						if (x0Mp > 0 && x1Mp > 0)
						{
							r6.setSelected(true);
							r6e.setForeground(Color.BLACK);
							yM2 = x0Mp;
							if (x1Mp < yM2)
							{
								yM2 = x1Mp;
							}
						}
						if (x0Mp > 0 && x1S > 0)
						{
							r7.setSelected(true);
							r7e.setForeground(Color.BLACK);
							yMp2 = x0Mp;
							if (x1S < yMp2)
							{
								yMp2 = x1S;
							}
						}
						if (x0Mp > 0 && x1Dm > 0)
						{
							r8.setSelected(true);
							r8e.setForeground(Color.BLACK);
							yS2 = x0Mp;
							if (x1Dm < yS2)
							{
								yS2 = x1Dm;
							}
						}
						if (x0Mp > 0 && x1D > 0)
						{
							r9.setSelected(true);
							r9e.setForeground(Color.BLACK);
							yDm1 = x0Mp;
							if (x1D < yDm1)
							{
								yDm1 = x1D;
							}
						}
						if (x0S > 0 && x1M > 0)
						{
							r10.setSelected(true);
							r10e.setForeground(Color.BLACK);
							yM3 = x0S;
							if (x1M < yM3)
							{
								yM3 = x1M;
							}
						}
						if (x0S > 0 && x1Mp > 0)
						{
							r11.setSelected(true);
							r11e.setForeground(Color.BLACK);
							yMp3 = x0S;
							if (x1Mp < yMp3)
							{
								yMp3 = x1Mp;
							}
						}
						if (x0S > 0 && x1S > 0)
						{
							r12.setSelected(true);
							r12e.setForeground(Color.BLACK);
							yS3 = x0S;
							if (x1S < yS3)
							{
								yS3 = x1S;
							}
						}
						if (x0S > 0 && x1Dm > 0)
						{
							r13.setSelected(true);
							r13e.setForeground(Color.BLACK);
							yDm2 = x0S;
							if (x1Dm < yDm2)
							{
								yDm2 = x1Dm;
							}
						}
						if (x0S > 0 && x1D > 0)
						{
							r14.setSelected(true);
							r14e.setForeground(Color.BLACK);
							yD1 = x0S;
							if (x1D < yD1)
							{
								yD1 = x1D;
							}
						}
						if (x0Dm > 0 && x1M > 0)
						{
							r15.setSelected(true);
							r15e.setForeground(Color.BLACK);
							yMp4 = x0Dm;
							if (x1M < yMp4)
							{
								yMp4 = x1M;
							}
						}
						if (x0Dm > 0 && x1Mp > 0)
						{
							r16.setSelected(true);
							r16e.setForeground(Color.BLACK);
							yS4 = x0Dm;
							if (x1Mp < yS4)
							{
								yS4 = x1Mp;
							}
						}
						if (x0Dm > 0 && x1S > 0)
						{
							r17.setSelected(true);
							r17e.setForeground(Color.BLACK);
							yDm3 = x0Dm;
							if (x1S < yDm3)
							{
								yDm3 = x1S;
							}
						}
						if (x0Dm > 0 && x1Dm > 0)
						{
							r18.setSelected(true);
							r18e.setForeground(Color.BLACK);
							yD2 = x0Dm;
							if (x1Dm < yD2)
							{
								yD2 = x1Dm;
							}
						}
						if (x0Dm > 0 && x1D > 0)
						{
							r19.setSelected(true);
							r19e.setForeground(Color.BLACK);
							yDp1 = x0Dm;
							if (x1D < yDp1)
							{
								yDp1 = x1D;
							}
						}
						if (x0D > 0 && x1M > 0)
						{
							r20.setSelected(true);
							r20e.setForeground(Color.BLACK);
							yS5 = x0D;
							if (x1M < yS5)
							{
								yS5 = x1M;
							}
						}
						if (x0D > 0 && x1Mp > 0)
						{
							r21.setSelected(true);
							r21e.setForeground(Color.BLACK);
							yDm4 = x0D;
							if (x1Mp < yDm4)
							{
								yDm4 = x1Mp;
							}
						}
						if (x0D > 0 && x1S > 0)
						{
							r22.setSelected(true);
							r22e.setForeground(Color.BLACK);
							yD3 = x0D;
							if (x1S < yD3)
							{
								yD3 = x1S;
							}
						}
						if (x0D > 0 && x1Dm > 0)
						{
							r23.setSelected(true);
							r23e.setForeground(Color.BLACK);
							yDp2 = x0D;
							if (x1Dm < yDp2)
							{
								yDp2 = x1Dm;
							}
						}
						if (x0D > 0 && x1D > 0)
						{
							r24.setSelected(true);
							r24e.setForeground(Color.BLACK);
							yBD = x0D;
							if (x1D < yBD)
							{
								yBD = x1D;
							}
						}
						if (x2M > 0)
						{
							r25.setSelected(true);
							r25e.setForeground(Color.BLACK);
							yM4 = x2M;
						}
						if (x2Mp > 0)
						{
							r26.setSelected(true);
							r26e.setForeground(Color.BLACK);
							yMp5 = x2Mp;
						}
						if (x2S > 0)
						{
							r27.setSelected(true);
							r27e.setForeground(Color.BLACK);
							yS6 = x2S;
						}
						if (x2Dm > 0)
						{
							r28.setSelected(true);
							r28e.setForeground(Color.BLACK);
							yDm5 = x2Dm;
						}
						if (x2D > 0)
						{
							r29.setSelected(true);
							r29e.setForeground(Color.BLACK);
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
