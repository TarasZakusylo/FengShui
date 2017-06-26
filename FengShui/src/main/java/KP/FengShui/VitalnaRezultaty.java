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

public class VitalnaRezultaty extends JFrame {

	private static final long serialVersionUID = 1L;

	String s_Rezult = "";

	private JLabel l_logo;

	Desktop desktop = Desktop.getDesktop();

	public VitalnaRezultaty(String s_choice1, String s_choice2, String s_choice3, String s_choice4, String s_choice5,
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
				+ "Вітальня служить в першу чергу для спілкування людей і проведення їх дозвілля,"
				+ " тому баланс в інь ян найкраще змістити в користь ян.\n\n";
		
		if (s_choice1.equals("Загально. 1 лампочка") || s_choice1.equals("Загально. Люстра")) {
			s_Rezult = s_Rezult
					+ "Вітальня вдень повинна бути достатньо наповненою сонячним світлом,"
					+ " а вночі добре освітлено електричним. Враховуйте так само і те,"
					+ " що в цій кімнаті можуть проходити як вишукані прийоми з"
					+ " великою кількістю запрошених, так і вечірні посиданьки перед телевізором"
					+ " у сімейному кругу. В першому випадку освітлення потрібне яскраво і святково,"
					+ " а в другому - приглушене і спокійне, тому в гостинній кімнаті рекомендується"
					+ " продумати кілька джерел світла і досить добре встановити вимикач з плавною"
					+ " регулюванням потужності для основного освітлювача - диммер.\n\n";
		}
		if (s_choice2.equals("Дуже м'яка") || s_choice2.equals("М'яка")) {
			s_Rezult = s_Rezult
					+ "Для стимуляції ян, залучення ци і атмосфери розкоші використовуйте корпусні"
					+ " меблі з елементами з дзеркал і настінні дзеркала, яскраві кольорові акценти у"
					+ " вигляді диванних подушок, ваз, скульптурних композицій, картин.\n\n";
		}
		if (s_choice3.equals("Так, є кілька") || s_choice3.equals("Так, одна")) {
			s_Rezult = s_Rezult + "Алькови і ніші здатні застоювати енергію, тому прикрасьте їх дзеркалами, світильниками, "
					+ "картинами з підсвічуванням, або вазонами з живими рослинами.\n\n";
		}
		if (s_choice4.equals("Чудова ідея, хочу") ) {
			s_Rezult = s_Rezult + "Хорошим пристосуванням по залученню ци може стати невеликий кімнатний фонтан."
					+ " Він особливо доречний в південно-східному секторі багатства.\n\n";
		}
		if (s_choice4.equals("У мене є фонтан") ) {
			s_Rezult = s_Rezult + "Перемыстіть Ваш фонтан у південно-східний сектор, сетор багатства."
					+ "\n\n";
		}
		if (s_choice5.equals("Спинкою до дверей(вікна)")) {
			s_Rezult = s_Rezult + "Розташуйте крісла під кутом до дивана, це буде сприяти ненав'язливій"
					+ " обстановці і можливості вступати в розмову за бажанням. Люди відчувають себе впевненіше"
					+ " і більш захищено, коли меблі повернуті спинкою до стіни, не обов'язково приставляти"
					+ " диван або крісло впритул, головне, щоб ззаду не було вікна чи дверей.\n\n";
		}
		if (s_choice6.equals("Ні, вітальня є меншою за інші кімнати") || s_choice6.equals("Маю сумніви")) {
			s_Rezult = s_Rezult + "Вітальня повинна бути найбільшою кімнатою квартири або будинку."
					+ " Для хорошого фен шую, бажано, щоб центр квартири або будинку (або поверху будинку)"
					+ " перебував у вітальні. Таке планування приносить рівномірний розподіл ци по "
					+ "житлу в цілому, сприяє здоровій атмосфері і почуттю стабільності у господарів.\n\n";
		}
		if (s_choice7.equals("Немає взагалі") || s_choice7.equals("Є, квітучі (крокус, герань, орхідея, фіалка...)")|| s_choice7.equals("Є, плодові (гранат, цитрусові, інжин, ананас...)")) {
			s_Rezult = s_Rezult + "Вам необхідно змістити баланс енергії на сторону ян. "
					+ "Тому замініть рослини у вітальні на рослини з гострим листям, вони виражають ян.\n\n";
		}

		if (i_putanna1 == 1) {
			s_Rezult = s_Rezult + "Для того, щоб стилулювати циркулювання енергії ци рекулярно використовуйте музичний "
					+ "центр чи музичні інструменти, що є у Вашій вітальні (щодня).\n\n";
		}
		if (i_putanna2 == 1) {
			s_Rezult = s_Rezult + "Люстра у вітальні повинна бути великою із різним набором ламп."
					+ "Якщо є можливість, то повішайте кришталеву, тому, що кристали своїм блиском добре "
					+ "привертають ци. Єдине, зверніть увагу на те, щоб частини люстри не були"
					+ " загострені вниз, і не створювали своїми гострими краями і кутами стрілки ша"
					+ " ци, спрямовані на домочадців.\n\n";
		}
		if (i_putanna3 == 1) {
			s_Rezult = s_Rezult + "Від місця розташування телевізора чи дом. кінотеатра"
					+ "залежить направленість сімейної енергії. "
					+ "Встановивши екран в південно-східному куті, ви будете стимулювати приплив грошей,"
					+ " на півдні - визнання, повагу і славу, на південному-заході хороші взаємини і гармонію в шлюбі."
					+ " Північний і північно-західний напрямок нейтральні.\n\n";
		}
		if (i_putanna4 == 1) {
			s_Rezult = s_Rezult + "Перемістіть годинник у кут, щоб запустити там рух енергії.\n\n";
		}
		if (i_putanna5 == 1) {
			s_Rezult = s_Rezult
					+ "Бра у курку не даватиме енергії застоюватись.\n\n";
		}
		if (i_putanna6 == 1) {
			s_Rezult = s_Rezult + "Розташуйте меблі так, щоб навпроти вікна сидіти під кутом, "
					+ "щоб не виникало почуття уразливості, теж стосується і входу,"
					+ " інакше дивлячись в коридор, ваші гості будуть постійно рватися додому,"
					+ " але вхід повинен бути видимим хоча б краєм ока.\n\n";
		}
		if (i_putanna7 == 1) {
			s_Rezult = s_Rezult
					+ "Камін є одним із найбільших центрів притягування. Розставляйте предмети орієнтовно із ним.";
		}

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(500, 82, 482, 406);
		getContentPane().add(scrollPane);

		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setForeground(new Color(186, 85, 211));
		textPane.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textPane.setText(s_Rezult);

		JLabel label_2 = new JLabel("Вітальня");
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
		// l_logo.setIcon(new
		// ImageIcon("C:\\Users\\Zakkk\\Desktop\\Rezult.jpg"));
		getContentPane().add(l_logo);

		setVisible(true);
	}
}
