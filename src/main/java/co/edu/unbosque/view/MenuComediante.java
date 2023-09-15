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

public class MenuComediante extends JFrame{
	private JPanel panel;
	private JLabel foto1;
	private Image img1, img2;
	private Icon icon, icon2;
	private JButton btn1, btn2, btn3, btn4, btn5;
	
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
	public Icon getIcon() {
		return icon;
	}
	public void setIcon(Icon icon) {
		this.icon = icon;
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
	public JButton getBtn3() {
		return btn3;
	}
	public void setBtn3(JButton btn3) {
		this.btn3 = btn3;
	}
	public JButton getBtn4() {
		return btn4;
	}
	public void setBtn4(JButton btn4) {
		this.btn4 = btn4;
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
	public JButton getBtn5() {
		return btn5;
	}
	public void setBtn5(JButton btn5) {
		this.btn5 = btn5;
	}
	public MenuComediante() {		
	setTitle("Comediante");
	setBounds(600, 200, 2500, 900);
	this.setSize(1088, 760);
	setResizable(false);
	setLocationRelativeTo(null);
	
	panel = new JPanel();
	panel.setLayout(null);
	panel.setBackground(new Color(0, 234, 0));
	panel.setBounds(0, 0, 1088, 760);

	img1 = new ImageIcon("src/main/java/co/edu/unbosque/view/images/Comedianmenu.png").getImage();
	icon = new ImageIcon(img1.getScaledInstance(1088, 760, Image.SCALE_DEFAULT));
	foto1 = new JLabel();
	foto1.setBounds(0, 0, 1088, 760);
	foto1.setIcon(icon);
	
	btn1 = new JButton();
	btn1.setBounds(60, 480, 235, 93);
	btn1.setContentAreaFilled(false);
	btn1.setBorderPainted(true);
	btn1.setFocusPainted(false);
	btn1.setBorder(BorderFactory.createEmptyBorder());
	
	btn2 = new JButton();
	btn2.setBounds(310, 480, 235, 93);
	btn2.setContentAreaFilled(false);
	btn2.setBorderPainted(true);
	btn2.setFocusPainted(false);
	btn2.setBorder(BorderFactory.createEmptyBorder());
	
	btn3 = new JButton();
	btn3.setBounds(560, 480, 235, 93);
	btn3.setContentAreaFilled(false);
	btn3.setBorderPainted(true);
	btn3.setFocusPainted(false);
	btn3.setBorder(BorderFactory.createEmptyBorder());
	
	btn4 = new JButton();
	btn4.setBounds(810, 480, 235, 93);
	btn4.setContentAreaFilled(false);
	btn4.setBorderPainted(true);
	btn4.setFocusPainted(false);
	btn4.setBorder(BorderFactory.createEmptyBorder());
	
	img2 = new ImageIcon("src/main/java/co/edu/unbosque/view/images/Back.png").getImage();
	icon2 = new ImageIcon(img2.getScaledInstance(90, 63, Image.SCALE_SMOOTH));
	btn5 = new JButton(icon2);
	btn5.setBounds(10, 10, 90, 63);
	btn5.setContentAreaFilled(false);
	btn5.setBorderPainted(true);
	btn5.setFocusPainted(false);
	btn5.setBorder(BorderFactory.createEmptyBorder());
	
	add(btn5);
	add(btn2);
	add(btn1);
	add(btn2);
	add(btn3);
	add(btn4);
	add(foto1);
	add(panel);		
	setVisible(false);
	}
}
