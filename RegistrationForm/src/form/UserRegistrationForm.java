package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class UserRegistrationForm {

	private JFrame frmUserregistrationform;
	private JTextField nameField;
	private JTextField ageField;
	private JTextField mobileField;
	private JTextField emailField;
	private JTextField usernameField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegistrationForm window = new UserRegistrationForm();
					window.frmUserregistrationform.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserRegistrationForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUserregistrationform = new JFrame();
		frmUserregistrationform.setBackground(Color.BLACK);
		frmUserregistrationform.setForeground(Color.WHITE);
		frmUserregistrationform.getContentPane().setForeground(new Color(255, 255, 255));
		frmUserregistrationform.getContentPane().setBackground(new Color(0, 0, 0));
		frmUserregistrationform.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frmUserregistrationform.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\devib\\Desktop\\user.png"));
		frmUserregistrationform.setTitle("UserRegistrationForm");
		frmUserregistrationform.setBounds(100, 100, 630, 733);
		frmUserregistrationform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUserregistrationform.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(55, 68, 66, 24);
		frmUserregistrationform.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Age:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(55, 141, 66, 24);
		frmUserregistrationform.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(55, 199, 66, 24);
		frmUserregistrationform.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Address:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(55, 274, 66, 24);
		frmUserregistrationform.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile No:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(55, 378, 77, 24);
		frmUserregistrationform.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(55, 453, 66, 24);
		frmUserregistrationform.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("User Name:");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(55, 521, 85, 24);
		frmUserregistrationform.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Password:");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(55, 592, 77, 24);
		frmUserregistrationform.getContentPane().add(lblNewLabel_7);
		
		nameField = new JTextField();
		nameField.setBounds(252, 67, 225, 31);
		frmUserregistrationform.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		ageField = new JTextField();
		ageField.setBounds(252, 139, 96, 31);
		frmUserregistrationform.getContentPane().add(ageField);
		ageField.setColumns(10);
		
		mobileField = new JTextField();
		mobileField.setBounds(252, 383, 225, 31);
		frmUserregistrationform.getContentPane().add(mobileField);
		mobileField.setColumns(10);
		
		emailField = new JTextField();
		emailField.setBounds(252, 458, 225, 31);
		frmUserregistrationform.getContentPane().add(emailField);
		emailField.setColumns(10);
		
		usernameField = new JTextField();
		usernameField.setBounds(252, 526, 225, 31);
		frmUserregistrationform.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		JTextArea addressArea = new JTextArea();
		addressArea.setBounds(252, 258, 305, 92);
		frmUserregistrationform.getContentPane().add(addressArea);
		
		JRadioButton rbFemale = new JRadioButton("Female");
		rbFemale.setBackground(Color.BLACK);
		rbFemale.setForeground(Color.WHITE);
		rbFemale.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonGroup.add(rbFemale);
		rbFemale.setBounds(245, 203, 103, 21);
		frmUserregistrationform.getContentPane().add(rbFemale);
		
		JRadioButton rbMale = new JRadioButton("Male");
		rbMale.setBackground(Color.BLACK);
		rbMale.setForeground(Color.WHITE);
		rbMale.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonGroup.add(rbMale);
		rbMale.setBounds(374, 203, 103, 21);
		frmUserregistrationform.getContentPane().add(rbMale);
		
		JRadioButton rbOther = new JRadioButton("Other");
		rbOther.setBackground(Color.BLACK);
		rbOther.setForeground(Color.WHITE);
		rbOther.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonGroup.add(rbOther);
		rbOther.setBounds(486, 203, 103, 21);
		frmUserregistrationform.getContentPane().add(rbOther);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(252, 592, 225, 31);
		frmUserregistrationform.getContentPane().add(passwordField);
		
		JButton btnValidate = new JButton("Validate");
		btnValidate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnValidate.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","12345");
					String query="insert into registration values(?,?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1, nameField.getText());
					ps.setInt(2, Integer.parseInt(ageField.getText()));
					if(rbFemale.isSelected()) {
						ps.setString(3, rbFemale.getText());
					}
					else if(rbMale.isSelected()) {
						ps.setString(3, rbMale.getText());
					}
					else
						ps.setString(3, rbOther.getText());
					ps.setString(4, addressArea.getText());
					ps.setString(5, mobileField.getText());
					ps.setString(6, emailField.getText());
					ps.setString(7, usernameField.getText());
					ps.setString(8, passwordField.getText());
					
					int i=ps.executeUpdate();
					JOptionPane.showMessageDialog(btnValidate, i+" Record added successfully !! ");
					
					ps.close();
					con.close();
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnValidate.setBackground(UIManager.getColor("Button.light"));
		btnValidate.setBounds(148, 654, 96, 21);
		frmUserregistrationform.getContentPane().add(btnValidate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(UIManager.getColor("Button.light"));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameField.setText("");
				ageField.setText("");
				addressArea.setText("");
				mobileField.setText("");
				emailField.setText("");
				usernameField.setText("");
				passwordField.setText("");
				buttonGroup.clearSelection();
			}
		});
		btnReset.setBounds(308, 654, 85, 21);
		frmUserregistrationform.getContentPane().add(btnReset);
		
		JLabel lblNewLabel_8 = new JLabel("User Registration Form");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(216, 21, 216, 21);
		frmUserregistrationform.getContentPane().add(lblNewLabel_8);
	}
}
