package KP.FengShui;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Gua extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_logo;

	String s_kimnata = "";

	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;

	private JLabel label_9;
	private Choice choice1;
	private Choice choice2;
	private Choice choice8;
	private Choice choice7;
	private Choice choice6;
	private Choice choice4;
	private Choice choice3;
	private Choice choice5;

	private boolean b_simja = false;
	private boolean b_Stat1 = false;
	private boolean b_Stat2 = false;
	private boolean b_Stat3 = false;
	private boolean b_Stat4 = false;
	private boolean b_Stat5 = false;
	private boolean b_Stat6 = false;
	private int i_Gua1;
	private int i_Gua2;
	private int i_Gua3;
	private int i_Gua4;
	private int i_Gua5;
	private int i_Gua6;
	private int i_Riknarodjenna1 = 0;
	private int i_Riknarodjenna2 = 0;
	private int i_Riknarodjenna3 = 0;
	private int i_Riknarodjenna4 = 0;
	private int i_Riknarodjenna5 = 0;
	private int i_Riknarodjenna6 = 0;

	public Gua(String s, int i_kimnata) {
		super(s);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		if (i_kimnata == 1) {
			s_kimnata = "коридор :";
		}

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
				try {
					String s_Bagua = choice1.getSelectedItem();
					String s_choice2 = choice2.getSelectedItem();

//					if (b_simja == true) {
						switch (s_choice2) {
						case "1": {
							String s_choice3 = choice3.getSelectedItem();
							i_Riknarodjenna1 = Integer.parseInt(textField1.getText());
							if (s_choice3.equals("чоловіча")) {
								b_Stat1 = true;
							}
							rozrahunokGua(i_Riknarodjenna1, b_Stat1, 1);
						}
							break;
						case "2": {
							String s_choice3 = choice3.getSelectedItem();
							String s_choice4 = choice4.getSelectedItem();
							i_Riknarodjenna1 = Integer.parseInt(textField1.getText());
							i_Riknarodjenna2 = Integer.parseInt(textField2.getText());
							if (s_choice3.equals("чоловіча")) {
								b_Stat1 = true;
							}
							if (s_choice4.equals("чоловіча")) {
								b_Stat2 = true;
							}
							rozrahunokGua(i_Riknarodjenna1, b_Stat1, 1);
							rozrahunokGua(i_Riknarodjenna2, b_Stat2, 2);
						}
							break;
						case "3": {
							String s_choice3 = choice3.getSelectedItem();
							String s_choice4 = choice4.getSelectedItem();
							String s_choice5 = choice5.getSelectedItem();
							i_Riknarodjenna1 = Integer.parseInt(textField1.getText());
							i_Riknarodjenna2 = Integer.parseInt(textField2.getText());
							i_Riknarodjenna3 = Integer.parseInt(textField3.getText());
							if (s_choice3.equals("чоловіча")) {
								b_Stat1 = true;
							}
							if (s_choice4.equals("чоловіча")) {
								b_Stat2 = true;
							}
							if (s_choice5.equals("чоловіча")) {
								b_Stat3 = true;
							}
							rozrahunokGua(i_Riknarodjenna1, b_Stat1, 1);
							rozrahunokGua(i_Riknarodjenna2, b_Stat2, 2);
							rozrahunokGua(i_Riknarodjenna3, b_Stat3, 3);
						}
							break;
						case "4": {
							String s_choice3 = choice3.getSelectedItem();
							String s_choice4 = choice4.getSelectedItem();
							String s_choice5 = choice5.getSelectedItem();
							String s_choice6 = choice6.getSelectedItem();
							i_Riknarodjenna1 = Integer.parseInt(textField1.getText());
							i_Riknarodjenna2 = Integer.parseInt(textField2.getText());
							i_Riknarodjenna3 = Integer.parseInt(textField3.getText());
							i_Riknarodjenna4 = Integer.parseInt(textField4.getText());
							if (s_choice3.equals("чоловіча")) {
								b_Stat1 = true;
							}
							if (s_choice4.equals("чоловіча")) {
								b_Stat2 = true;
							}
							if (s_choice5.equals("чоловіча")) {
								b_Stat3 = true;
							}
							if (s_choice6.equals("чоловіча")) {
								b_Stat4 = true;
							}
							rozrahunokGua(i_Riknarodjenna1, b_Stat1, 1);
							rozrahunokGua(i_Riknarodjenna2, b_Stat2, 2);
							rozrahunokGua(i_Riknarodjenna3, b_Stat3, 3);
							rozrahunokGua(i_Riknarodjenna4, b_Stat4, 4);
						}
							break;
						case "5": {
							String s_choice3 = choice3.getSelectedItem();
							String s_choice4 = choice4.getSelectedItem();
							String s_choice5 = choice5.getSelectedItem();
							String s_choice6 = choice6.getSelectedItem();
							String s_choice7 = choice7.getSelectedItem();
							i_Riknarodjenna1 = Integer.parseInt(textField1.getText());
							i_Riknarodjenna2 = Integer.parseInt(textField2.getText());
							i_Riknarodjenna3 = Integer.parseInt(textField3.getText());
							i_Riknarodjenna4 = Integer.parseInt(textField4.getText());
							i_Riknarodjenna5 = Integer.parseInt(textField5.getText());
							if (s_choice3.equals("чоловіча")) {
								b_Stat1 = true;
							}
							if (s_choice4.equals("чоловіча")) {
								b_Stat2 = true;
							}
							if (s_choice5.equals("чоловіча")) {
								b_Stat3 = true;
							}
							if (s_choice6.equals("чоловіча")) {
								b_Stat4 = true;
							}
							if (s_choice7.equals("чоловіча")) {
								b_Stat5 = true;
							}
							rozrahunokGua(i_Riknarodjenna1, b_Stat1, 1);
							rozrahunokGua(i_Riknarodjenna2, b_Stat2, 2);
							rozrahunokGua(i_Riknarodjenna3, b_Stat3, 3);
							rozrahunokGua(i_Riknarodjenna4, b_Stat4, 4);
							rozrahunokGua(i_Riknarodjenna5, b_Stat5, 5);
						}
							break;
						case "6 і більше": {
							String s_choice3 = choice3.getSelectedItem();
							String s_choice4 = choice4.getSelectedItem();
							String s_choice5 = choice5.getSelectedItem();
							String s_choice6 = choice6.getSelectedItem();
							String s_choice7 = choice7.getSelectedItem();
							String s_choice8 = choice8.getSelectedItem();
							i_Riknarodjenna1 = Integer.parseInt(textField1.getText());
							i_Riknarodjenna2 = Integer.parseInt(textField2.getText());
							i_Riknarodjenna3 = Integer.parseInt(textField3.getText());
							i_Riknarodjenna4 = Integer.parseInt(textField4.getText());
							i_Riknarodjenna5 = Integer.parseInt(textField5.getText());
							i_Riknarodjenna6 = Integer.parseInt(textField6.getText());
							if (s_choice3.equals("чоловіча")) {
								b_Stat1 = true;
							}
							if (s_choice4.equals("чоловіча")) {
								b_Stat2 = true;
							}
							if (s_choice5.equals("чоловіча")) {
								b_Stat3 = true;
							}
							if (s_choice6.equals("чоловіча")) {
								b_Stat4 = true;
							}
							if (s_choice7.equals("чоловіча")) {
								b_Stat5 = true;
							}
							if (s_choice8.equals("чоловіча")) {
								b_Stat6 = true;
							}
							rozrahunokGua(i_Riknarodjenna1, b_Stat1, 1);
							rozrahunokGua(i_Riknarodjenna2, b_Stat2, 2);
							rozrahunokGua(i_Riknarodjenna3, b_Stat3, 3);
							rozrahunokGua(i_Riknarodjenna4, b_Stat4, 4);
							rozrahunokGua(i_Riknarodjenna5, b_Stat5, 5);
							rozrahunokGua(i_Riknarodjenna6, b_Stat6, 6);
						}
							break;
						}
//					}

					new Korudor("ФенШуй", s_Bagua, i_Gua1, i_Gua2, i_Gua3, i_Gua4, i_Gua5, i_Gua6);
					setVisible(false);

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Помилкове введення.");
				}
			}
		});
		b_Dali.setForeground(new Color(0, 128, 0));
		b_Dali.setFont(new Font("Sitka Text", Font.ITALIC, 24));
		b_Dali.setBounds(844, 0, 150, 50);
		getContentPane().add(b_Dali);

		JLabel label = new JLabel("Вкажіть сторону на яку виходить " + s_kimnata);
		label.setForeground(new Color(255, 255, 0));
		label.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 60, 600, 35);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Вкажіть кількість членів сім'ї :");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(255, 255, 0));
		label_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_1.setBounds(10, 126, 600, 35);
		getContentPane().add(label_1);

		JLabel label_7 = new JLabel("Гуа + Багуа");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(0, 255, 255));
		label_7.setFont(new Font("Sitka Text", Font.BOLD, 33));
		label_7.setBounds(150, 0, 695, 50);
		getContentPane().add(label_7);

		label_9 = new JLabel("Вкажіть рік народження та стать членів сім'ї (по фінансовому показнику)");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.CYAN);
		label_9.setFont(new Font("Sitka Text", Font.BOLD, 25));
		getContentPane().add(label_9);

		choice1 = new Choice();
		choice1.setBounds(692, 73, 206, 22);
		getContentPane().add(choice1);
		choice1.add("Схід");
		choice1.add("Південний схід");
		choice1.add("Підень");
		choice1.add("Південний захід");
		choice1.add("Захід");
		choice1.add("Північний захід");
		choice1.add("Північ");
		choice1.add("Північний схід");

		choice2 = new Choice();
		choice2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				b_simja = true;
			}
		});
		choice2.setBounds(692, 139, 206, 22);
		getContentPane().add(choice2);
		choice2.add("1");
		choice2.add("2");
		choice2.add("3");
		choice2.add("4");
		choice2.add("5");
		choice2.add("6 і більше");

		choice8 = new Choice();
		getContentPane().add(choice8);
		choice8.add("чоловіча");
		choice8.add("жіноча");

		choice7 = new Choice();
		getContentPane().add(choice7);
		choice7.add("чоловіча");
		choice7.add("жіноча");

		choice6 = new Choice();
		getContentPane().add(choice6);
		choice6.add("чоловіча");
		choice6.add("жіноча");

		choice5 = new Choice();
		getContentPane().add(choice5);
		choice5.add("чоловіча");
		choice5.add("жіноча");

		choice4 = new Choice();
		getContentPane().add(choice4);
		choice4.add("чоловіча");
		choice4.add("жіноча");

		choice3 = new Choice();
		getContentPane().add(choice3);
		choice3.add("чоловіча");
		choice3.add("жіноча");

		textField1 = new JTextField();
		getContentPane().add(textField1);
		textField1.setColumns(10);

		textField2 = new JTextField();
		textField2.setColumns(10);
		getContentPane().add(textField2);

		textField3 = new JTextField();
		textField3.setColumns(10);
		getContentPane().add(textField3);

		textField4 = new JTextField();
		textField4.setColumns(10);
		getContentPane().add(textField4);

		textField5 = new JTextField();
		textField5.setColumns(10);
		getContentPane().add(textField5);

		textField6 = new JTextField();
		textField6.setColumns(10);
		getContentPane().add(textField6);

		l_logo = new JLabel("");
		l_logo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {

				if (b_simja == true) {
					String s_choice2 = choice2.getSelectedItem();

					label_9.setBounds(0, 0, 0, 0);
					choice3.setBounds(0, 0, 0, 0);
					textField1.setBounds(0, 0, 0, 0);
					choice4.setBounds(0, 0, 0, 0);
					textField2.setBounds(0, 0, 0, 0);
					choice5.setBounds(0, 0, 0, 0);
					textField3.setBounds(0, 0, 0, 0);
					choice6.setBounds(0, 0, 0, 0);
					textField4.setBounds(0, 0, 0, 0);
					choice7.setBounds(0, 0, 0, 0);
					textField5.setBounds(0, 0, 0, 0);
					choice8.setBounds(0, 0, 0, 0);
					textField6.setBounds(0, 0, 0, 0);

					switch (s_choice2) {
					case "1": {
						label_9.setBounds(0, 192, 994, 35);
						choice3.setBounds(586, 233, 206, 22);
						textField1.setBounds(316, 233, 116, 22);
					}
						break;
					case "2": {
						label_9.setBounds(0, 192, 994, 35);
						choice3.setBounds(586, 233, 206, 22);
						textField1.setBounds(316, 233, 116, 22);
						choice4.setBounds(586, 281, 206, 22);
						textField2.setBounds(316, 281, 116, 22);
					}
						break;
					case "3": {
						label_9.setBounds(0, 192, 994, 35);
						choice3.setBounds(586, 233, 206, 22);
						textField1.setBounds(316, 233, 116, 22);
						choice4.setBounds(586, 281, 206, 22);
						textField2.setBounds(316, 281, 116, 22);
						choice5.setBounds(586, 329, 206, 22);
						textField3.setBounds(316, 329, 116, 22);
					}
						break;
					case "4": {
						label_9.setBounds(0, 192, 994, 35);
						choice3.setBounds(586, 233, 206, 22);
						textField1.setBounds(316, 233, 116, 22);
						choice4.setBounds(586, 281, 206, 22);
						textField2.setBounds(316, 281, 116, 22);
						choice5.setBounds(586, 329, 206, 22);
						textField3.setBounds(316, 329, 116, 22);
						choice6.setBounds(586, 377, 206, 22);
						textField4.setBounds(316, 377, 116, 22);
					}
						break;
					case "5": {
						label_9.setBounds(0, 192, 994, 35);
						choice3.setBounds(586, 233, 206, 22);
						textField1.setBounds(316, 233, 116, 22);
						choice4.setBounds(586, 281, 206, 22);
						textField2.setBounds(316, 281, 116, 22);
						choice5.setBounds(586, 329, 206, 22);
						textField3.setBounds(316, 329, 116, 22);
						choice6.setBounds(586, 377, 206, 22);
						textField4.setBounds(316, 377, 116, 22);
						choice7.setBounds(586, 423, 206, 22);
						textField5.setBounds(316, 423, 116, 22);
					}
						break;
					case "6 і більше": {
						label_9.setBounds(0, 192, 994, 35);
						choice3.setBounds(586, 233, 206, 22);
						textField1.setBounds(316, 233, 116, 22);
						choice4.setBounds(586, 281, 206, 22);
						textField2.setBounds(316, 281, 116, 22);
						choice5.setBounds(586, 329, 206, 22);
						textField3.setBounds(316, 329, 116, 22);
						choice6.setBounds(586, 377, 206, 22);
						textField4.setBounds(316, 377, 116, 22);
						choice7.setBounds(586, 423, 206, 22);
						textField5.setBounds(316, 423, 116, 22);
						choice8.setBounds(586, 473, 206, 22);
						textField6.setBounds(316, 473, 116, 22);
					}
						break;
					}
				}
			}
		});
		l_logo.setBounds(0, 0, 994, 565);
		l_logo.setIcon(new ImageIcon("res/Oputyvanna.jpg"));
		getContentPane().add(l_logo);

		setVisible(true);
	}

	void rozrahunokGua(int i_Riknarodjenna, boolean b_Stat, int i_Nomer) {
		int i_Gua;
		if (b_Stat == true) {
			int i_desatki = i_Riknarodjenna % 10;
			int i_odunuci = i_Riknarodjenna % 100 / 10;
			int i_suma = i_desatki + i_odunuci;
			if (i_suma >= 10) {
				i_desatki = i_suma % 10;
				i_odunuci = i_suma % 100 / 10;
				i_suma = i_desatki + i_odunuci;
			}
			if (i_Riknarodjenna < 2000) {
				i_Gua = 10 - i_suma;
			} else {
				i_Gua = 9 - i_suma;
			}
			if (i_Gua >= 10) {
				i_desatki = i_Gua % 10;
				i_odunuci = i_Gua % 100 / 10;
				i_Gua = i_desatki + i_odunuci;
			}
			if (i_Gua == 5) {
				i_Gua = 2;
			}
		} else {
			int i_desatki = i_Riknarodjenna % 10;
			int i_odunuci = i_Riknarodjenna % 100 / 10;
			int i_suma = i_desatki + i_odunuci;
			if (i_suma >= 10) {
				i_desatki = i_suma % 10;
				i_odunuci = i_suma % 100 / 10;
				i_suma = i_desatki + i_odunuci;
			}
			if (i_Riknarodjenna < 2000) {
				i_Gua = 5 + i_suma;
			} else {
				i_Gua = 6 + i_suma;
			}
			if (i_Gua >= 10) {
				i_desatki = i_Gua % 10;
				i_odunuci = i_Gua % 100 / 10;
				i_Gua = i_desatki + i_odunuci;
			}
			if (i_Gua == 5) {
				i_Gua = 8;
			}
		}
		switch (i_Nomer) {
		case 1: {
			i_Gua1 = i_Gua;
		}
			break;
		case 2: {
			i_Gua2 = i_Gua;
		}
			break;
		case 3: {
			i_Gua3 = i_Gua;
		}
			break;
		case 4: {
			i_Gua4 = i_Gua;
		}
			break;
		case 5: {
			i_Gua5 = i_Gua;
		}
			break;
		case 6: {
			i_Gua6 = i_Gua;
		}
			break;
		}
	}

}
