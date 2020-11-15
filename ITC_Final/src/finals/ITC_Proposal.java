package finals;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.util.*;
import java.text.*;

import java.sql.*;
import net.proteanit.sql.DbUtils;

public class ITC_Proposal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ITC_Proposal window = new ITC_Proposal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ITC_Proposal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 312, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton AddManga_Button = new JButton("Add Manga");
		AddManga_Button.setBackground(Color.BLACK);
		AddManga_Button.setFont(new Font("Tahoma", Font.PLAIN, 27));
		AddManga_Button.setBounds(44, 175, 217, 76);
		frame.getContentPane().add(AddManga_Button);
		
		JLabel Title_Label = new JLabel("Mangalot");
		Title_Label.setFont(new Font("Tahoma", Font.PLAIN, 49));
		Title_Label.setBounds(44, 40, 217, 76);
		frame.getContentPane().add(Title_Label);
		
		JButton ViewManga_Button = new JButton("View Manga");
		ViewManga_Button.setBackground(Color.BLACK);
		ViewManga_Button.setFont(new Font("Tahoma", Font.PLAIN, 27));
		ViewManga_Button.setBounds(44, 277, 217, 76);
		frame.getContentPane().add(ViewManga_Button);
	}
	
	/**
	 * 
	 * Connect the database to the GUI
	 */
	public static Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        //System.out.println("Loaded driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?user=root&password=edureka");
	        //System.out.println("Connected to MySQL");
	        return con;
		} catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}
	
	
	
	
}
