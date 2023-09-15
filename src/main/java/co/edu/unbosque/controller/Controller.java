package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import co.edu.unbosque.model.ClownDTO;
import co.edu.unbosque.model.ComedianDTO;
import co.edu.unbosque.model.persistance.ClownDAO;
import co.edu.unbosque.model.persistance.ComedianDAO;
import co.edu.unbosque.model.persistance.PersonDAO;
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
	private PersonDAO pdao;
	private ClownDAO cldao;
	private ComedianDAO comdao;
	
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
		//ELECCION PARA ENTRAR AL MENU PAYASO
		menuel.getBtn1().addActionListener(this);
		menuel.getBtn1().setActionCommand("boton1vista2");
		//ELECCION PARA ENTRAR AL MENU COMEDIANTE
		menuel.getBtn2().addActionListener(this);
		menuel.getBtn2().setActionCommand("boton2vista2");
		//ELECCION PARA VOLVER AL MENU PRINCIPAL
		menuel.getBtn3().addActionListener(this);
		menuel.getBtn3().setActionCommand("botonbackvist2");
		//ELECCION PARA VOLVER AL MENU DE PAYASO DESDE LA VENTANA AGREGAR PAYASO
		addpay.getBtn2().addActionListener(this);
		addpay.getBtn2().setActionCommand("botonbackaddpay");
		//ELECCION PARA VOLVER AL MENU DE PAYASO DESDE LA VENTANA MOSTRAR PAYASO
		showpay.getBtn1().addActionListener(this);
		showpay.getBtn1().setActionCommand("botonbackshowpay");
		//ELECCION PARA VOLVER AL MENU DE PAYASO DESDE LA VENTANA EDITAR PAYASO
		editpay.getBtn2().addActionListener(this);
		editpay.getBtn2().setActionCommand("botonbackeditpay");
		//ELECCION PARA VOLVER AL MENU DE PAYASO DESDE LA VENTANA ELIMINAR PAYASO
		deletpay.getBtn2().addActionListener(this);
		deletpay.getBtn2().setActionCommand("botonbackdeletpay");
		//ELECCION PARA IR AL MENU AGREGAR PAYASO
		menpay.getBtn1().addActionListener(this);
		menpay.getBtn1().setActionCommand("btn1agregarpay");
		//ELECCION PARA IR AL MENU MOSTRAR PAYASO
		menpay.getBtn2().addActionListener(this);
		menpay.getBtn2().setActionCommand("btn2mostrarpay");
		//ELECCION PARA IR AL MENU EDITAR PAYASO
		menpay.getBtn3().addActionListener(this);
		menpay.getBtn3().setActionCommand("btn3editarpay");
		//ELECCION PARA IR AL MENU ELIMINAR PAYASO
		menpay.getBtn4().addActionListener(this);
		menpay.getBtn4().setActionCommand("btn4eliminarpay");
		//ELECCION PARA DEVOLVERSE AL MENU DE ELECCION ENTRE COMEDIANTE Y PAYASO (DESDE EL MENU DE PAYASO)
		menpay.getBtn5().addActionListener(this);
		menpay.getBtn5().setActionCommand("botonbackvist3");
		//ELECCION PARA IR AL MENU AGREGAR COMEDIANTE
		mencom.getBtn1().addActionListener(this);
		mencom.getBtn1().setActionCommand("btn1agregarcom");
		//ELECCION PARA IR AL MENU MOSTRAR COMEDIANTE
		mencom.getBtn2().addActionListener(this);
		mencom.getBtn2().setActionCommand("btn2mostrarcom");
		//ELECCION PARA IR AL MENU EDITAR COMEDIANTE
		mencom.getBtn3().addActionListener(this);
		mencom.getBtn3().setActionCommand("btn3editarcom");
		//ELECCION PARA IR AL MENU ELIMINAR COMEDIANTE
		mencom.getBtn4().addActionListener(this);
		mencom.getBtn4().setActionCommand("btn4eliminarcom");
		//DEVOLVERSE AL MENU ELECCION ENTRE PAYASO Y COMEDIANTE (DESDE MENU DE COMEDIANTE)
		mencom.getBtn5().addActionListener(this);
		mencom.getBtn5().setActionCommand("botonbackmencom");
		//ELECCION PARA VOLVER AL MENU DE COMEDIANTE DESDE LA VENTANA AGREGAR COMEDIANTE
		addcom.getBtn2().addActionListener(this);
		addcom.getBtn2().setActionCommand("botonbackaddcom");
		//ELECCION PARA VOLVER AL MENU DE COMEDIANTE DESDE LA VENTANA MOSTRAR COMEDIANTE
		showcom.getBtn1().addActionListener(this);
		showcom.getBtn1().setActionCommand("botonbackshowcom");
		//ELECCION PARA VOLVER AL MENU DE COMEDIANTE DESDE LA VENTANA EDITAR COMEDIANTE
		editcom.getBtn2().addActionListener(this);
		editcom.getBtn2().setActionCommand("botonbackeditcom");
		//ELECCION PARA VOLVER AL MENU DE COMEDIANTE DESDE LA VENTANA ELIMINAR COMEDIANTE
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
			int id = Integer.parseInt(addpay.getId().getText());
			long cc = Long.parseLong(addpay.getCc().getText());
			String name = addpay.getNames().getText();
			String educationLevel = addpay.getEducationLevel().getText();
			int numFriends = (int) addpay.getNumAmigos().getValue();
			
			ClownDTO newClown = new ClownDTO(id, cc, name, educationLevel, numFriends);
			
			cldao.create(newClown, "clown");
			
			break;
		}
		
		case "btn2mostrarpay": {
			menpay.setVisible(false);
			showpay.setVisible(true);
			
			showpay.getTxt().setText(cldao.readAll());
			
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
			
			int id = Integer.parseInt(deletpay.getTxt().getText());
			
			cldao.deleteById(id);
			
			break;
		}
		case "btn1agregarcom":{
			mencom.setVisible(false);
			addcom.setVisible(true);
			
			int id = Integer.parseInt(addcom.getId().getText());
			long cc = Long.parseLong(addcom.getCc().getText());
			String name = addcom.getNames().getText();
			String educationLevel = addcom.getEducationLevel().getText();
			int numPresentations = (int) addcom.getNumAmigos().getValue();
			
			ComedianDTO newCom = new ComedianDTO(id, cc, name, educationLevel, numPresentations);
			
			comdao.create(newCom, "comedian");
			
			break;
		}
		case "btn2mostrarcom":{
			mencom.setVisible(false);
			showcom.setVisible(true);
			
			showcom.getTxt().setText(comdao.readAll());
			
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
			
			int id = Integer.parseInt(deletcom.getTxt().getText());
			
			comdao.deleteById(id);
			
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
