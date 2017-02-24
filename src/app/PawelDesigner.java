package app;

import javax.swing.*;

public class PawelDesigner extends JFrame {
	private static final long serialVersionUID = 0;
	public PawelDesigner()
	{
		super("PawelDesigner");
		setVisible(true);
		setResizable(false);
		setSize(300,300);
		setLocation(600,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new PawelDesigner();
	}
}
