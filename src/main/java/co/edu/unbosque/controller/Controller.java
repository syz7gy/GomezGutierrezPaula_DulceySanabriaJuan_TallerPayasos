package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import co.edu.unbosque.view.Console;
import co.edu.unbosque.view.MenuEleccion;
import co.edu.unbosque.view.MenuPayaso;
import co.edu.unbosque.view.MenuPrincipal;

public class Controller implements ActionListener, KeyListener {

	private MenuPrincipal menu;
	private MenuEleccion menuel;
	private MenuPayaso menpay;
	private Console con;

	public Controller() {
		menu = new MenuPrincipal();
		menuel = new MenuEleccion();
		menpay = new MenuPayaso();
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
