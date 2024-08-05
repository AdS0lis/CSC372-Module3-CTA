package guiMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
		
//		Creating the menuBar
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
//		Creating the menu tab & adding it to the menuBar
		JMenu menu = new JMenu("Menu");
		menuBar.add(menu);
		
//		Creating the items for the menutab
        JMenuItem timeItem = new JMenuItem("Time");
        JMenuItem saveItem = new JMenuItem("Save to file");
        JMenuItem colorItem = new JMenuItem("Change Color");
        JMenuItem exitItem = new JMenuItem("Exit");
        
//      Adds the menuItem to the menu tab to create a dropdown
        menu.add(timeItem);
        menu.add(saveItem);
        menu.add(colorItem);
        menu.add(exitItem);
		
		
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
