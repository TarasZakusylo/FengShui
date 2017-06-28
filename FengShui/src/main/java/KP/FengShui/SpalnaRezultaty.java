package KP.FengShui;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class SpalnaRezultaty extends JFrame {

	private static final long serialVersionUID = 1L;

	String s_Rezult = "";

	private JLabel l_logo;

	Desktop desktop = Desktop.getDesktop();

	private JLabel label;
	
	public SpalnaRezultaty(String s_choice1, String s_choice2, String s_choice3, String s_choice4, String s_choice5,
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
				+ "У спальні інь має переважати над ян, щоб було"
				+ " розслаблення і відпочинок, для цього майте можливість приглушити світло або можливість регулювати "
				+ "освітлення від яскравого до приглушеного, меблі з плавними формами"
				+ " без гострих кутів, м'які тони. Гарні невеликі яскраві предмети - нічник, декоративна подушка.\n\n";

		if (s_choice1.equals("Маленька")) {
			s_Rezult = s_Rezult + "Маленька кімната стає просторіше, якщо в ній кількість предметів меблів зведено до необхідного мінімуму.\n\n";
		}
		if (s_choice1.equals("Велика")) {
			s_Rezult = s_Rezult + "Щоб царська спальня не будила в вас королівське почуття перебування в величезному"
					+ " і незатишному палаці поставте масивну меблі, наприклад, велика шафа, або, другий варіант - "
					+ "розділіть кімнату на кілька зон: саму спальню, де буде стояти ліжко і тумбочки, і місце для "
					+ "господині будинки з комодом, кріслом і туалетним столиком.\n\n";
		}
	
		if (s_choice2.equals("Темна, тьмяна") || s_choice2.equals("Маю сумніви") || s_choice2.equals("Яскрава")) {
			s_Rezult = s_Rezult
					+ "Зробіть колір стін в гамі світлих, пастельних тонів, що містить дрібний малюнок або є однотонними, "
					+ "то ж можна сказати і про покривала і штори. Підлога світла. Яскравими, насиченими кольорами "
					+ "акцентами в маленькій спальні можуть бути подушки, невеликий килимок (якщо килим великий,"
					+ " майже на всю підлогу, то повинен бути досить світлим, з варіаціями на тему основних колірних"
					+ " рішень, застосованих в спальні).\n\n";
		}
		if (s_choice3.equals("Назовні")) {
			s_Rezult = s_Rezult
					+ "Двері в спальню повинні відкриватися всередину, щоб енергія ци вільно проникала в кімнату і насичувала її.\n\n";
		}
		if (s_choice4.equals("Від 6 до 15 років") || s_choice4.equals("Від 15 до 18 років")) {
			s_Rezult = s_Rezult + "Дитина сама хоче брати участь в створенні свого «світу». Самовираження"
					+ " важливо для дитини, не беріть в \"штики\" його нововведення, навіть якщо вони зневажають"
					+ " старанно створений хороший фен-шуй. Постарайтеся м'яко і непомітно вплинути на нього,"
					+ " знайти компроміс між його бажаннями і сприятливою для його розвитку середовищем."
					+ "Постійно радьтесь.\n\n";
		}
		if (s_choice4.equals("Навпроти дверей")) {
			s_Rezult = s_Rezult + "Ліжко не повинна стояти навпроти вхідних дверей і"
					+ " не варто спати ногами до виходу, так як такий напрямок асоціюється з виносом небіжчика.\n\n";
		}
		if (s_choice4.equals("Під вікном")) {
			s_Rezult = s_Rezult + "Недобре, коли спинка ліжка виявляється під вікном, тобто ноги або голова сплячого біля вікна."
					+ " Вважається також, що якщо протягом дня на ліжко потрапляють прямі сонячні промені, "
					+ "то ліжко вбирає багато енергії ян і сон буде неспокійним.\n\n";
		}
		if (s_choice4.equals("У кутку")) {
			s_Rezult = s_Rezult + "Не ставте ліжко в кут, по кутах любить накопичуватися бруд не тільки видима, але і астральна, що може обтяжувати сон.\n\n";
		}

		if (s_choice5.equals("Так, навпроти ліжка")) {
			s_Rezult = s_Rezult + "Сплячі не повинні відображатися в дзеркалі. Якщо ви не можете його прибрати в інше місце, то накривайте на ніч тканиною.\n\n";
		}
		if (s_choice5.equals("Дзеркальна стеля")) {
			s_Rezult = s_Rezult + "Зеркальна стеля неприйнятна, так як перекриває зв'язок з космосом, дуже важливий для нашого здоров'я.\n\n";
		}
		if (s_choice5.equals("2 дзеркала навпроти")) {
			s_Rezult = s_Rezult + "Два дзеркала не повинні бути направлені один на одного, тому, що при цьому створюється коридор для астральних сутностей, "
					+ "в загальному, зі спокійним сном можуть виникнути проблеми.\n\n";
		}
		if (s_choice5.equals("Дзеркало навпроти входу")) {
			s_Rezult = s_Rezult + "Не вішайте дзеркало навпроти входу в кімнату - потік ци буде відображений і не зможе потрапити в спальню.\n\n";
		}
		if (s_choice5.equals("Дзеркало у куртку")) {
			s_Rezult = s_Rezult + "Зеркало в кутку дає дуже хороший стимул для циркуляції ци.\n\n";
		}
				
		if (s_choice6.equals("Фото себе наодинці")||s_choice6.equals("Фото із попереднім коханням")) {
			s_Rezult = s_Rezult + "Необхідно прибрати зі спальні: зображення когось одного"
					+ ", фотографії себе на самоті або поруч з колишньою любов'ю. "
					+ "Поставте в спальні зображення пари. Наприклад, закохану пару, що йде по пляжу"
					+ " або цілується, двох пливуть поруч дельфінів, двох обнімаються лебедів, двох горлінок.\n\n";
		}

		if (s_choice7.equals("Кілька рівнева") || s_choice7.equals("Із балками")) {
			s_Rezult = s_Rezult + "Різнорівневі стелі і балки неприйнятні - можуть погіршувати здоров'я. "
					+ "Балка, що проходить по стелі прямо над серединою ліжка подружжя здатна привести до натягнутих відносин, "
					+ "сварок і розлучення.\n\n";
		}
		if (s_choice7.equals("Дзеркальна")) {
			s_Rezult = s_Rezult + "Терміново позбавтесь дзеркальної сталі. Вона руйнує всі зв'язки.\n\n";
		}

		if (i_putanna1 == 1) {
			s_Rezult = s_Rezult + "Не варто вішати що-небудь велике і важке на стіни, до яких притиснута ліжко. "
					+ "Людина підсвідомо турбується, що предмет може впасти на нього та позбавляється міцного сну.\n\n";
		}
		if (i_putanna2 == 1) {
			s_Rezult = s_Rezult + "Телевізор у спальні не вітається, він є відкритим вікном у світ, навіть будучи"
					+ " вимкненим, а так само веде до роз'єднання пари. Іноді приводять порівняння, що спати поруч"
					+ " з телевізором все одно, що лежати на вершині гори. Теж відноситься і до комп'ютера. Якщо"
					+ " вам нікуди подітися від цих приладів, то накривайте їх екрани на ніч тканиною і висмикуйте з розетки.\n\n";
		}
		if (i_putanna3 == 1) {
			s_Rezult = s_Rezult + "Великі предмети, комод або ліжко, на приклад, не повинні перегороджувати вхід, щоб не перешкоджати течією енергії.\n\n";
		}
		if (i_putanna4 == 1) {
			s_Rezult = s_Rezult + "Замініть односпальне ліжко на двоспальне, нехай місця буде якомога більше.\n\n";
		}
		if (i_putanna5 == 1) {
			s_Rezult = s_Rezult + "Слідкуйте за тим, щоб гострі предмети та кути меблів не були спрямовані на сплячих, а люстра НЕ звисала над ліжком.\n\n";
		}
		if (i_putanna6 == 1) {
			s_Rezult = s_Rezult + "в спальні бажано тримати книги подалі від ліжка, в шафах і на полицях у яких є щільно "
					+ "закриваються дверцята. За змістом книги в спальні повинні бути позитивні.\n\n";
		}
		if (i_putanna7 == 1) {
			s_Rezult = s_Rezult + "Домашні квіти в спальні повинні стояти якомога далі від ліжка, а краще взагалі в цій кімнаті обходитися без них, особливо якщо спальня невелика.";
		}

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(500, 82, 482, 414);
		getContentPane().add(scrollPane);

		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setForeground(new Color(186, 85, 211));
		textPane.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textPane.setText(s_Rezult);

		JLabel label_2 = new JLabel("Спальня");
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
		
		label = new JLabel("Передмети сили");
		label.setForeground(new Color(0, 255, 255));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Sitka Text", Font.BOLD, 20));
		getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Інь і ян");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					desktop.browse(new URI("https://uk.wikipedia.org/wiki/%D0%86%D0%BD%D1%8C_%D1%96_%D1%8F%D0%BD"));
				} catch (Exception e1) {
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setBounds(500, 516, 482, 25);
		getContentPane().add(btnNewButton);
		
		l_logo = new JLabel("");
		l_logo.setBounds(0, 0, 994, 565);
		l_logo.setIcon(new ImageIcon("res/Rezult.jpg"));
//		l_logo.setIcon(new ImageIcon("C:\\Users\\Zakkk\\Desktop\\Rezult.jpg"));
		getContentPane().add(l_logo);

		setVisible(true);
	}
}
