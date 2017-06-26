package KP.FengShui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class VannaRezultaty extends JFrame {

	private static final long serialVersionUID = 1L;

	String s_Rezult = "";

	String s_BaguaResult = "";
	private String s_GuaNapram1 = "";

	private JLabel l_logo;

	private JLabel lblNewLabel;

	public VannaRezultaty(
			String s_choice1, String s_choice2, String s_choice3, String s_choice4, String s_choice5, String s_choice6,
			int i_putanna1, int i_putanna2) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);

		JButton b_Menu = new JButton("Меню");
		b_Menu.setBounds(0, 0, 150, 50);
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
		getContentPane().setLayout(null);
		b_Menu.setForeground(new Color(0, 128, 0));
		b_Menu.setFont(new Font("Sitka Text", Font.ITALIC, 24));
		getContentPane().add(b_Menu);

		if (s_choice1.equals("Темний, тьмяний") || s_choice1.equals("Маю сумніви")) {
			s_Rezult = s_Rezult + "Створіть хороше освітлення у Вашому коридорі.\n\n";
		}
		if (s_choice2.equals("Так, тісненько у мене")) {
			s_Rezult = s_Rezult + "Не ставте біля входу багато меблів, віддайте перевагу шафам з дверцятами,"
					+ " що закриваються. Обмежтесь 1-2 шафами.\n\n";
		}
		if (s_choice3.equals("Все взуття поряд із дверима (\"під рукою\")")
				|| s_choice3.equals("Більшість взуття поряд із дверима")) {
			s_Rezult = s_Rezult + "Взуття, що мало використовується сховайте у шафу."
					+ " Звільніть прохід. Тоді енергія буде легше проникати у будинок.\n\n";
		}
		if (s_choice4.equals("Все одноманітне (однотонне)")) {
			s_Rezult = s_Rezult + "Простір можна акцентувати яскравими елементами червоного і жовтого кольору,"
					+ " так як ці кольори притягують ци. Наприклад, поставити червоний пуф, або дзеркало в жовтій оправі.\n\n";
		}
		if (s_choice5.equals("Залізні") || s_choice5.equals("Пластикові") || s_choice5.equals("Скляні")) {
			s_Rezult = s_Rezult + "Двері повинні містити дерево. "
					+ "Наприклад, зробіть якісь декоративні дерев'яні вставочки.\n\n";
		}
		if (s_choice6.equals("Мені це не цікаво") || s_choice6.equals("Не скриплять тай годі")
				|| s_choice6.equals("Раз на рік мию")) {
			s_Rezult = s_Rezult + "Двері повинні добре виглядати та не скрипіти."
					+ "Постійно слідкуйте за ними так як більшість енергії у житло входить через них.\n\n";
		}
		
		if (i_putanna1 == 1) {
			s_Rezult = s_Rezult + "У Вас туалет поряд із входом. "
					+ "Подібне планування сприяє витоку фінансів. Щоб виправити ситуацію "
					+ "тримайте двері туалету закритою і повісьте на неї (з боку коридору чи передпокою)"
					+ " дзеркало. Крім цього, скористайтеся порожніми пятітрубчатими повітряними дзвіночками,"
					+ " прикріпіть їх над дверима в туалет для нейтралізації негативної енергії.\n\n";
		}
		if (i_putanna2 == 1) {
			s_Rezult = s_Rezult + "Сходи у Вашому житлі краще закрити перегородкою, "
					+ "ширмою або шторкою, якщо немає такої можливості через планування,"
					+ " можна повісити біля сходів повітряні дзвіночки або кінатну рослину."
					+ " Під сходами має бути вільно і чисто, захаращення простору виключається."
					+ " Якщо Ви зберігаєте під сходами речі, зробіть для цього комору з дверима,"
					+ " що закриваються.\n\n";
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(500, 82, 482, 330);
		getContentPane().add(scrollPane);

		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setForeground(new Color(186, 85, 211));
		textPane.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textPane.setText(s_Rezult);

		JLabel label = new JLabel("Ваша стихія - " + s_GuaNapram1);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 255, 255));
		label.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		label.setBounds(446, 443, 482, 30);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Стихія Вашого коридору - " + s_BaguaResult);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 255, 255));
		label_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		label_1.setBounds(456, 474, 482, 30);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Коридор");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.CYAN);
		label_2.setFont(new Font("Sitka Text", Font.BOLD, 33));
		label_2.setBounds(152, 0, 695, 50);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Вам необхідно :");
		label_3.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(500, 63, 482, 16);
		getContentPane().add(label_3);

		JButton btnNewButton = new JButton("Породження");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setIcon(new ImageIcon("res/Porodgenna.jpg"));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setBounds(377, 540, 203, 25);
		getContentPane().add(btnNewButton);

		JButton button = new JButton("Пом'якшення");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setIcon(new ImageIcon("res/Zmakcenna.jpg"));
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setForeground(new Color(0, 128, 0));
		button.setBounds(782, 540, 212, 25);
		getContentPane().add(button);

		JButton button_1 = new JButton("Знищення");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setIcon(new ImageIcon("res/Znushcenna.jpg"));
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setForeground(new Color(0, 128, 0));
		button_1.setBounds(580, 540, 203, 25);
		getContentPane().add(button_1);

		JLabel label_4 = new JLabel("Бажаєте змінити стихію (енергію) ?");
		label_4.setForeground(new Color(124, 252, 0));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		label_4.setBounds(446, 517, 482, 24);
		getContentPane().add(label_4);

		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(94, 180, 300, 265);
		getContentPane().add(lblNewLabel);

		l_logo = new JLabel("");
		l_logo.setBounds(0, 0, 994, 565);
		l_logo.setIcon(new ImageIcon("res/Rezult.jpg"));
//		l_logo.setIcon(new ImageIcon("C:\\Users\\Zakkk\\Desktop\\Rezult.jpg"));
		getContentPane().add(l_logo);

		setVisible(true);
	}
}
