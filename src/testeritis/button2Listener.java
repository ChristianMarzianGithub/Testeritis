package testeritis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class button2Listener implements ActionListener {

	public button2Listener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = "raspivid -o video.h264 -t 10000 ";
		ShellCommand x = new ShellCommand(command);
	}

}
