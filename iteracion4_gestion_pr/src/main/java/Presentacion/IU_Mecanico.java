package Presentacion;

import Dominio.Mecanicos;
import Dominio.Box;
import Dominio.PedidoPieza;

/**
* Clase:IU_Mecanico
* Atributos:
	* private Mecanicos _m
	* private Box _b
	* private PedidoPieza[] _pedidos
* Métodos:
	* cerrarVentana()
	* seleccionarBox()
	* cambiarEstadoBox()
	* pedirPiezasRecambio()
	* obtenerCuenta() 
*
***********************
* Autor/a: Julio Alberto Burgos Roma
**/
public class IU_Mecanico {
	private Mecanicos _m;
	private Box _b;
	private PedidoPieza[] _pedidos;

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

	/**
	* Método: obtenerCuenta()
	* Descripción: Permite al mecanico obtener la factura y el total que tiene que
	* pagar el cliente.
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public void obtenerCuenta() {
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