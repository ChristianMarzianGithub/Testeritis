package testeritis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class buttonRadioListener implements ActionListener {

	public buttonRadioListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String domainName = "google.com";

	
		String command = "ping -n 3 " + domainName;
		
		ShellCommand x = new ShellCommand(command);
		
	}

}
