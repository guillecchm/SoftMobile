package Presentacion;

import Dominio.Pago;
import Dominio.PedidoPieza;

/**
* Clase:IU_Mecanico
* Atributos:
	* private Pago _pago
* M�todos:
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
	* Descripci�n: Cierra interfaz
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public void cerrarVentana() {
		throw new UnsupportedOperationException();
	}

	/**
	* M�todo: generarCuentaPago(PedidoPieza[] aPedidos)
	* Descripci�n: Se encarga de lanzar la petici�n y mostrar al mec�nico la cuenta 
	* que tiene que pagar el cliente.
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public void generarCuentaPago(PedidoPieza[] aPedidos) {
		throw new UnsupportedOperationException();
	}

	/**
	* M�todo: confirmarPago()
	* Descripci�n: Se encarga de lanzar la petici�n y mostrar si el cambio en
	* la factura se ha realizado correctamente, siendo esta que est� pagada.
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