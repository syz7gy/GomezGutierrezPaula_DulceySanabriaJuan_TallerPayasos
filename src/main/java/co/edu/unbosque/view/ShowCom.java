package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.ScrollPane;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ShowCom extends JFrame {
	private JPanel panel;
	private JLabel foto1;
	private Image imagen1, img2;
	private Icon icon1, icon2;
	private ScrollPane scroll;
	private JButton btn1;
	private JTextArea txt;

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getFoto1() {
		return foto1;
	}

	public void setFoto1(JLabel foto1) {
		this.foto1 = foto1;
	}

	public Image getImagen1() {
		return imagen1;
	}

	public void setImagen1(Image imagen1) {
		this.imagen1 = imagen1;
	}

	public Image getImg2() {
		return img2;
	}

	public void setImg2(Image img2) {
		this.img2 = img2;
	}

	public Icon getIcon1() {
		return icon1;
	}

	public void setIcon1(Icon icon1) {
		this.icon1 = icon1;
	}

	public Icon getIcon2() {
		return icon2;
	}

	public void setIcon2(Icon icon2) {
		this.icon2 = icon2;
	}

	public ScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(ScrollPane scroll) {
		this.scroll = scroll;
	}

	public JButton getBtn1() {
		return btn1;
	}

	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	public JTextArea getTxt() {
		return txt;
	}

	public void setTxt(JTextArea txt) {
		this.txt = txt;
	}

	public ShowCom() {
		setTitle("ShowComedian");
		setBounds(600, 200, 2500, 900);
		this.setSize(1088, 760);
		setResizable(false);
		setLocationRelativeTo(null);

		Font font1 = null;
		try {
			font1 = Font
					.createFont(Font.TRUETYPE_FONT,
							this.getClass().getResourceAsStream("/co/edu/unbosque/view/Jack Armstrong.ttf"))
					.deriveFont((float) 14);
			;
		} catch (Exception e) {
			e.printStackTrace();
		}

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 234, 0));
		panel.setBounds(0, 0, 1088, 760);

		imagen1 = new ImageIcon("src/main/java/co/edu/unbosque/view/images/Showcomedian.png").getImage();
		icon1 = new ImageIcon(imagen1.getScaledInstance(1088, 760, Image.SCALE_DEFAULT));
		foto1 = new JLabel();
		foto1.setBounds(0, 0, 1088, 760);
		foto1.setIcon(icon1);

		txt = new JTextArea();
		txt.setEditable(false);
		txt.setBorder(null);
		txt.setBorder(new EmptyBorder(0, 0, 0, 0));
		txt.setFont(font1);
		txt.setBorder(BorderFactory.createEmptyBorder());

		scroll = new ScrollPane();
		scroll.setBackground(null);
		scroll.setBounds(340, 250, 400, 400);
		scroll.add(txt);
		scroll.setFont(font1);

		img2 = new ImageIcon("src/main/java/co/edu/unbosque/view/images/Back.png").getImage();
		icon2 = new ImageIcon(img2.getScaledInstance(90, 63, Image.SCALE_SMOOTH));
		btn1 = new JButton(icon2);
		btn1.setBounds(10, 10, 90, 63);
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(true);
		btn1.setFocusPainted(false);
		btn1.setBorder(BorderFactory.createEmptyBorder());

		add(btn1);
		add(scroll);
		add(foto1);
		add(panel);
		setVisible(false);
	}

}
