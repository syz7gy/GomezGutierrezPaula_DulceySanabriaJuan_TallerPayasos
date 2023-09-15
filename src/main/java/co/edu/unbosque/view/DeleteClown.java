package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DeleteClown extends JFrame {
	private JPanel panel;
	private JLabel foto1;
	private Image img1, img2;
	private Icon icon, icon2;
	private JButton btn1, btn2;
	private JTextField txt;

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

	public Image getImg1() {
		return img1;
	}

	public void setImg1(Image img1) {
		this.img1 = img1;
	}

	public Image getImg2() {
		return img2;
	}

	public void setImg2(Image img2) {
		this.img2 = img2;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	public Icon getIcon2() {
		return icon2;
	}

	public void setIcon2(Icon icon2) {
		this.icon2 = icon2;
	}

	public JButton getBtn1() {
		return btn1;
	}

	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}

	public JTextField getTxt() {
		return txt;
	}

	public void setTxt(JTextField txt) {
		this.txt = txt;
	}

	public DeleteClown() {
		setTitle("Delete clown");
		setBounds(600, 200, 2500, 900);
		this.setSize(1088, 760);
		setResizable(false);
		setLocationRelativeTo(null);

		Font font1 = null;
		try {
			font1 = Font
					.createFont(Font.TRUETYPE_FONT,
							this.getClass().getResourceAsStream("/co/edu/unbosque/view/Jack Armstrong.ttf"))
					.deriveFont((float) 20);
			;
		} catch (Exception e) {
			e.printStackTrace();
		}

		img1 = new ImageIcon("src/main/java/co/edu/unbosque/view/images/Deleteclown.png").getImage();
		icon = new ImageIcon(img1.getScaledInstance(1088, 760, Image.SCALE_DEFAULT));
		foto1 = new JLabel();
		foto1.setBounds(0, 0, 1088, 760);
		foto1.setIcon(icon);

		txt = new JTextField();
		txt.setFont(font1);
		txt.setBounds(403, 325, 300, 100);
		txt.setBackground(Color.white);
		txt.setBorder(new EmptyBorder(0, 0, 0, 0));

		img2 = new ImageIcon("src/main/java/co/edu/unbosque/view/images/Back.png").getImage();
		icon2 = new ImageIcon(img2.getScaledInstance(90, 63, Image.SCALE_SMOOTH));
		btn2 = new JButton(icon2);
		btn2.setBounds(10, 10, 90, 63);
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(true);
		btn2.setFocusPainted(false);
		btn2.setBorder(BorderFactory.createEmptyBorder());

		add(btn2);
		add(txt);
		add(foto1);
		setVisible(false);
	}

	public void añadirMoto(String param) {
		if (txt == null) {
			JOptionPane.showMessageDialog(null, "You can't delete nothing.");
		}
	}
}
