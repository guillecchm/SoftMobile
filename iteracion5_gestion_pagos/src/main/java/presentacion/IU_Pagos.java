package Presentacion;

import Dominio.Pago;
import Dominio.PedidoPieza;

/**
* Clase:IU_Mecanico
* Atributos:
	* private Pago _pago
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

public class IU_Pagos {
	private Pago _pago;

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
	* Método: generarCuentaPago(PedidoPieza[] aPedidos)
	* Descripción: Se encarga de lanzar la petición y mostrar al mecánico la cuenta 
	* que tiene que pagar el cliente.
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public void generarCuentaPago(PedidoPieza[] aPedidos) {
		throw new UnsupportedOperationException();
	}

	/**
	* Método: confirmarPago()
	* Descripción: Se encarga de lanzar la petición y mostrar si el cambio en
	* la factura se ha realizado correctamente, siendo esta que está pagada.
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public void confirmarPago() {
		throw new UnsupportedOperationException();
	}

	public Pago get_pago() {
		return _pago;
	}

	public void set_pago(Pago _pago) {
		this._pago = _pago;
	}

	
}