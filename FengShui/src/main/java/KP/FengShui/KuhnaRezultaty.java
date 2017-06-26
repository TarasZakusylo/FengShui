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

public class KuhnaRezultaty extends JFrame {

	private static final long serialVersionUID = 1L;

	String s_Rezult = "";

	private JLabel l_logo;

	Desktop desktop = Desktop.getDesktop();

	public KuhnaRezultaty(String s_choice1, String s_choice2, String s_choice3, String s_choice4, String s_choice5,
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

		if (s_choice1.equals("Схід") || s_choice1.equals("Підень") || s_choice1.equals("Захід")
				|| s_choice1.equals("Північ") || s_choice1.equals("Північний схід")) {
			s_Rezult = s_Rezult
					+ "Переставте холодильник на південний схід, або південний захід, або північний захід. Перевірте, щоб поряд не було опалювальних систем.\n\n";
		}
		if (s_choice2.equals("Схід") || s_choice2.equals("Підень") || s_choice2.equals("Захід")
				|| s_choice2.equals("Північ") || s_choice2.equals("Північний схід")
				|| s_choice2.equals("Південний захід") || s_choice2.equals("Південний захід")) {
			s_Rezult = s_Rezult
					+ "Якщо є можливість, то переставте плиту на південну сторону, але не ставте її під вікно, у тутку, навпроти дверей чи посередині кухні.\n\n";
		}
		if (s_choice3.equals("Раз на тиждень") || s_choice3.equals("Раз на 2-3 дні")) {
			s_Rezult = s_Rezult + "Прибирайте частіше. Пам'ятайте про те, що стан, в якому перебувають "
					+ "газова плита і холодильник впливають на фінансовий стан сім'ї. Підтримуйте їх чистими"
					+ " і справними, а холодильник по можливості максимально заповнюйте продуктами і наводите в ньому порядок."
					+ "Безлад на кухні веде до фінансових негараздів, а порядок до достатку.\n\n";
		}
		if (s_choice4.equals("Залізна")) {
			s_Rezult = s_Rezult + "Ваша кухня в основному із металу. Надлишок металу (зазвичай в техно стилі) "
					+ "може привести до агресивності і напруги.\n\n";
		}
		if (s_choice4.equals("Дерев'яна")) {
			s_Rezult = s_Rezult + "Ваша кухня в основному із дерева. Предмети з деревини, в занадто"
					+ " великій кількості можуть призвести до атмосфери зайвої манірності.\n\n";
		}
		if (s_choice4.equals("Пластикова")) {
			s_Rezult = s_Rezult + "Ваша кухня в основному із пластику. Пластик сам по собі нейтральний і "
					+ "якості того чи іншого елемента він набуває завдяки своєму кольору "
					+ "(наприклад, білий пластик - якості металу).\n\n";
		}
		if (s_choice4.equals("Скляна")) {
			s_Rezult = s_Rezult + "Ваша кухня в основному із скла. Скло само по собі нейтральне і "
					+ "якості того чи іншого елемента воно набуває завдяки своєму кольору "
					+ "(наприклад, біле скло - якості металу).\n\n";
		}

		if (s_choice5.equals("Темний, тьмяний")) {
			s_Rezult = s_Rezult + "Баланс інь ян на кухні повинен бути зміщений на користь ян,"
					+ " але добитися його необхідно не кількістю яскравих кольорів і кутових форм,"
					+ " а світлими стінами і хорошим, комфортним освітленням.Найбільш придатними"
					+ " для стін кухні є світлі тони. Чорний, сірий і темно-коричневий не"
					+ " найкращий вибір ні для апетиту, ні для настрою, ні для здоров'я. "
					+ "Прохолодні кольори, наприклад, блакитний - знижують апетит, теплі - жовтий, "
					+ "оранжевий, червоний - підвищують, зелений налаштовує на більш здорове харчування "
					+ "з великою кількістю зелені і овочів, білий - бадьорить, додає відчуття простору "
					+ "і чистоти; бежевий, кремовий і коричневий вельми затишні, але спонукають до"
					+ " споживання кави і чорного чаю з випічкою.\n\n";
		}
		if (s_choice6.equals("Прибори") || s_choice6.equals("Посуд") || s_choice6.equals("Продукти")) {
			s_Rezult = s_Rezult + "Купіть меблі з великою кількістю шафок з дверцятами, що закриваються,"
					+ " в які поміститься все кухонне начиння, що дозволить тримати стіни і робочі поверхні порожніми і чистими.\n\n";
		}
		if (s_choice7.equals("Загальне. 1 лампочка") || s_choice7.equals("Загальне. Люстра")) {
			s_Rezult = s_Rezult + "Кухня повинна бути добре освітлена. Непогано подбати про "
					+ "декілька джерелах освітлення: над обіднім столом, над робочими поверхнями.\n\n";
		}

		if (i_putanna1 == 1) {
			s_Rezult = s_Rezult + "Не вішайте рукавички і інші пристосування на стіну, прибирайте ножі,"
					+ " виделки, терки і будь-які гострі предмети після використання, щоб не породжувати ша ци.\n\n";
		}
		if (i_putanna2 == 1) {
			s_Rezult = s_Rezult + "Обідній стіл (на кухні-їдальні) повинен бути досить великим, "
					+ "щоб всі члени сім'ї відчували себе за ним вільно під час трапези."
					+ " Спільні обіди зміцнюють відносини всередині сім'ї і"
					+ " роблять її сильніше у всіх життєвих аспектах.\n\n";
		}
		if (i_putanna3 == 1) {
			s_Rezult = s_Rezult + "Дзеркала на кухні краще поміщати тільки в їдальні зоні,"
					+ " щоб в них відбивалася готова їжа, подвоюючи і сприяючи достатку в домі,"
					+ " робочі поверхні залиште поза увагою дзеркал, адже процес приготування "
					+ "часто супроводжується безладдям, який подвоювати зовсім ні до чого."
					+ "Дзеркало не повинно бути розділене на кілька частин (наприклад, як дзеркальна плитка)"
					+ ", тому, що воно буде відображати ци обривками.\n\n";
		}
		if (i_putanna4 == 1) {
			s_Rezult = s_Rezult + "Важливо: людина, що готує їжу не повинен стояти спиною до вхідних дверей. "
					+ "У такому положенні він буде відчувати себе незахищеним, а це вплине на якість їжі. Тому,"
					+ " розставляючи меблі та побутові прилади, постарайтеся зробити так, щоб вхід був видимим"
					+ " (можна і бічним зором) з усіх основних позицій.\n\n";
		}
		if (i_putanna5 == 1) {
			s_Rezult = s_Rezult
					+ "Відкриті полиці заставляйте круглими ємностями для сипучих продуктів, а не кутовими.\n\n";
		}
		if (i_putanna6 == 1) {
			s_Rezult = s_Rezult + "Не ставте плиту впритул до холодильника або раковині, "
					+ "це породжує ша ци (можливі негативні наслідки - сварки в родині, "
					+ "дратівливість, агресія і втрати фінансів). Бажано, щоб ці предмети "
					+ "знаходилися якнайдалі один від одного.\n\n";
		}
		if (i_putanna7 == 1) {
			s_Rezult = s_Rezult
					+ "Використовуйте за призначенням дрібні електроприлади в секторах, які хочете стимулювати.";
		}

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(500, 82, 482, 406);
		getContentPane().add(scrollPane);

		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setForeground(new Color(186, 85, 211));
		textPane.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textPane.setText(s_Rezult);

		JLabel label_2 = new JLabel("Кухня");
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
