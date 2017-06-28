package KP.FengShui;

import java.awt.Color;
import java.awt.Desktop;
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

public class DutacaRezultaty extends JFrame {

	private static final long serialVersionUID = 1L;

	String s_Rezult = "";

	private JLabel l_logo;

	Desktop desktop = Desktop.getDesktop();

	private JLabel label;
	
	public DutacaRezultaty(String s_choice1, String s_choice2, String s_choice3, String s_choice4, String s_choice5,
			String s_choice6, String s_choice7, int i_putanna1, int i_putanna2, int i_putanna3, int i_putanna4,
			int i_putanna5, int i_putanna6, int i_putanna7) {

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

		s_Rezult = s_Rezult
				+ "Незважаючи на різноманітність функцій дитячої кімнати, баланс інь ян в дитячій повинен бути зміщений в сторону ян, щоб стимулювати активність і розвиток дитини.\n\n";

		if (s_choice1.equals("У кінці коридору") || s_choice1.equals("У тихому, затишному закутку")) {
			s_Rezult = s_Rezult + "Дитяча повинна добре забезпечуватися енергією ци, а для цього їй бажано знаходитися"
					+ " ближче до парадних вхідних дверей або залу, до центральної великій кімнаті,"
					+ " яка є серцем будинку (з центру житла відбувається розподіл енергії по всьому будинку).\n\n";
		}
		if (s_choice1.equals("У нас однокімнатна квартира")) {
			s_Rezult = s_Rezult + "Якщо немає можливості виділити кімнату під дитячу,"
					+ " обладнайте дитині особистий куточок в залі, поставте йому письмовий стіл."
					+ " По можливості відведіть для цього північно-східну частину приміщення - цей сектор"
					+ " відповідає за успіхи в навчанні. Нехай дитина знає, що це тільки його місце, зберігає"
					+ " там дорогі йому речі і займається творчістю.\n\n";
		}
		if (s_choice2.equals("Південний схід") || s_choice2.equals("Підень") || s_choice2.equals("Захід")
				|| s_choice2.equals("Північ") || s_choice2.equals("Північний захід")) {
			s_Rezult = s_Rezult
					+ "Якщо є можливість, то організуйте дитячу в північно-східній чи східній частині житла."
					+ "Північно-східна частина житла відповідає за придбання знань, самовдосконалення, "
					+ "а східна за зростання і розвиток. Добре, якщо вийде розташувати дитячу в цих секторах."
					+ " Вікна дитячої виходять на схід найкращих - це саме чудове напрямок, що "
					+ "символізує зростання, перспективи розвитку і успіхи.\n\n";
		}
		if (s_choice2.equals("Південний захід")) {
			s_Rezult = s_Rezult + "Не варто робити дитячу в південно-західному секторі, так як цей напрямок "
					+ "відводиться главі сім'ї, зазвичай старшому чоловікові будинку, годувальнику."
					+ " Що живе в цьому секторі дитина мимоволі стане командувати всіма іншими членами сім'ї.\n\n";
		}
		if (s_choice3.equals("Відкриті полички") || s_choice3.equals("Все у коробках")
				|| s_choice3.equals("Вільне розміщення, на підлозі")) {
			s_Rezult = s_Rezult
					+ "Згідно з фен шуй енергія протікає по житлу немов річка, велика кількість дрібних предметів гальмує ци, створює застої."
					+ "Також погляд малюка не розсіюється на велику кількість різних речей, що особливо важливо при виконанні домашніх завдань. "
					+ "Залишайте на увазі лише акцентні речі, що стимулюють тягу до знань, наприклад, повісьте лише одну відкриту"
					+ " полицю з книгами біля письмового столу, а також предмети сили малюка в міру їх появи.\n\n";
		}
		if (s_choice4.equals("Від 6 до 15 років") || s_choice4.equals("Від 15 до 18 років")) {
			s_Rezult = s_Rezult + "Дитина сама хоче брати участь в створенні свого «світу». Самовираження"
					+ " важливо для дитини, не беріть в \"штики\" його нововведення, навіть якщо вони зневажають"
					+ " старанно створений хороший фен-шуй. Постарайтеся м'яко і непомітно вплинути на нього,"
					+ " знайти компроміс між його бажаннями і сприятливою для його розвитку середовищем."
					+ "Постійно радьтесь.\n\n";
		}
		if (s_choice4.equals("До 6 років")) {
			s_Rezult = s_Rezult + "Поки діти маленькі, оформлення дитячої цілком залежить від нас, батьків, "
					+ "і звичайно, ми докладаємо всіх зусиль, щоб створити в дитячій доброзичливу позитивну обстановку.\n\n";
		}

		if (s_choice5.equals("Двоповерхове")) {
			s_Rezult = s_Rezult + "На жаль, фен шуй не схвалює двоярусні ліжка. Це пов'язано з тим,"
					+ " що у кожного з дітей, сплячих на такому ліжку, залишається мало простору над головою,"
					+ " в той же час, під сплячим нагорі, створюється надлишок енергії, що веде до "
					+ "неспокійному сну. Якщо у вас двох'ярусна ліжко, діти їй задоволені, "
					+ "досить здорові і добре сплять, то можете використовувати її і далі, але якщо"
					+ " не все відмінно, подумайте про двох звичайних ліжках.\n\n";
		}
		if (s_choice6.equals("У кутку")) {
			s_Rezult = s_Rezult + "Ставити ліжко в самий кут кімнати недобре: в кутах скупчується енергетична грязь:"
					+ " по можливості розмістіть його ближче до середини стіни. Вважається вдалим розташування ліжка,"
					+ " коли воно прилягає узголів'ям до стіни, це дає додаткову енергетичну підтримку.\n\n";
		}
		if (s_choice6.equals("Поряд із вікном")) {
			s_Rezult = s_Rezult
					+ "Позиція ліжка біля вікна невдала: оскільки утворюється в подібному місці звичайний і енергетичний протяг"
					+ " нехороші для здоров'я."
					+ "Виберіть місце подалі від вікна, щоб яскраві сонячні промені не падали щодня на ліжко, під рівною стелею і не під люстрою.\n\n";
		}
		if (s_choice6.equals("Ногами до дверей")) {
			s_Rezult = s_Rezult + "Лежачи на ліжку дитина не повинна бути спрямований ногами до входу в кімнату."
					+ "Вважається вдалим розташування ліжка,"
					+ " коли воно прилягає узголів'ям до стіни, це дає додаткову енергетичну підтримку.\n\n";
		}

		if (s_choice7.equals("Загальне. 1 лампочка") || s_choice7.equals("Загальне. Люстра")) {
			s_Rezult = s_Rezult + "Так як дитяча служить і ігровою і спальнею в різний час доби,"
					+ " освітлення в ній бажано зробити регульованим (від яскравого до приглушеного)."
					+ " Можливо кілька джерел світла: люстра, нічник, лампа на письмовому столі."
					+ " Яскраве освітлення для ігор та уроків, приглушене для підготовки до сну.\n\n";
		}

		if (i_putanna1 == 1) {
			s_Rezult = s_Rezult + "Умовте свою дитину розміщувати плакати подалі від зони сну,"
					+ " якщо вийде, виберіть разом і замініть негативний плакат на більш позитивний "
					+ "з тими ж улюбленими героями.\n\n";
		}
		if (i_putanna2 == 1) {
			s_Rezult = s_Rezult + "Дзеркало в дитячій кімнаті ставити не рекомендується."
					+ " Адже діти часто грають в рухливі ігри, що поруч з дзеркалом небезпечно,"
					+ " а увійшовши в підлітковий вік, вони схильні «зависати» перед дзеркалом,"
					+ " відшукуючи недоліки в своїй зовнішності і засмучуватися. Набагато краще"
					+ " привчити дитину оглядати себе перед виходом на вулицю в дзеркалі передпокої.\n\n";
		}
		if (i_putanna3 == 1) {
			s_Rezult = s_Rezult + "Досить багато кімнатних рослин є енергетичними вампірами. будьте обережні."
					+ " Розміщійте рослини подалі від ліжка. В цілому, кімнатні рослини сприятливі для дитячої,"
					+ " вони допомагають хорошій"
					+ " циркуляції енергії, очищають повітря, привчають дитину доглядати, нести відповідальність"
					+ " за живу істоту.\n\n";
		}
		if (i_putanna4 == 1) {
			s_Rezult = s_Rezult + "Комп'ютер чи телевізор повинні розташовуватися досить далеко від ліжка,"
					+ " інакше можуть (не тільки у включеному, але і в вимкненому режимі) сприяти неспокійному сну, "
					+ "підточувати нервову систему.\n\n";
		}
		if (i_putanna5 == 1) {
			s_Rezult = s_Rezult + "Де б не знаходився туалет в будинку, при установці унітазу зверніть увагу на те,"
					+ " щоб він не був звернений своєю передньою частиною до ліжка, письмового столу, "
					+ "зоні відведеній для ігор, заодно подбайте і про те, щоб ваше ліжко, диван і інші "
					+ "місця довгого перебування членів сім'ї не опинилися на одній лінії з «кормою» унітазу. "
					+ "Тут, на жаль не важливо те, що стіна відокремлює унітаз від кімнат, лінія унітазу ша"
					+ " все одно може впливати на здоров'я і соціальну активність дитини та її батьків.\n\n";
		}
		if (i_putanna6 == 1) {
			s_Rezult = s_Rezult + "Дитяча в ідеалі, бажано має бути середнього розміру, квадратної форми, "
					+ "без балок і виступів, які акумулюють ша ци, стеля рівний, особливо над ліжком і письмовим столом."
					+ " Розміщення дитячої на горищі під косою дахом вкрай небажано.\n\n";
		}
		if (i_putanna7 == 1) {
			s_Rezult = s_Rezult + "По можливості розмістіть грамоти, малюнки та фотографії на південній стіні дитячої."
					+ " Південний напрямок відповідає за славу, визнання, популярність.";
		}

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(500, 82, 482, 406);
		getContentPane().add(scrollPane);

		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setForeground(new Color(186, 85, 211));
		textPane.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textPane.setText(s_Rezult);

		JLabel label_2 = new JLabel("Дитяча");
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

		JButton btnNewButton_1 = new JButton("Вплив кольорів на психоемоційний стан дитини");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Koloru("Вплив кольорів на психоемоційний стан дитини");
			}
		});
		btnNewButton_1.setForeground(new Color(0, 128, 0));
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(500, 501, 482, 25);
		getContentPane().add(btnNewButton_1);

		JButton button = new JButton("Предмети сили");
		button.setForeground(new Color(0, 128, 0));
		button.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JTextPane textPane_1 = new JTextPane();
				textPane_1.setText("   Предметами сили для нас стають речі, дивлячись на які ми"
						+ " згадуємо про свою перемогу, успіх, або просто про щасливий день,"
						+ " цікавою поїздці. Це може бути похвальна грамота, малюнок, який переміг "
						+ "в конкурсі, просто вдалий малюнок дитини, або щось, що дитина привіз з "
						+ "подорожі, то, що підживлює у нього впевненість у собі або навіває приємні"
						+ " спогади, а ще фотографії, на яких відображені щасливі моменти.");
				textPane_1.setForeground(new Color(186, 85, 211));
				textPane_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
				textPane_1.setBounds(8, 171, 480, 246);
				getContentPane().add(textPane_1);
						
				label.setBounds(66, 140, 343, 25);
				
				setVisible(true);
			}
		});
		button.setBounds(500, 527, 241, 25);
		getContentPane().add(button);

		JButton button_1 = new JButton("Лінія туалетного ша");
		button_1.setForeground(new Color(0, 128, 0));
		button_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LinaiTualetu("Лінія туалетного ша");
			}
		});
		button_1.setBounds(742, 527, 240, 25);
		getContentPane().add(button_1);
		
		label = new JLabel("Передмети сили");
		label.setForeground(new Color(0, 255, 255));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Sitka Text", Font.BOLD, 20));
		getContentPane().add(label);
		
		l_logo = new JLabel("");
		l_logo.setBounds(0, 0, 994, 565);
		l_logo.setIcon(new ImageIcon("res/Rezult.jpg"));
//		l_logo.setIcon(new ImageIcon("C:\\Users\\Zakkk\\Desktop\\Rezult.jpg"));
		getContentPane().add(l_logo);

		setVisible(true);
	}
}
