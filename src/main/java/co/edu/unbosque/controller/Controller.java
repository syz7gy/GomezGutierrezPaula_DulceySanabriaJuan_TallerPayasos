package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import co.edu.unbosque.view.*;

public class Controller implements ActionListener, KeyListener {

	private MenuPrincipal menu;
	private MenuEleccion menuel;
	private MenuPayaso menpay;
	private AddPayaso addpay;
	private ShowPay showpay;
	private EditPay editpay;
	private DeleteClown deletpay;
	private MenuComediante mencom;
	private AddComedian addcom;
	private ShowCom showcom;
	private EditCom editcom;
	private DeleteComedian deletcom;
	private Console con;

	public Controller() {
		menu = new MenuPrincipal();
		menuel = new MenuEleccion();
		menpay = new MenuPayaso();
		addpay = new AddPayaso();
		showpay = new ShowPay();
		editpay = new EditPay();
		deletpay = new DeleteClown();
		mencom = new MenuComediante();
		addcom = new AddComedian();
		showcom = new ShowCom();
		editcom = new EditCom();
		deletcom = new DeleteComedian();
		
		con = new Console();

		agregarLectores();
		asignarOyentes();
	}

	/**
	 * Constructor de la clase Controller.
	 */

	public void asignarOyentes() {
		menu.addKeyListener(this);

	}

	/**
	 * Asigna una letra para la vista1.
	 */

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			menu.setVisible(false);
			menuel.setVisible(true);
		}
	}

	/**
	 * Refresca la pagina para actualizar los cambios.
	 */

	public void agregarLectores() {
		menuel.getBtn1().addActionListener(this);
		menuel.getBtn1().setActionCommand("boton1vista2");

		menuel.getBtn2().addActionListener(this);
		menuel.getBtn2().setActionCommand("boton2vista2");
		
		menuel.getBtn3().addActionListener(this);
		menuel.getBtn3().setActionCommand("botonbackvist2");
		
		addpay.getBtn2().addActionListener(this);
		addpay.getBtn2().setActionCommand("botonbackaddpay");
		
		showpay.getBtn1().addActionListener(this);
		showpay.getBtn1().setActionCommand("botonbackshowpay");
		
		editpay.getBtn2().addActionListener(this);
		editpay.getBtn2().setActionCommand("botonbackeditpay");
		
		deletpay.getBtn2().addActionListener(this);
		deletpay.getBtn2().setActionCommand("botonbackdeletpay");
		
		menpay.getBtn1().addActionListener(this);
		menpay.getBtn1().setActionCommand("btn1agregarpay");
		
		menpay.getBtn2().addActionListener(this);
		menpay.getBtn2().setActionCommand("btn2mostrarpay");
		
		menpay.getBtn3().addActionListener(this);
		menpay.getBtn3().setActionCommand("btn3editarpay");
		
		menpay.getBtn4().addActionListener(this);
		menpay.getBtn4().setActionCommand("btn4eliminarpay");
		
		menpay.getBtn5().addActionListener(this);
		menpay.getBtn5().setActionCommand("botonbackvist3");
		
		mencom.getBtn1().addActionListener(this);
		mencom.getBtn1().setActionCommand("btn1agregarcom");
		
		mencom.getBtn2().addActionListener(this);
		mencom.getBtn2().setActionCommand("btn2mostrarcom");
		
		mencom.getBtn3().addActionListener(this);
		mencom.getBtn3().setActionCommand("btn3editarcom");
		
		mencom.getBtn4().addActionListener(this);
		mencom.getBtn4().setActionCommand("btn4eliminarcom");
		
		mencom.getBtn5().addActionListener(this);
		mencom.getBtn5().setActionCommand("botonbackmencom");
		
		addcom.getBtn2().addActionListener(this);
		addcom.getBtn2().setActionCommand("botonbackaddcom");
		
		showcom.getBtn1().addActionListener(this);
		showcom.getBtn1().setActionCommand("botonbackshowcom");
		
		editcom.getBtn2().addActionListener(this);
		editcom.getBtn2().setActionCommand("botonbackeditcom");
		
		deletcom.getBtn2().addActionListener(this);
		deletcom.getBtn2().setActionCommand("botonbackdeletcom");

	}

	/**
	 * Asigna las acciones a los botones de las vistas y panele.
	 */

	@Override

	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case "boton1vista2": {
			menuel.setVisible(false);
			menpay.setVisible(true);
			break;
		}
		
		case "boton2vista2": {
			menuel.setVisible(false);
			mencom.setVisible(true);
			break;
		}
		
		case "btn1agregarpay": {
			menpay.setVisible(false);
			addpay.setVisible(true);
			break;
		}
		
		case "btn2mostrarpay": {
			menpay.setVisible(false);
			showpay.setVisible(true);
			break;
		}
		case "btn3editarpay":{
			menpay.setVisible(false);
			editpay.setVisible(true);
			break;
		}
		case "btn4eliminarpay":{
			menpay.setVisible(false);
			deletpay.setVisible(true);
			break;
		}
		case "btn1agregarcom":{
			mencom.setVisible(false);
			addcom.setVisible(true);
			break;
		}
		case "btn2mostrarcom":{
			mencom.setVisible(false);
			showcom.setVisible(true);
			break;
		}
		case "btn3editarcom":{
			mencom.setVisible(false);
			editcom.setVisible(true);
			break;
		}
		case "btn4eliminarcom":{
			mencom.setVisible(false);
			deletcom.setVisible(true);
			break;
		}
		case "botonbackvist2": {
			menuel.setVisible(false);
			menu.setVisible(true);
			break;
		}
		case "botonbackaddpay": {
			addpay.setVisible(false);
			menpay.setVisible(true);
			break;
		}
		case "botonbackshowpay": {
			showpay.setVisible(false);
			menpay.setVisible(true);
			break;
		}
		case "botonbackeditpay": {
			editpay.setVisible(false);
			menpay.setVisible(true);
			break;
		}
		case "botonbackdeletpay": {
			deletpay.setVisible(false);
			menpay.setVisible(true);
			break;
		}
		case "botonbackvist3": {
			menpay.setVisible(false);
			menuel.setVisible(true);
			break;
		}
		case "botonbackaddcom": {
			addcom.setVisible(false);
			mencom.setVisible(true);
			break;
		}
		case "botonbackshowcom": {
			showcom.setVisible(false);
			mencom.setVisible(true);
			break;
		}
		case "botonbackeditcom": {
			editcom.setVisible(false);
			mencom.setVisible(true);
			break;
		}
		case "botonbackdeletcom": {
			deletcom.setVisible(false);
			mencom.setVisible(true);
			break;
		}
		case "botonbackmencom": {
			mencom.setVisible(false);
			menuel.setVisible(true);
			break;
		}
		
		}
	}

	/**
	 * Asigna las funciones y la visibilidad de los botones, paneles y ventanas.
	 * Ademas de asignar los metodos.
	 */

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Permite utilizar los metodos de KeyTyped.
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	/**
	 * Permite utilizar los metodos de KeyPressed.
	 */
}
