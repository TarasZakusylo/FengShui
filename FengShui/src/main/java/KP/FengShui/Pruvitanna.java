package KP.FengShui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Pruvitanna extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel l_logo;

	public Pruvitanna(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("ФенШуй");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Menu("ФенШуй");
				setVisible(false);
			}
		});
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Mistral", Font.BOLD | Font.ITALIC, 150));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(421, 144, 543, 169);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("у Вашому домі");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Menu("ФенШуй");
				setVisible(false);
			}
		});
		label_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 30));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(421, 312, 543, 40);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Для продовження натисніть, будь ласка, на екран");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Menu("ФенШуй");
				setVisible(false);
			}
		});
		label_2.setForeground(new Color(0, 128, 0));
		label_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(329, 525, 665, 40);
		getContentPane().add(label_2);
		
		l_logo = new JLabel("");
		l_logo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Menu("ФенШуй");
				setVisible(false);
			}
		});
		l_logo.setBounds(0, 0, 994, 565);
		l_logo.setIcon(new ImageIcon("res/Pruvitanna.jpg"));
		getContentPane().add(l_logo);
		
		setVisible(true);
	}
}
