package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;

public class MenuPrincipal extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8560916431398316191L;
	private JPanel panel;
	private JLabel foto1;
	private Image imagen1, imagen2;
	private Icon icon1, icon2;
	private JButton btn1;
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
	public Image getImagen2() {
		return imagen2;
	}
	public void setImagen2(Image imagen2) {
		this.imagen2 = imagen2;
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
	public JButton getBtn1() {
		return btn1;
	}
	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}
	
	public MenuPrincipal() {
		setTitle("Menu");
		setBounds(600, 200, 2500, 900);
		this.setSize(1088, 760);
		setResizable(false);
		setLocationRelativeTo(null);
		// TODO Auto-generated constructor stub

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 234, 0));
		panel.setBounds(0, 0, 1088, 760);

		imagen1 = new ImageIcon("src/main/java/co/edu/unbosque/view/images/Menu.png").getImage();
		icon1 = new ImageIcon(imagen1.getScaledInstance(1088, 760, Image.SCALE_DEFAULT));
		foto1 = new JLabel();
		foto1.setBounds(0, 0, 1088, 760);
		foto1.setIcon(icon1);
	
		add(foto1);
		add(panel);		
		setVisible(true);
	}

}
