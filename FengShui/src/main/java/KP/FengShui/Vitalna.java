package KP.FengShui;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Vitalna extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_logo;

	private Choice choice1;
	private Choice choice2;
	private Choice choice3;
	private Choice choice4;
	private Choice choice5;
	private Choice choice6;
	private Choice choice7;

	public Vitalna(String s) {
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
				String s_choice7 = choice7.getSelectedItem();

				// System.out.println(i_Gua1+" "+i_Gua2+" "+i_Gua3+" "+i_Gua4+"
				// "+i_Gua5+" "+i_Gua6+" "+
				// s_choice1+" "+s_choice2+" "+s_choice3+" "+s_choice4+"
				// "+s_choice5+" "+s_choice6+" "+s_choice7);

				new Vitalna1(s_choice1, s_choice2, s_choice3, s_choice4, s_choice5, s_choice6, s_choice7);
				setVisible(false);

			}
		});
		b_Dali.setForeground(new Color(0, 128, 0));
		b_Dali.setFont(new Font("Sitka Text", Font.ITALIC, 24));
		b_Dali.setBounds(844, 0, 150, 50);
		getContentPane().add(b_Dali);

		JLabel label = new JLabel("Як освітлена Ваша вітальня ?");
		label.setForeground(new Color(255, 255, 0));
		label.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 60, 664, 35);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Які меблі в основному у Вашій вітальні ?");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(255, 255, 0));
		label_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_1.setBounds(0, 126, 664, 35);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("У Вашій вітальні є ніші ?");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(255, 255, 0));
		label_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_2.setBounds(0, 189, 664, 35);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Ваша вітальня є найбільшою кімнатою ?");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(255, 255, 0));
		label_3.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_3.setBounds(0, 378, 664, 35);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("Як розміщений основний диван ?");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(255, 255, 0));
		label_4.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_4.setBounds(0, 315, 664, 35);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("Як Ви ставитесь до фонтану у квартирі ?");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(new Color(255, 255, 0));
		label_5.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_5.setBounds(0, 252, 664, 35);
		getContentPane().add(label_5);

		JLabel label_6 = new JLabel("Чи є у Вашій вітальні кімнатні рослини ?");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(255, 255, 0));
		label_6.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_6.setBounds(0, 441, 664, 35);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("Вітальня");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(0, 255, 255));
		label_7.setFont(new Font("Sitka Text", Font.BOLD, 33));
		label_7.setBounds(150, 0, 695, 50);
		getContentPane().add(label_7);

		choice1 = new Choice();
		choice1.setBounds(670, 73, 294, 22);
		getContentPane().add(choice1);
		choice1.add("Загально. 1 лампочка");
		choice1.add("Загально. Люстра");
		choice1.add("Кілька світильників");
		choice1.add("Місцево. Над особливими місцями");
		choice1.add("І загально, і місцево. Максимум світла");

		choice2 = new Choice();
		choice2.setBounds(670, 139, 294, 22);
		getContentPane().add(choice2);
		choice2.add("Дуже м'яка");
		choice2.add("М'яка");
		choice2.add("Помірна");
		choice2.add("Тверда");
		choice2.add("Дуже тверда");

		choice3 = new Choice();
		choice3.setBounds(670, 199, 294, 22);
		getContentPane().add(choice3);
		choice3.add("Так, є кілька");
		choice3.add("Так, одна");
		choice3.add("Ні, але форма кімнати особлива");
		choice3.add("Ні, класична кімната");

		choice4 = new Choice();
		choice4.setBounds(670, 265, 294, 22);
		getContentPane().add(choice4);
		choice4.add("Чудова ідея, хочу");
		choice4.add("У мене є фонтан");
		choice4.add("Не знаю");
		choice4.add("Це точно не для мене");

		choice5 = new Choice();
		choice5.setBounds(670, 325, 294, 22);
		getContentPane().add(choice5);
		choice5.add("Спинкою до дверей(вікна)");
		choice5.add("Боком до дверей(вікна)");
		choice5.add("Навпроти дверей(вікна)");

		choice6 = new Choice();
		choice6.setBounds(670, 391, 294, 22);
		getContentPane().add(choice6);
		choice6.add("Ні, вітальня є меншою за інші кімнати");
		choice6.add("Маю сумніви");
		choice6.add("Так, набагато більша за інші кімнати");

		choice7 = new Choice();
		choice7.setBounds(670, 454, 294, 22);
		getContentPane().add(choice7);
		choice7.add("Немає взагалі");
		choice7.add("Є, квітучі (крокус, герань, орхідея, фіалка...)");
		choice7.add("Є, плодові (гранат, цитрусові, інжин, ананас...)");
		choice7.add("Є, сукуленти (алое, кактуси, молочай, товстянка...)");
		choice7.add("Є, листяні (агава, драцена, фікус, монстера, юкка..)");
		
		l_logo = new JLabel("");
		l_logo.setBounds(0, 0, 994, 565);
		l_logo.setIcon(new ImageIcon("res/Oputyvanna.jpg"));
		getContentPane().add(l_logo);

		setVisible(true);
	}
}
