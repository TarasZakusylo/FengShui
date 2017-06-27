package KP.FengShui;

import java.awt.Choice;
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
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class Vanna extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_logo;

	private Choice choice1;
	private Choice choice2;
	private Choice choice3;
	private Choice choice4;
	private Choice choice5;
	private Choice choice6;

	private int i_putanna1 = 0;
	private int i_putanna2 = 0;

	private ButtonGroup group_putanna1;
	private ButtonGroup group_putanna2;

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
				String s_choice1 = choice1.getSelectedItem();
				String s_choice2 = choice2.getSelectedItem();
				String s_choice3 = choice3.getSelectedItem();
				String s_choice4 = choice4.getSelectedItem();
				String s_choice5 = choice5.getSelectedItem();
				String s_choice6 = choice6.getSelectedItem();

				// System.out.println(i_Gua1+" "+i_Gua2+" "+i_Gua3+" "+i_Gua4+"
				// "+i_Gua5+" "+i_Gua6+" "+
				// s_choice1+" "+s_choice2+" "+s_choice3+" "+s_choice4+"
				// "+s_choice5+" "+s_choice6+" "+s_choice7);

				new VannaRezultaty(s_choice1, s_choice2, s_choice3, s_choice4, s_choice5, s_choice6, i_putanna1,
						i_putanna2);
				setVisible(false);

			}
		});
		b_Dali.setForeground(new Color(0, 128, 0));
		b_Dali.setFont(new Font("Sitka Text", Font.ITALIC, 24));
		b_Dali.setBounds(844, 0, 150, 50);
		getContentPane().add(b_Dali);

		JLabel label = new JLabel("Якого кольору Ваша ванна кімната ?");
		label.setForeground(new Color(255, 255, 0));
		label.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 60, 600, 35);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Яка стеля у Вашій ванній кімнаті ?");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(255, 255, 0));
		label_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_1.setBounds(10, 118, 600, 35);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Яке освітлення у Вашій ванній кімнаті ? ");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(255, 255, 0));
		label_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_2.setBounds(10, 174, 600, 35);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Якої форми Ваша раковина ?");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(255, 255, 0));
		label_3.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_3.setBounds(10, 350, 600, 35);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("Якої форми Ваша ванна (душова кабіна) ? ");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(255, 255, 0));
		label_4.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_4.setBounds(10, 292, 600, 35);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("Яке положення сантехніки ?");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(new Color(255, 255, 0));
		label_5.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_5.setBounds(10, 234, 600, 35);
		getContentPane().add(label_5);

		JLabel label_7 = new JLabel("Коридор");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(0, 255, 255));
		label_7.setFont(new Font("Sitka Text", Font.BOLD, 33));
		label_7.setBounds(150, 0, 695, 50);
		getContentPane().add(label_7);

		choice1 = new Choice();
		choice1.setBounds(634, 73, 330, 22);
		getContentPane().add(choice1);
		choice1.add("Темний, тьмяний");
		choice1.add("Маю сумніви");
		choice1.add("Помірний");
		choice1.add("Так, дуже світлий");

		choice2 = new Choice();
		choice2.setBounds(634, 131, 330, 22);
		getContentPane().add(choice2);
		choice2.add("Дзеркальна");
		choice2.add("Кілька рівнева");
		choice2.add("Рівна");

		choice3 = new Choice();
		choice3.setBounds(634, 187, 330, 22);
		getContentPane().add(choice3);
		choice3.add("Гострувата люстра");
		choice3.add("Софіти, що випирають");
		choice3.add("Софіти, що сховані");
		choice3.add("Бра, світильники, люстра обтікаючої форми");
		choice3.add("Бра, світильники, люстра кутової форми");
		

		choice4 = new Choice();
		choice4.setBounds(634, 247, 330, 22);
		getContentPane().add(choice4);
		choice4.add("Сантехніка лицем до дверей");
		choice4.add("Сантехніка під кутом до дверей");
		choice4.add("Сантехніка поряд із дверима");

		choice5 = new Choice();
		choice5.setBounds(634, 305, 330, 22);
		getContentPane().add(choice5);
		choice5.add("Прямокутна");
		choice5.add("Округла");

		choice6 = new Choice();
		choice6.setBounds(634, 363, 330, 22);
		getContentPane().add(choice6);
		choice6.add("Прямокутна");
		choice6.add("Округла");

		JLabel label_8 = new JLabel("Чи є у Вашій ванній кімнаті щось дерев’яне ?");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.YELLOW);
		label_8.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_8.setBounds(10, 408, 807, 35);
		getContentPane().add(label_8);

		JRadioButton radioButton = new JRadioButton("Так");
		radioButton.setOpaque(false);
		radioButton.setForeground(Color.CYAN);
		radioButton.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioButton.setBounds(825, 414, 73, 25);
		getContentPane().add(radioButton);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna1 = 1;
			}
		});

		JRadioButton radioButton_1 = new JRadioButton("Ні");
		radioButton_1.setOpaque(false);
		radioButton_1.setForeground(Color.CYAN);
		radioButton_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioButton_1.setBounds(911, 414, 63, 25);
		getContentPane().add(radioButton_1);
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna1 = 2;
			}
		});

		JRadioButton radioButton_2 = new JRadioButton("Ні");
		radioButton_2.setOpaque(false);
		radioButton_2.setForeground(Color.CYAN);
		radioButton_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioButton_2.setBounds(911, 481, 63, 25);
		getContentPane().add(radioButton_2);
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna2 = 2;
			}
		});

		JRadioButton radioButton_3 = new JRadioButton("Так");
		radioButton_3.setOpaque(false);
		radioButton_3.setForeground(Color.CYAN);
		radioButton_3.setFont(new Font("Sitka Text", Font.BOLD, 25));
		radioButton_3.setBounds(825, 481, 73, 25);
		getContentPane().add(radioButton_3);
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna2 = 1;
			}
		});

		JLabel label_9 = new JLabel("Чи є у Вашій ванній кімнаті якісь вставки, аксесуари ?");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.YELLOW);
		label_9.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_9.setBounds(10, 466, 807, 35);
		getContentPane().add(label_9);

		group_putanna1 = new ButtonGroup();
		group_putanna1.add(radioButton);
		group_putanna1.add(radioButton_1);

		group_putanna2 = new ButtonGroup();
		group_putanna2.add(radioButton_2);
		group_putanna2.add(radioButton_3);

		l_logo = new JLabel("");
		l_logo.setBounds(0, 0, 994, 565);
		l_logo.setIcon(new ImageIcon("res/Oputyvanna.jpg"));
		// l_logo.setIcon(new
		// ImageIcon("C:\\Users\\Zakkk\\Desktop\\Oputyvanna.jpg"));
		getContentPane().add(l_logo);

		setVisible(true);
	}
}
