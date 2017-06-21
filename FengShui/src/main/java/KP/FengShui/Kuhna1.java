package KP.FengShui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Kuhna1 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_logo;

	private ButtonGroup group_putanna1;
	private ButtonGroup group_putanna2;
	private ButtonGroup group_putanna3;
	private ButtonGroup group_putanna4;
	private ButtonGroup group_putanna5;
	private ButtonGroup group_putanna6;
	private ButtonGroup group_putanna7;

	private int i_putanna1 = 0;
	private int i_putanna2 = 0;
	private int i_putanna3 = 0;
	private int i_putanna4 = 0;
	private int i_putanna5 = 0;
	private int i_putanna6 = 0;
	private int i_putanna7 = 0;

	public Kuhna1(final String s_choice1, final String s_choice2, final String s_choice3, final String s_choice4,
			final String s_choice5, final String s_choice6, final String s_choice7) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton b_Menu = new JButton("Меню");
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = { "Перейти до меню", "Продовжити опитування" };
				int i_menu = JOptionPane.showOptionDialog(null, "Якщо Ви перейдете в меню, то введені дані знищаться.",
						"Попередження", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
						null);
				if (i_menu == 0) {
					new Menu("ФенШуй");
					setVisible(false);
				}
			}
		});
		b_Menu.setForeground(new Color(0, 128, 0));
		b_Menu.setFont(new Font("Sitka Text", Font.ITALIC, 24));
		b_Menu.setBounds(0, 0, 150, 50);
		getContentPane().add(b_Menu);

		JButton b_Dali = new JButton("Далі");
		b_Dali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (i_putanna1 == 0 || i_putanna2 == 0 || i_putanna3 == 0 || i_putanna4 == 0 || i_putanna5 == 0
						|| i_putanna6 == 0 || i_putanna7 == 0) {
					JOptionPane.showMessageDialog(null, "Помилка введення !");
				} else {

					new KuhnaRezultaty(s_choice1, s_choice2, s_choice3, s_choice4, s_choice5, s_choice6, s_choice7,
							i_putanna1, i_putanna2, i_putanna3, i_putanna4, i_putanna5, i_putanna6, i_putanna7);
					setVisible(false);
				}
			}
		});
		b_Dali.setForeground(new Color(0, 128, 0));
		b_Dali.setFont(new Font("Sitka Text", Font.ITALIC, 24));
		b_Dali.setBounds(844, 0, 150, 50);
		getContentPane().add(b_Dali);

		JLabel label = new JLabel("Ви зберігаєте ножі на столі (робочій поверхні) ?");
		label.setForeground(new Color(255, 255, 0));
		label.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 60, 807, 35);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Ви практикуєте сімейні трапези ?");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(255, 255, 0));
		label_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_1.setBounds(10, 126, 807, 35);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("У Вас на кухні є дзеркала ?");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(255, 255, 0));
		label_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_2.setBounds(10, 189, 807, 35);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Плита знаходиться поряд із холодильником чи раковиною ?");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(255, 255, 0));
		label_3.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_3.setBounds(10, 378, 807, 35);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("У Вас є відкриті полиці ?");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(255, 255, 0));
		label_4.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_4.setBounds(10, 315, 807, 35);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("Робоча зона знаходить навпроти дверей ?");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(new Color(255, 255, 0));
		label_5.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_5.setBounds(10, 252, 807, 35);
		getContentPane().add(label_5);

		JLabel label_6 = new JLabel("У Вас багато дрібних приладів ?");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(255, 255, 0));
		label_6.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_6.setBounds(10, 441, 807, 35);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("Коридор");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(0, 255, 255));
		label_7.setFont(new Font("Sitka Text", Font.BOLD, 33));
		label_7.setBounds(150, 0, 695, 50);
		getContentPane().add(label_7);

		JRadioButton radioB_putanna6_1 = new JRadioButton("Так");
		radioB_putanna6_1.setOpaque(false);
		radioB_putanna6_1.setForeground(Color.CYAN);
		radioB_putanna6_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioB_putanna6_1.setBounds(825, 384, 73, 25);
		getContentPane().add(radioB_putanna6_1);
		radioB_putanna6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna6 = 1;
			}
		});

		JRadioButton radioB_putanna6_2 = new JRadioButton("Ні");
		radioB_putanna6_2.setOpaque(false);
		radioB_putanna6_2.setForeground(Color.CYAN);
		radioB_putanna6_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioB_putanna6_2.setBounds(911, 384, 63, 25);
		getContentPane().add(radioB_putanna6_2);
		radioB_putanna6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna6 = 2;
			}
		});

		JRadioButton radioB_putanna1_1 = new JRadioButton("Так");
		radioB_putanna1_1.setOpaque(false);
		radioB_putanna1_1.setForeground(Color.CYAN);
		radioB_putanna1_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioB_putanna1_1.setBounds(825, 70, 73, 25);
		getContentPane().add(radioB_putanna1_1);
		radioB_putanna1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna1 = 1;
			}
		});

		JRadioButton radioB_putanna1_2 = new JRadioButton("Ні");
		radioB_putanna1_2.setOpaque(false);
		radioB_putanna1_2.setForeground(Color.CYAN);
		radioB_putanna1_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioB_putanna1_2.setBounds(911, 70, 63, 25);
		getContentPane().add(radioB_putanna1_2);
		radioB_putanna1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna1 = 2;
			}
		});

		JRadioButton radioB_putanna2_1 = new JRadioButton("Так");
		radioB_putanna2_1.setOpaque(false);
		radioB_putanna2_1.setForeground(Color.CYAN);
		radioB_putanna2_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioB_putanna2_1.setBounds(825, 136, 73, 25);
		getContentPane().add(radioB_putanna2_1);
		radioB_putanna2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna2 = 1;
			}
		});

		JRadioButton radioB_putanna2_2 = new JRadioButton("Ні");
		radioB_putanna2_2.setOpaque(false);
		radioB_putanna2_2.setForeground(Color.CYAN);
		radioB_putanna2_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioB_putanna2_2.setBounds(911, 136, 63, 25);
		getContentPane().add(radioB_putanna2_2);
		radioB_putanna2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna2 = 2;
			}
		});

		JRadioButton radioB_putanna3_1 = new JRadioButton("Так");
		radioB_putanna3_1.setOpaque(false);
		radioB_putanna3_1.setForeground(Color.CYAN);
		radioB_putanna3_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioB_putanna3_1.setBounds(825, 199, 73, 25);
		getContentPane().add(radioB_putanna3_1);
		radioB_putanna3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna3 = 1;
			}
		});

		JRadioButton radioB_putanna3_2 = new JRadioButton("Ні");
		radioB_putanna3_2.setOpaque(false);
		radioB_putanna3_2.setForeground(Color.CYAN);
		radioB_putanna3_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioB_putanna3_2.setBounds(911, 199, 63, 25);
		getContentPane().add(radioB_putanna3_2);
		radioB_putanna3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna3 = 2;
			}
		});

		JRadioButton radioB_putanna4_1 = new JRadioButton("Так");
		radioB_putanna4_1.setOpaque(false);
		radioB_putanna4_1.setForeground(Color.CYAN);
		radioB_putanna4_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioB_putanna4_1.setBounds(825, 262, 73, 25);
		getContentPane().add(radioB_putanna4_1);
		radioB_putanna4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna4 = 1;
			}
		});

		JRadioButton radioB_putanna4_2 = new JRadioButton("Ні");
		radioB_putanna4_2.setOpaque(false);
		radioB_putanna4_2.setForeground(Color.CYAN);
		radioB_putanna4_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioB_putanna4_2.setBounds(911, 262, 63, 25);
		getContentPane().add(radioB_putanna4_2);
		radioB_putanna4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna4 = 2;
			}
		});

		JRadioButton radioB_putanna5_1 = new JRadioButton("Так");
		radioB_putanna5_1.setOpaque(false);
		radioB_putanna5_1.setForeground(Color.CYAN);
		radioB_putanna5_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioB_putanna5_1.setBounds(825, 325, 73, 25);
		getContentPane().add(radioB_putanna5_1);
		radioB_putanna5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna5 = 1;
			}
		});

		JRadioButton radioB_putanna5_2 = new JRadioButton("Ні");
		radioB_putanna5_2.setOpaque(false);
		radioB_putanna5_2.setForeground(Color.CYAN);
		radioB_putanna5_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioB_putanna5_2.setBounds(911, 325, 63, 25);
		getContentPane().add(radioB_putanna5_2);
		radioB_putanna5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna5 = 2;
			}
		});

		JRadioButton radioB_putanna7_1 = new JRadioButton("Так");
		radioB_putanna7_1.setOpaque(false);
		radioB_putanna7_1.setForeground(Color.CYAN);
		radioB_putanna7_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioB_putanna7_1.setBounds(825, 451, 73, 25);
		getContentPane().add(radioB_putanna7_1);
		radioB_putanna7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna7 = 1;
			}
		});

		JRadioButton radioB_putanna7_2 = new JRadioButton("Ні");
		radioB_putanna7_2.setOpaque(false);
		radioB_putanna7_2.setForeground(Color.CYAN);
		radioB_putanna7_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioB_putanna7_2.setBounds(911, 451, 63, 25);
		getContentPane().add(radioB_putanna7_2);
		radioB_putanna7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna7 = 2;
			}
		});

		group_putanna1 = new ButtonGroup();
		group_putanna1.add(radioB_putanna1_1);
		group_putanna1.add(radioB_putanna1_2);

		group_putanna2 = new ButtonGroup();
		group_putanna2.add(radioB_putanna2_1);
		group_putanna2.add(radioB_putanna2_2);

		group_putanna3 = new ButtonGroup();
		group_putanna3.add(radioB_putanna3_1);
		group_putanna3.add(radioB_putanna3_2);

		group_putanna4 = new ButtonGroup();
		group_putanna4.add(radioB_putanna4_1);
		group_putanna4.add(radioB_putanna4_2);

		group_putanna5 = new ButtonGroup();
		group_putanna5.add(radioB_putanna5_1);
		group_putanna5.add(radioB_putanna5_2);

		group_putanna6 = new ButtonGroup();
		group_putanna6.add(radioB_putanna6_1);
		group_putanna6.add(radioB_putanna6_2);

		group_putanna7 = new ButtonGroup();
		group_putanna7.add(radioB_putanna7_1);
		group_putanna7.add(radioB_putanna7_2);

		l_logo = new JLabel("");
		l_logo.setBounds(0, 0, 994, 565);
		l_logo.setIcon(new ImageIcon("res/Oputyvanna.jpg"));
		// ImageIcon("C:\\Users\\Zakkk\\Desktop\\Oputyvanna.jpg"));
		getContentPane().add(l_logo);

		setVisible(true);
	}
}
