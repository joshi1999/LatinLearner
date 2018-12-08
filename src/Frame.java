import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame
{
	JButton verben;
	JButton nomen;
	JButton adjective;
	JButton back;
	JButton proof;
	
	VokabelPackage vp;
	
	String mode;
	
	int width = 600;
	int height = 600;
	
	public Frame()
	{
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		setLayout(null);
		createEverything();
	}
	
	public void toggleFaceMenu(boolean status)
	{
		verben.setVisible(status);
		adjective.setVisible(status);
		nomen.setVisible(status);
		mode = "menu";
	}
	public void toggleFaceNomen(boolean status)
	{
		mode = "nomen";
	}
	public void toggleFaceVerben(boolean status)
	{
		mode = "verben";
	}
	public void toggleFaceAdjective(boolean status)
	{
		mode = "adjective";
	}
	
	public void createEverything()
	{
		vp = new VokabelPackage();
		verben = new JButton("Verben");
		verben.setBounds(200, 400, 200, 95);
		verben.addActionListener(new LayoutButtonListener(this));
		nomen = new JButton("Nomen");
		nomen.setBounds(200, 5, 200, 95);
		this.add(nomen);
		this.add(verben);
		nomen.addActionListener(new LayoutButtonListener(this));
		adjective = new JButton();
		adjective.addActionListener(new LayoutButtonListener(this));
		toggleFaceMenu(true);
		
	}
}