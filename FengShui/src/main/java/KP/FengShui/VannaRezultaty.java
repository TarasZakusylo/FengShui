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

	private JLabel l_logo;

	private JLabel label;

	public VannaRezultaty(String s_choice1, String s_choice2, String s_choice3, String s_choice4, String s_choice5,
			String s_choice6, int i_putanna1, int i_putanna2) {

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
			s_Rezult = s_Rezult + "Для нашого здоров'я сприятлива ванна в гамі білого, "
					+ "пастельних або свіжих, неяскравих тонів блакитного і зеленого."
					+ " Ці відтінки допомагають нам розслабитися, відпочити, "
					+ "і легко очиститися від усього негативного.\n\n";
		}
		if (s_choice2.equals("Дзеркальна")) {
			s_Rezult = s_Rezult + "Не робіть стелю дзеркальною! Дзеркало відображає не тільки наші тіла, "
					+ "а й енергетичні потоки, і тим самим не пропускає їх вище, перериваючи нашу зв'язок з космосом.\n\n";
		}
		if (s_choice2.equals("Кілька рівнева")) {
			s_Rezult = s_Rezult
					+ "Стелю найкраще зробити білою і рівною - різнорівнева не дуже хороша для здоров'я.\n\n";
		}
		if (s_choice3.equals("Гострувата люстра")) {
			s_Rezult = s_Rezult
					+ "Уникайте люстр у яких вістря деяких частин спрямовані вниз - вони, немов протикають простір, створюючи стрілки ша ци.\n\n";
		}
		if (s_choice3.equals("Софіти, що випирають")) {
			s_Rezult = s_Rezult + "Форма Ваших софітів є витонченою, містить гострі кути"
					+ " або звисаючі кристали, краще розташовувати їх на стелі в тих місцях,"
					+ " під якими ви не перебуваєте за службовим, а краще, ті, під якими не"
					+ " проходите зовсім: у стіни або в ніші.\n\n";
		}
		if (s_choice3.equals("Софіти, що сховані")) {
			s_Rezult = s_Rezult + "Ваші софіти є ідеальними для освітлення ванни із точки зору феншуй.\n\n";
		}
		if (s_choice3.equals("Бра, світильники, люстра обтікаючої форми")) {
			s_Rezult = s_Rezult + "Для Вашої ванни осітлення є чудовим. Так і дотримуйтесь обтікаючих форм.\n\n";
		}
		if (s_choice3.equals("Бра, світильники, люстра кутової форми")) {
			s_Rezult = s_Rezult + "Старайтесь дотримуватись обтікаючих форм про організації освітлення.\n\n";
		}
		if (s_choice4.equals("Сантехніка лицем до дверей")) {
			s_Rezult = s_Rezult + "Перебуваючи у ванній кімнаті, моя руки або приймаючи душ, вам бажано"
					+ " мати можливість бачити вхідні двері. Нехай вона буде замкнена, і все ж, люди "
					+ "відчувають себе більш захищено і спокійно, коли вхід знаходиться в полі зору. "
					+ "Тому, по можливості, розмістіть сантехніку таким чином, щоб вам не довелося щось"
					+ " робити, повернувшись до дверей спиною.\n\n";
		}
		if (s_choice5.equals("Прямокутна")) {
			s_Rezult = s_Rezult + "Ванна або душова кабінка - найбільші і важливі предмети у ванній кімнаті. "
					+ "Якщо дозволяє простір і кошти, замість незграбною прямокутної ванни або душової, "
					+ "вибирайте круглий, напівкруглу або овальну. Ці форми асоціюються з кругляшками монети, "
					+ "а вода - символ грошового потоку, так що разом вони сприяють процвітанню і багатству.\n\n";
		}
		if (s_choice6.equals("Прямокутна") || s_choice6.equals("Раз на рік мию")) {
			s_Rezult = s_Rezult + "Якщо є можливість, то замініть раковину на округлу."
					+ " Кругла раковина - стильне і вдале рішення. Вона приноситиме в дім багатство та процвітання.\n\n";
		}

		if (i_putanna1 == 2) {
			s_Rezult = s_Rezult + "Світле дерево природного  кольору покрите прозорим лаком"
					+ " є дуже сприятливим у ванній. Недарма російські лазні і фінські сауни бувають "
					+ "найчастіше зі світлого дерева. Натуральне дерево сприяє оздоровленню. Тому, можете"
					+ " сміливо купувати фінську сауну-кабінку або просто розставити кілька банного приладдя,"
					+ " лавочку для ніг або діжку в своїй домашній ванній кімнаті.\n\n";
		}
		if (i_putanna2 == 2) {
			s_Rezult = s_Rezult + "Декоруйте ванну кімнату особливими акцентами, невеликими деталями і аксесуарами."
					+ " Тоді вони будуть стимулювати залучення ци в ванну і радувати око. "
					+ "Не варто так само економити на красивих бордюрах і декорах-вставках,"
					+ " які зазвичай входять в набір кахлю. Вони дуже добре привертають ци, "
					+ "при вмілому використанні створюють стиль і оживляють приміщення.";
		}

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(500, 82, 482, 399);
		getContentPane().add(scrollPane);

		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setForeground(new Color(186, 85, 211));
		textPane.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textPane.setText(s_Rezult);

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

		JButton button = new JButton("Положення дверей ванної кімнати");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setIcon(new ImageIcon("res/DveriVannoi.png"));
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setForeground(new Color(0, 128, 0));
		button.setBounds(500, 527, 482, 25);
		getContentPane().add(button);

		JButton button_1 = new JButton("Палітра кольорів для ванної кімнати");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setIcon(new ImageIcon("res/KoloruDlaVannu.png"));
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setForeground(new Color(0, 128, 0));
		button_1.setBounds(500, 502, 482, 25);
		getContentPane().add(button_1);

		label = new JLabel("");
		label.setBounds(33, 82, 427, 399);
		getContentPane().add(label);

		l_logo = new JLabel("");
		l_logo.setBounds(0, 0, 994, 565);
		l_logo.setIcon(new ImageIcon("res/Rezult.jpg"));
		// l_logo.setIcon(new
		// ImageIcon("C:\\Users\\Zakkk\\Desktop\\Rezult.jpg"));
		getContentPane().add(l_logo);

		setVisible(true);
	}
}
