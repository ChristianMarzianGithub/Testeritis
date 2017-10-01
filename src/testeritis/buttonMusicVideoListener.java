package testeritis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class buttonMusicVideoListener implements ActionListener {

	public buttonMusicVideoListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, System.getProperty("user.dir") );
		
		
		//String command = "raspivid -o video.h264 -t 10000 ";
		//ShellCommand x = new ShellCommand(command);
	}
}