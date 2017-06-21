package KP.FengShui;

import java.awt.Color;
import java.awt.Component;
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

public class KorudorRezultaty extends JFrame {

	private static final long serialVersionUID = 1L;

	String s_Rezult = "";

	String s_BaguaResult = "";
	private String s_GuaNapram1 = "";

	private JLabel l_logo;

	private JLabel lblNewLabel;

	public KorudorRezultaty(String s_Bagua, int i_Gua1, int i_Gua2, int i_Gua3, int i_Gua4, int i_Gua5, int i_Gua6,
			String s_choice1, String s_choice2, String s_choice3, String s_choice4, String s_choice5, String s_choice6,
			String s_choice7, int i_putanna1, int i_putanna2, int i_putanna3, int i_putanna4, int i_putanna5,
			int i_putanna6, int i_putanna7) {

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
		if (s_choice7.equals("Іслам")) {
			s_Rezult = s_Rezult + "Повішайте навпроти входу велике око з синього скла «Назар»."
					+ "Або/та розмістіть фігурку сура з Корану\n\n";
		}
		if (s_choice7.equals("Християнство")) {
			s_Rezult = s_Rezult + "Ефективно буде охороняти будинок ікона. Найбільш сильною захисною іконою від злодіїв"
					+ " є Ікона «Семистрільна», її необхідно повісити навпроти вхідних дверей або над вхідними дверима, "
					+ "вона також захищає від сварок і розладу в сім'ї.\n\n";
		}
		if (s_choice7.equals("Буддизм")) {
			s_Rezult = s_Rezult + "Фігурка Будди навпроти входу прекрасно захищатиме ваше житло від негараздів.\n\n";
		}
		if (s_choice7.equals("Індуїзм")) {
			s_Rezult = s_Rezult
					+ "Розміщення амулетів навпроти входу прекрасно захищатиме ваше житло від негараздів.\n\n";
		}
		if (s_choice7.equals("інші релігії") || s_choice7.equals("Я атеїст")) {
			s_Rezult = s_Rezult + "Повішайте навпроти входу просто яскраву і цікаву картинку, поставте скульптуру,"
					+ " або іншу оригінальну річ, яка буде притягувати погляди.\n\n";
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
		if (i_putanna3 == 1) {
			s_Rezult = s_Rezult + "Вікно в коридорі, передпокої - це здорово, адже джерело денного"
					+ " світла збільшує приплив ци і її циркуляцію. Але, вікно безпосередньо навпроти"
					+ " входу, на жаль, несприятливо, так як енергія, надходячи через вхід, "
					+ "буде відразу ж залишати будинок через вікно. Щоб цього не траплялося закрийте"
					+ " вікно шторою або, якщо площа дозволяє, поставте перегородку з рослинами або"
					+ " ширму між вікном і входом.\n\n";
		}
		if (i_putanna4 == 1) {
			s_Rezult = s_Rezult + "Не зберігайте ззовні дверей речі. Прохід повинен бути вільним. "
					+ "Зробіть перед дверима персональне та незалежне освітлення.\n\n";
		}
		if (i_putanna5 == 1) {
			s_Rezult = s_Rezult + "Для захисту від злодіїв, розташуйте фігурку синього носорога у коридорі "
					+ "мордочкою до вхідних дверей, а ще краще - двох. Синій носоріг - древній символ фен-шуй"
					+ " для захисту будинку. Також, існує символ з пари слона і носорога синього кольору."
					+ "Потужним засобом захисту від негативної енергії є дзеркало багуа. Його можна повісити "
					+ "тільки зовні, над вхідними дверима або поруч з нею, але так, щоб в ньому не відбивалися"
					+ " люди або двері сусідньої квартири, або, якщо це стосується приватного будинку, "
					+ "вікна та двері сусідніх будинків і пішоходи. Ще однин фен шуй засіб від злодіїв і"
					+ " негативної енергії - символ у вигляді гармати. Він теж дуже сильний і не повинен"
					+ " бути спрямований на людей.\n\n";
		}
		if (i_putanna6 == 1) {
			s_Rezult = s_Rezult + "Ваші вхідні двері розташовані навпроти сходового маршу або ліфта,"
					+ " дана ситуація може сприяти витоку енергії, а значить і грошових коштів."
					+ " Щоб поліпшити фінансове становище підійміть поріг на 1-2 см, повісьте багуа над дверима.\n\n";
		}
		if (i_putanna7 == 1) {
			s_Rezult = s_Rezult + "Бажано, щоб дзеркало відображало Вас в ньому в повний ріст, "
					+ "в такому дзеркалі Ваша енергія подвоюється повноцінно. Вішати дзеркало "
					+ "навпроти вхідних дверей не варто - основна кількість вхідної ци відбитися"
					+ " і не потрапить всередину житла, найкращий варіант - розташувати дзеркало збоку"
					+ " від входу і тим самим візуально збільшити розміри передпокою, коридору."
					+ "Якщо передпокій перетікає в довгий прямий коридор, декоруюте його дзеркалами"
					+ " в шаховому порядку, то на одній стіні, то на інший, енергія при такому розташуванні"
					+ " не розганятиметься, перетворюючись в ша. Дзеркала можна замінити або "
					+ "чергувати набором настінних прикрас, кашпо з квітами і світильниками.";
		}

		/*
		 * switch (s_Bagua) { case "Схід": { i_Bagua = 1 ; } break; case
		 * "Південний схід": { i_Bagua = 2 ; } break; case "Підень": { i_Bagua =
		 * 3 ; } break; case "Південний захід": { i_Bagua = 4 ; } break; case
		 * "Захід": { i_Bagua = 5 ; } break; case "Північний захід": { i_Bagua =
		 * 6 ; } break; case "Північ": { i_Bagua = 7 ; } break; case
		 * "Північний схід": { i_Bagua = 8 ; } break; }
		 * 
		 * // choice1.add("Схід"); // choice1.add("Південний схід"); //
		 * choice1.add("Підень"); // choice1.add("Південний захід"); //
		 * choice1.add("Захід"); // choice1.add("Північний захід"); //
		 * choice1.add("Північ"); // choice1.add("Північний схід");
		 * 
		 * switch (i_Gua1) { case 1: { i_GuaNapram1 = 2 ; } break; case 2: {
		 * i_GuaNapram1 = 8 ; } break; case 3: { i_GuaNapram1 = 3 ; } break;
		 * case 4: { i_GuaNapram1 = 7 ; } break; case 6: { i_GuaNapram1 = 5 ; }
		 * break; case 7: { i_GuaNapram1 = 6 ; } break; case 8: { i_GuaNapram1 =
		 * 4 ; } break; case 9: { i_GuaNapram1 = 1 ; } break; }
		 * 
		 * if (i_GuaNapram1 == 7){ i_GuaNapram1 = 3 ; } if (i_GuaNapram1 == 8){
		 * i_GuaNapram1 = 4 ; } if (i_GuaNapram1 == 6){ i_GuaNapram1 = 5 ; }
		 * 
		 * if (i_Bagua == 7){ i_Bagua = 3 ; } if (i_Bagua == 8){ i_Bagua = 4 ; }
		 * if (i_Bagua == 6){ i_Bagua = 5 ; }
		 * 
		 */

		switch (s_Bagua) {
		case "Схід": {
			s_BaguaResult = "Дерево";
		}
			break;
		case "Південний схід": {
			s_BaguaResult = "Дерево";
		}
			break;
		case "Підень": {
			s_BaguaResult = "Вогонь";
		}
			break;
		case "Південний захід": {
			s_BaguaResult = "Земля";
		}
			break;
		case "Захід": {
			s_BaguaResult = "Метал";
		}
			break;
		case "Північний захід": {
			s_BaguaResult = "Метал";
		}
			break;
		case "Північ": {
			s_BaguaResult = "Вода";
		}
			break;
		case "Північний схід": {
			s_BaguaResult = "Земля";
		}
			break;
		}

		switch (i_Gua1) {
		case 1: {
			s_GuaNapram1 = "Вода";
		}
			break;
		case 2: {
			s_GuaNapram1 = "Земля";
		}
			break;
		case 3: {
			s_GuaNapram1 = "Дерево";
		}
			break;
		case 4: {
			s_GuaNapram1 = "Дерево";
		}
			break;
		case 6: {
			s_GuaNapram1 = "Метал";
		}
			break;
		case 7: {
			s_GuaNapram1 = "Метал";
		}
			break;
		case 8: {
			s_GuaNapram1 = "Земля";
		}
			break;
		case 9: {
			s_GuaNapram1 = "Вогонь";
		}
			break;
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
