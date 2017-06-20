package KP.FengShui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_logo;

	public Menu(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton b_Korudor = new JButton("Коридор");
		b_Korudor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Korudor("ФенШуй");
				setVisible(false);
			}
		});
		b_Korudor.setForeground(new Color(0, 128, 0));
		b_Korudor.setFont(new Font("Sitka Text", Font.ITALIC, 25));
		b_Korudor.setBounds(0, 525, 166, 40);
		getContentPane().add(b_Korudor);

		JButton b_Kuhna = new JButton("Кухня");
		b_Kuhna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Kuhna("ФенШуй");
				setVisible(false);
			}
		});
		b_Kuhna.setForeground(new Color(0, 128, 0));
		b_Kuhna.setFont(new Font("Sitka Text", Font.ITALIC, 25));
		b_Kuhna.setBounds(166, 525, 166, 40);
		getContentPane().add(b_Kuhna);

		JButton b_Vitalna = new JButton("Вітальня");
		b_Vitalna.setForeground(new Color(0, 128, 0));
		b_Vitalna.setFont(new Font("Sitka Text", Font.ITALIC, 25));
		b_Vitalna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Vitalna("ФенШуй");
				setVisible(false);
			}
		});
		b_Vitalna.setBounds(332, 525, 167, 40);
		getContentPane().add(b_Vitalna);

		JButton b_Dutaca = new JButton("Дитяча");
		b_Dutaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Dutaca("ФенШуй");
				setVisible(false);
			}
		});
		b_Dutaca.setForeground(new Color(0, 128, 0));
		b_Dutaca.setFont(new Font("Sitka Text", Font.ITALIC, 25));
		b_Dutaca.setBounds(499, 525, 166, 40);
		getContentPane().add(b_Dutaca);

		JButton b_Vanna = new JButton("Ванна");
		b_Vanna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Vanna("ФенШуй");
				setVisible(false);
			}
		});
		b_Vanna.setForeground(new Color(0, 128, 0));
		b_Vanna.setFont(new Font("Sitka Text", Font.ITALIC, 25));
		b_Vanna.setBounds(665, 525, 166, 40);
		getContentPane().add(b_Vanna);

		JButton b_Spalna = new JButton("Спальня");
		b_Spalna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Spalna("ФенШуй");
				setVisible(false);
			}
		});
		b_Spalna.setForeground(new Color(0, 128, 0));
		b_Spalna.setFont(new Font("Sitka Text", Font.ITALIC, 25));
		b_Spalna.setBounds(831, 525, 167, 40);
		getContentPane().add(b_Spalna);

		l_logo = new JLabel("");
		l_logo.setBounds(0, 0, 994, 565);
		l_logo.setIcon(new ImageIcon("res/Menu.jpg"));
		getContentPane().add(l_logo);

		setVisible(true);

	}
}
