package testeritis;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class MainFrame extends JFrame{

	
	public MainFrame() {
		int sizeX = 400;
		int sizeY = 200; 
		
		this.setSize(800,480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);		
		this.setLayout(null);
		
		
		
		JButton btnRadio = new JButton();
		btnRadio.setLocation(0, 20);
		btnRadio.setSize(sizeX, sizeY);		
		ImageIcon radioIcon = new ImageIcon("radioIcon.png");
		Image rimg = radioIcon.getImage() ;  
		Image rnewimg = rimg.getScaledInstance( 100, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
		radioIcon = new ImageIcon( rnewimg );
		btnRadio.setIcon(radioIcon);
		
		
		JButton btnMusicVideo = new JButton();
		btnMusicVideo.setLocation(0,220);
		btnMusicVideo.setSize(sizeX,sizeY);		
		ImageIcon musicIcon = new ImageIcon("musicIcon.png");
		Image aimg = musicIcon.getImage() ;  
		Image anewimg = aimg.getScaledInstance( 100, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
		musicIcon = new ImageIcon( anewimg );
		btnMusicVideo.setIcon(musicIcon);
						
		JButton btnCamera = new JButton();
		btnCamera.setLocation(400, 20);
		btnCamera.setSize(sizeX, sizeY);			
		ImageIcon cameraIcon = new ImageIcon("cameraIcon.png");
		Image img = cameraIcon.getImage() ;  
		Image newimg = img.getScaledInstance( 100, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
		cameraIcon = new ImageIcon( newimg );
		btnCamera.setIcon(cameraIcon);
		
	
		
		
		
		JButton btnNavi = new JButton();
		btnNavi.setLocation(400, 220);
		btnNavi.setSize(sizeX, sizeY); 
		ImageIcon naviIcon = new ImageIcon("naviIcon.png");
		Image nimg = naviIcon.getImage() ;  
		Image nnewimg = nimg.getScaledInstance( 150, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
		naviIcon = new ImageIcon( nnewimg );
		btnNavi.setIcon(naviIcon);
		
		
		
		buttonRadioListener RadioListener = new buttonRadioListener();
		btnMusicVideo.addActionListener(RadioListener);
		
		buttonMusicVideoListener MusicVideoListener = new buttonMusicVideoListener();
		btnRadio.addActionListener(MusicVideoListener);
		
		
		
		this.add(btnRadio);		
		this.add(btnMusicVideo);
		this.add(btnCamera);
		this.add(btnNavi);
	}

}