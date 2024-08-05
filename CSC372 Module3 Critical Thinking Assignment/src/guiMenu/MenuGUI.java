package guiMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuGUI implements ActionListener{
	
	private JFrame frame;
	private JTextField timeTextField;

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
        
//      Action Listener for the menuItems
        timeItem.addActionListener(this);
        saveItem.addActionListener(this);
        colorItem.addActionListener(this);
        exitItem.addActionListener(this);
        
//      Create a panel to hold the label and text field
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        JLabel timeLabel = new JLabel("Current time is: ");
        timeTextField = new JTextField();
        timeTextField.setEditable(false); // makes the textfile read-only
        
        panel.add(timeLabel, BorderLayout.WEST);
        panel.add(timeTextField, BorderLayout.CENTER);
        
 
//      Adding panel to the frame
        frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		// Default commands written when creating a GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true); // Make sure the frame is visible
        frame.setLocationRelativeTo(null); // Makes the frame pop up in the middle of the screen
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if (command.equals("Time")) {
//			Get current time
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			String currentTime = sdf.format(new Date());
			
//			Debug statement written to console to ensure the command is running
			System.out.println("Updating time to: " + currentTime);
			
//			Update textField with current time
			timeTextField.setText(currentTime);
			
//			Debug statement for the textfield to ensure the correct output is being written
			System.out.println("TextField contents: " + timeTextField.getText());
			
		}
		else if (command.equals("Save to file")) {
			System.out.println("You have saved to a file...");
			
			try {
				FileWriter writer = new FileWriter("log.txt");
				writer.write("The current time is: ");
				writer.write(timeTextField.getText()); // writes the textfield to the file
				writer.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if (command.equals("Change Color")) {
			System.out.println("You have changed the color...");
//			Generate Random green color 
			Random rand = new Random();
			int greenValue = rand.nextInt(205) + 50; // this makes the lowest value 50 and the max value 255
			Color randomGreen = new Color(0,greenValue, 0);
			
//			Sets the background color of the frame
			frame.getContentPane().setBackground(randomGreen);
		}
		else if (command.equals("Exit")) {
			System.exit(0); // Exits the program
		}
	}

}
