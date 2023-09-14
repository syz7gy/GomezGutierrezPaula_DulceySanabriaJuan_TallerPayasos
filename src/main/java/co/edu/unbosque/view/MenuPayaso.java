package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuPayaso extends JFrame{
	
	private JPanel panel;
	private JLabel foto1;
	private Image img1;
	private Icon icon;
	private JTextField text;
	
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
	
	public MenuPayaso() {
		setTitle("Payaso");
		setBounds(600, 200, 2500, 900);
		this.setSize(1088, 760);
		setResizable(false);
		setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 234, 0));
		panel.setBounds(0, 0, 1088, 760);

		img1 = new ImageIcon("src/main/java/co/edu/unbosque/view/images/TestMenPj.png").getImage();
		icon = new ImageIcon(img1.getScaledInstance(1088, 760, Image.SCALE_DEFAULT));
		foto1 = new JLabel();
		foto1.setBounds(0, 0, 1088, 760);
		foto1.setIcon(icon);
		
		text = new JTextField();
		text.setBounds(293, 413, 300, 30);
		text.setBackground(Color.white);
		
		add(text);
		add(foto1);
		add(panel);		
		setVisible(false);
	}

}
