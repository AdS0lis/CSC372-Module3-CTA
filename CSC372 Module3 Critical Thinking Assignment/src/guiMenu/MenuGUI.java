package guiMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MenuGUI implements ActionListener{
	
	private JFrame frame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuGUI simpleGui = new MenuGUI();
		simpleGui.GUI();
	}
	
	public void GUI() {
		
//		Creates the frame
		frame = new JFrame("CSC372 Module 3 CTA");
		
		
		
		// Default commands written when creating a GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true); // Make sure the frame is visible
        frame.setLocationRelativeTo(null); // Makes the frame pop up in the middle of the screen
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
