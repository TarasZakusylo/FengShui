package KP.FengShui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vanna extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public Vanna(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JButton b_Menu = new JButton("Меню");
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("ФенШуй");
				setVisible(false);
			}
		});
		b_Menu.setForeground(new Color(0, 128, 0));
		b_Menu.setFont(new Font("Sitka Text", Font.ITALIC, 24));
		b_Menu.setBounds(0, 0, 150, 50);
		getContentPane().add(b_Menu);
		
		JButton b_Dali = new JButton("Далі");
		b_Dali.setForeground(new Color(0, 128, 0));
		b_Dali.setFont(new Font("Sitka Text", Font.ITALIC, 24));
		b_Dali.setBounds(844, 0, 150, 50);
		getContentPane().add(b_Dali);

		
		
		setVisible(true);
	}

}
