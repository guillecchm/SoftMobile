package Dominio;

/**
* Clase: Pedido
* Atributos:
	* int _id
	* double _precio_Total
	* Vector _pedidos
***********************
* Autor/a: Julio Alberto Burgos Roma
*/
public class Pedido {
	private int _id;
	private double _precio_Total;
	private java.util.Vector<PedidoPieza[]> _pedidos;

	public Pedido() {
		throw new UnsupportedOperationException();
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public double get_precio_Total() {
		return _precio_Total;
	}

	public void set_precio_Total(double _precio_Total) {
		this._precio_Total = _precio_Total;
	}

	public java.util.Vector<PedidoPieza[]> get_pedidos() {
		return _pedidos;
	}

	public void set_pedidos(java.util.Vector<PedidoPieza[]> _pedidos) {
		this._pedidos = _pedidos;
	}

	
}