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

public class Korudor extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_logo;

	private Choice choice1;
	private Choice choice2;
	private Choice choice3;
	private Choice choice4;
	private Choice choice5;
	private Choice choice6;
	private Choice choice7;

	public Korudor(String s, final String s_Bagua, final int i_Gua1, final int i_Gua2, final int i_Gua3, final int i_Gua4, final int i_Gua5,
			final int i_Gua6) {
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

//				System.out.println(i_Gua1+" "+i_Gua2+" "+i_Gua3+" "+i_Gua4+" "+i_Gua5+" "+i_Gua6+" "+
//				s_choice1+" "+s_choice2+" "+s_choice3+" "+s_choice4+" "+s_choice5+" "+s_choice6+" "+s_choice7);
				
				new Korudor1(s_Bagua ,i_Gua1, i_Gua2, i_Gua3, i_Gua4, i_Gua5, i_Gua6, s_choice1, s_choice2, s_choice3, s_choice4,
						s_choice5, s_choice6, s_choice7);
				setVisible(false);

			}
		});
		b_Dali.setForeground(new Color(0, 128, 0));
		b_Dali.setFont(new Font("Sitka Text", Font.ITALIC, 24));
		b_Dali.setBounds(844, 0, 150, 50);
		getContentPane().add(b_Dali);

		JLabel label = new JLabel("Ваш коридор світлий ?");
		label.setForeground(new Color(255, 255, 0));
		label.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 60, 600, 35);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("У Вашому коридорі багато меблів ? ");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(255, 255, 0));
		label_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_1.setBounds(10, 126, 600, 35);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Де Ви зберігаєте взуття ?");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(255, 255, 0));
		label_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_2.setBounds(10, 189, 600, 35);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Як часто Ви доглядаєте за дверима ?");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(255, 255, 0));
		label_3.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_3.setBounds(10, 378, 600, 35);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("Із якого матеріалу Ваші вхідні двері ?");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(255, 255, 0));
		label_4.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_4.setBounds(10, 315, 600, 35);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("Чи є у Вашому коридорі яскраві елементи ?");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(new Color(255, 255, 0));
		label_5.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_5.setBounds(10, 252, 600, 35);
		getContentPane().add(label_5);

		JLabel label_6 = new JLabel("Яка у Вас релігія  ?");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(255, 255, 0));
		label_6.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_6.setBounds(10, 441, 600, 35);
		getContentPane().add(label_6);

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
		choice2.setBounds(634, 139, 330, 22);
		getContentPane().add(choice2);
		choice2.add("Так, тісненько у мене");
		choice2.add("1-2 шафи");
		choice2.add("Ні, мінімалістично");

		choice3 = new Choice();
		choice3.setBounds(634, 199, 330, 22);
		getContentPane().add(choice3);
		choice3.add("Все взуття поряд із дверима (\"під рукою\")");
		choice3.add("Більшість взуття поряд із дверима");
		choice3.add("Все взуття у шафі, окрім однієї пари");
		choice3.add("Взуття тільки у шафі");

		choice4 = new Choice();
		choice4.setBounds(634, 265, 330, 22);
		getContentPane().add(choice4);
		choice4.add("Все одноманітне (однотонне)");
		choice4.add("У мене немає певного стилю, все різноманітне");
		choice4.add("Загалом одноманітне, але є деякі особливі елементи");

		choice5 = new Choice();
		choice5.setBounds(634, 325, 330, 22);
		getContentPane().add(choice5);
		choice5.add("Залізні");
		choice5.add("Дерев'яні");
		choice5.add("Пластикові");
		choice5.add("Скляні");

		choice6 = new Choice();
		choice6.setBounds(634, 391, 330, 22);
		getContentPane().add(choice6);
		choice6.add("Мені це не цікаво");
		choice6.add("Не скриплять тай годі");
		choice6.add("Раз на рік мию");
		choice6.add("Постійно слідкую за чистотою та змащую їх");

		choice7 = new Choice();
		choice7.setBounds(634, 454, 330, 30);
		getContentPane().add(choice7);
		choice7.add("Християнство");
		choice7.add("Іслам");
		choice7.add("Буддизм");
		choice7.add("Індуїзм");
		choice7.add("Я атеїст");
		choice7.add("інші релігії");

		l_logo = new JLabel("");
		l_logo.setBounds(0, 0, 994, 565);
		l_logo.setIcon(new ImageIcon("res/Oputyvanna.jpg"));
		getContentPane().add(l_logo);

		setVisible(true);
	}
}
