package KP.FengShui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class Koloru extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public Koloru(String s) {
		super(s);

//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 994, 565);
		getContentPane().add(scrollPane);
		
		JLabel label = new JLabel("");
		scrollPane.setViewportView(label);
		label.setIcon(new ImageIcon("res/Koloru.png"));
		
		
		
		setVisible(true);
	}
}
