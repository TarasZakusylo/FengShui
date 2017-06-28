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

public class Spalna extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_logo;

	private Choice choice1;
	private Choice choice2;
	private Choice choice3;
	private Choice choice4;
	private Choice choice5;
	private Choice choice6;
	private Choice choice7;

	public Spalna(String s) {
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

				new Spalna1(s_choice1, s_choice2, s_choice3, s_choice4, s_choice5, s_choice6, s_choice7);
				setVisible(false);

			}
		});
		b_Dali.setForeground(new Color(0, 128, 0));
		b_Dali.setFont(new Font("Sitka Text", Font.ITALIC, 24));
		b_Dali.setBounds(844, 0, 150, 50);
		getContentPane().add(b_Dali);

		JLabel label = new JLabel("Які розміри Вашої спальні ?");
		label.setForeground(new Color(255, 255, 0));
		label.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 60, 664, 35);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Якого кольору Ваша спальня ?");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(255, 255, 0));
		label_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_1.setBounds(0, 126, 664, 35);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Куди відкриваються двері у Вашій спальні ?");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(255, 255, 0));
		label_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_2.setBounds(0, 189, 664, 35);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Чи є у Вашій спальні якісь зображення ?");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(255, 255, 0));
		label_3.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_3.setBounds(0, 378, 664, 35);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("Чи є у Вашій спальні дзеркала ?");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(255, 255, 0));
		label_4.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_4.setBounds(0, 315, 664, 35);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("Як розміщене ліжко ?");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(new Color(255, 255, 0));
		label_5.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_5.setBounds(0, 252, 664, 35);
		getContentPane().add(label_5);

		JLabel label_6 = new JLabel("Яка у Вашій спальні стеля ?");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(255, 255, 0));
		label_6.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_6.setBounds(0, 441, 664, 35);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("Спальня");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(0, 255, 255));
		label_7.setFont(new Font("Sitka Text", Font.BOLD, 33));
		label_7.setBounds(150, 0, 695, 50);
		getContentPane().add(label_7);

		choice1 = new Choice();
		choice1.setBounds(670, 73, 294, 22);
		getContentPane().add(choice1);
		choice1.add("Маленька");
		choice1.add("Середня");
		choice1.add("Велика");

		choice2 = new Choice();
		choice2.setBounds(670, 139, 294, 22);
		getContentPane().add(choice2);
		choice2.add("Темна, тьмяна");
		choice2.add("Маю сумніви");
		choice2.add("Яскрава");
		choice2.add("Помірна");
		choice2.add("Дуже світла");

		choice3 = new Choice();
		choice3.setBounds(670, 199, 294, 22);
		getContentPane().add(choice3);
		choice3.add("Назовні");
		choice3.add("Немає дверей");
		choice3.add("Всередину");
		choice3.add("Двері купе");

		choice4 = new Choice();
		choice4.setBounds(670, 265, 294, 22);
		getContentPane().add(choice4);
		choice4.add("Навпроти дверей");
		choice4.add("Під вікном");
		choice4.add("У кутку");
		choice4.add("Узголів'ям до стіни");

		choice5 = new Choice();
		choice5.setBounds(670, 325, 294, 22);
		getContentPane().add(choice5);
		choice5.add("Так, навпроти ліжка");
		choice5.add("Дзеркальна стеля");
		choice5.add("Дзеркало навпроти входу");
		choice5.add("2 дзеркала навпроти");
		choice5.add("Дзеркало у куртку");
		choice5.add("Немає дзеркал");
		choice5.add("Дзеркало на столі");
				
		choice6 = new Choice();
		choice6.setBounds(670, 391, 294, 22);
		getContentPane().add(choice6);
		choice6.add("Фото себе наодинці");
		choice6.add("Фото із попереднім коханням");
		choice6.add("Фото із коханою людиною");
		choice6.add("Фото із дитиною");
		choice6.add("Фото із природою");
		choice6.add("Фото із технікою");
		choice6.add("Фото невідомої пари");
		choice6.add("Немає фото");

		choice7 = new Choice();
		choice7.setBounds(670, 454, 294, 22);
		getContentPane().add(choice7);
		choice7.add("Дзеркальна");
		choice7.add("Кілька рівнева");		
		choice7.add("Із балками");		
		choice7.add("Рівна");

		l_logo = new JLabel("");
		l_logo.setBounds(0, 0, 994, 565);
		l_logo.setIcon(new ImageIcon("res/Oputyvanna.jpg"));
		getContentPane().add(l_logo);

		setVisible(true);
	}
}
