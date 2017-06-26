package KP.FengShui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class LinaiTualetu extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public LinaiTualetu(String s) {
		super(s);

//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 238);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("res/toilet-sha.jpg"));
		label.setBounds(0, 0, 694, 203);
		getContentPane().add(label);
		
		
		
		setVisible(true);
	}
}
