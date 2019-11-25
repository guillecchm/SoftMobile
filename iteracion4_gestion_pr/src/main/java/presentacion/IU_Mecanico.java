package presentacion;

import Dominio.Mecanicos;
import Dominio.Box;


/**
* Clase:IU_Mecanico
* Atributos:
	* private Mecanicos _m;
	*private Box _b;
* Métodos:
	* cerrarVentana()
	* seleccionarBox()
	* cambiarEstadoBox()
	* pedirPiezasRecambio()
	* setM(Mecanicos aM)
	* Mecanicos getM()
	* setB(Box aB)
	* Box getB()
*
***********************
* Autor/a: Julio Alberto Burgos Roma
**/


public class IU_Mecanico {
	private Mecanicos _m;
	private Box _b;

	/**
	* Método: cerrarVentana()
	* Descripción: Cierra interfaz
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public void cerrarVentana() {
		throw new UnsupportedOperationException();
	}
	
	/**
	* Método: eleccionarBox()
	* Descripción: Selecciona una instancia box
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public void seleccionarBox() {
		throw new UnsupportedOperationException();
	}

	
	/**
	* Método: cambiarEstadoBox()
	* Descripción: Cambia el estado del un objeto box
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public void cambiarEstadoBox() {
		throw new UnsupportedOperationException();
	}

	/**
	* Método: pedirPiezasRecambio()
	* Descripción: Permite al mecanico el pedido de piezas de recambio
	* desde los boxes.
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public void pedirPiezasRecambio() {
		throw new UnsupportedOperationException();
	}

	public Mecanicos get_m() {
		return _m;
	}

	public void set_m(Mecanicos _m) {
		this._m = _m;
	}

	public Box get_b() {
		return _b;
	}

	public void set_b(Box _b) {
		this._b = _b;
	}


}