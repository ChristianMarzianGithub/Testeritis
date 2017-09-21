package testeritis;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{

	
	public MainFrame() {
		this.setSize(800,480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		this.setLayout(null);
		
		JButton btn = new JButton();
		btn.setLocation(100, 100);
		btn.setSize(100, 100);
		
		JButton btn2 = new JButton();
		btn2.setSize(50, 50);
		
		buttonListener x = new buttonListener();
		btn2.addActionListener(x);
		
		button2Listener y = new button2Listener();
		btn.addActionListener(y);
		
		this.add(btn);		
		this.add(btn2);
	}
	
	
	
	
	
	
	
	
	
	

}
