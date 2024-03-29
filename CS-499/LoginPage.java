import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {
	// Intentiate a JFrame
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("userID");
	JLabel userPasswordLabel = new JLabel("password");
	JLabel messageLabel = new JLabel();
	
	// Global available copy
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	LoginPage(HashMap<String, String> loginInfoOriginal) {
		
		logininfo = loginInfoOriginal; 
		
		userIDLabel.setBounds(50, 100, 75, 25);
		userPasswordLabel.setBounds(50, 150, 75, 25);
		
		messageLabel.setBounds(125, 250, 250, 35);
		messageLabel.setFont(new Font(null, Font.ITALIC, 25));
		
		// Create user id and password field
		userIDField.setBounds(125, 100, 200, 25);
		userPasswordField.setBounds(125, 150, 200, 25);
		
		// Create reset button
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		// Create the login button
		resetButton.setBounds(225, 200, 100, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		
		// test user id and password label
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		
		// Set default on exit and size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Button action
		if (e.getSource() == resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		// Login button action
		if (e.getSource() == loginButton) {
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			// Validate login info
			if (logininfo.containsKey(userID)) {
			     if (logininfo.get(userID).equals(password)) {
			    	 messageLabel.setForeground(Color.blue);
			    	 messageLabel.setText("Login sucessful");
			    	 
				
			}
		}
	}
		
	}
}


