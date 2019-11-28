package Dominio;

/**
* Clase: GestorPedidos
* Métodos:
	* mododificarNPiezas(int aIdPieza, int aNPiezas)
	* obtenerListadoPiezas()
	* pedirPiezasRecambio(Object[] aPedidoPieza)
	* confirmarListaPiezas(Object[] aPedidoPieza)
***********************
* Autor/a: Julio Alberto Burgos Roma
*/
public class GestorPiezas {

	/**
	* Método: modificarNPiezas
	* Descripción: Modificar el stock existente de cada pieza en el
	* almacén.
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public int modificarNPiezas(int aIdPieza, int aNPiezas) {
		throw new UnsupportedOperationException();
	}

	/**
	* Método: obtenerListadoPiezas()
	* Descripción: Obtener el listado de piezas del stock del almacen
	* que se encuentran por debajo del umbral de calidad.
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public PedidoPieza[] obtenerListadoPiezas() {
		throw new UnsupportedOperationException();
	}

	/**
	* Método: pedirPiezasRecambio(Object[] aPedidoPieza)
	* Descripción: Permite al mecánico pedir una lista de piezas al almacén.
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public boolean pedirPiezasRecambio(Object[] aPedidoPieza) {
		throw new UnsupportedOperationException();
	}

	/**
	* Método: confirmarListaPiezas(Object[] aPedidoPieza)
	* Descripción: Permite al mecánico confirmar la lista de piezas previamente
	* solicitada.
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public boolean confirmarListaPiezas(Object[] aPedidoPiezas) {
		throw new UnsupportedOperationException();
	}
}