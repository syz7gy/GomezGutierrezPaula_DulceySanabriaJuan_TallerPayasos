package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

public class AddPayaso extends JFrame{
	
	private JPanel panel;
	private JLabel foto1;
	private Image img1, img2;
	private Icon icon, icon2;
	private JTextField id, cc, names, educationLevel;
	private JSpinner cantexistencia, unpresentacion;
	private JButton btn1, btn2;
	private SpinnerModel numAmigos;

	
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
		
	public JTextField getId() {
		return id;
	}
	public void setId(JTextField id) {
		this.id = id;
	}
	public JTextField getCc() {
		return cc;
	}
	public void setCc(JTextField cc) {
		this.cc = cc;
	}
	public JTextField getNames() {
		return names;
	}
	public void setNames(JTextField names) {
		this.names = names;
	}
	public JTextField getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(JTextField educationLevel) {
		this.educationLevel = educationLevel;
	}
	public JSpinner getCantexistencia() {
		return cantexistencia;
	}
	public void setCantexistencia(JSpinner cantexistencia) {
		this.cantexistencia = cantexistencia;
	}
	public JSpinner getUnpresentacion() {
		return unpresentacion;
	}
	public void setUnpresentacion(JSpinner unpresentacion) {
		this.unpresentacion = unpresentacion;
	}
	public JButton getBtn1() {
		return btn1;
	}
	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
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
	public JButton getBtn2() {
		return btn2;
	}
	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}
	public SpinnerModel getNumAmigos() {
		return numAmigos;
	}
	public void setNumAmigos(SpinnerModel numAmigos) {
		this.numAmigos = numAmigos;
	}
	public AddPayaso() {
		setTitle("Payaso");
		setBounds(600, 200, 2500, 900);
		this.setSize(1088, 760);
		setResizable(false);
		setLocationRelativeTo(null);
		
		Font font1 = null;
		try {
			font1 = Font.createFont(Font.TRUETYPE_FONT, this.getClass().getResourceAsStream("/co/edu/unbosque/view/Jack Armstrong.ttf")).deriveFont((float)14);;
			} catch (Exception e) {
				e.printStackTrace();		  
			}
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 234, 0));
		panel.setBounds(0, 0, 1088, 760);

		img1 = new ImageIcon("src/main/java/co/edu/unbosque/view/images/Addclown.png").getImage();
		icon = new ImageIcon(img1.getScaledInstance(1088, 760, Image.SCALE_DEFAULT));
		foto1 = new JLabel();
		foto1.setBounds(0, 0, 1088, 760);
		foto1.setIcon(icon);
		
		id = new JTextField();
		id.setFont(font1);
		id.setBounds(463, 283, 170, 30);
		id.setBackground(Color.white);
		id.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		cc = new JTextField();
		cc.setBounds(773, 283, 170, 30);
		cc.setFont(font1);
		cc.setBackground(Color.white);
		cc.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		names = new JTextField();
		names.setBounds(463, 403, 170, 30);
		names.setFont(font1);
		names.setBackground(Color.white);
		names.setBorder(new EmptyBorder(0, 0, 0, 0));

		educationLevel = new JTextField();
		educationLevel.setBounds(773, 403, 170, 30);
		educationLevel.setFont(font1);
		educationLevel.setBackground(Color.white);
		educationLevel.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		numAmigos = new SpinnerNumberModel(1, 1, 100, 1);
		cantexistencia = new JSpinner(numAmigos);
		cantexistencia.setBounds(623, 533, 170, 30);
		cantexistencia.setFont(font1);
		cantexistencia.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		btn1 = new JButton();
		btn1.setBounds(670, 593, 90, 93);
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(true);
		btn1.setFocusPainted(false);
		btn1.setBorder(BorderFactory.createEmptyBorder());
		
		img2 = new ImageIcon("src/main/java/co/edu/unbosque/view/images/Back.png").getImage();
		icon2 = new ImageIcon(img2.getScaledInstance(90, 63, Image.SCALE_SMOOTH));
		btn2 = new JButton(icon2);
		btn2.setBounds(10, 10, 90, 63);
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(true);
		btn2.setFocusPainted(false);
		btn2.setBorder(BorderFactory.createEmptyBorder());
		
		add(btn2);
		add(id);
		add(btn1);
		add(cc);
		add(names);
		add(educationLevel);
		add(cantexistencia);
		add(foto1);
		add(panel);		
		setVisible(false);
	}
}
