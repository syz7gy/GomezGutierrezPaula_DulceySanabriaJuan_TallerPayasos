package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuEleccion extends JFrame {
	private JPanel panel;
	private JLabel foto1;
	private Image imagen1, img2;
	private Icon icon1, icon2;
	private JButton btn1, btn2, btn3;

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

	public Icon getIcon1() {
		return icon1;
	}

	public void setIcon1(Icon icon1) {
		this.icon1 = icon1;
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

	public Image getImg2() {
		return img2;
	}

	public void setImg2(Image img2) {
		this.img2 = img2;
	}

	public Icon getIcon2() {
		return icon2;
	}

	public void setIcon2(Icon icon2) {
		this.icon2 = icon2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public void setBtn3(JButton btn3) {
		this.btn3 = btn3;
	}

	public MenuEleccion() {
		setTitle("Eleccion");
		setBounds(600, 200, 2500, 900);
		this.setSize(1088, 760);
		setResizable(false);
		setLocationRelativeTo(null);
		// TODO Auto-generated constructor stub

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 234, 0));
		panel.setBounds(0, 0, 1088, 760);

		imagen1 = new ImageIcon("src/main/java/co/edu/unbosque/view/images/Choicemenu.png").getImage();
		icon1 = new ImageIcon(imagen1.getScaledInstance(1088, 760, Image.SCALE_DEFAULT));
		foto1 = new JLabel();
		foto1.setBounds(0, 0, 1088, 760);
		foto1.setIcon(icon1);

		btn1 = new JButton();
		btn1.setBounds(140, 330, 275, 303);
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(true);
		btn1.setFocusPainted(false);
		btn1.setBorder(BorderFactory.createEmptyBorder());
		
		btn2 = new JButton();
		btn2.setBounds(625, 330, 345, 323);
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(true);
		btn2.setFocusPainted(false);
		btn2.setBorder(BorderFactory.createEmptyBorder());
		
		img2 = new ImageIcon("src/main/java/co/edu/unbosque/view/images/Back.png").getImage();
		icon2 = new ImageIcon(img2.getScaledInstance(90, 63, Image.SCALE_SMOOTH));
		btn3 = new JButton(icon2);
		btn3.setBounds(10, 10, 90, 63);
		btn3.setContentAreaFilled(false);
		btn3.setBorderPainted(true);
		btn3.setFocusPainted(false);
		btn3.setBorder(BorderFactory.createEmptyBorder());
		
		add(btn3);
		panel.add(btn2);
		panel.add(btn1);
		add(panel);
		panel.add(foto1);
		setVisible(false);

	}

}
