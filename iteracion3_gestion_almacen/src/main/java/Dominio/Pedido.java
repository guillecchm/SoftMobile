package Dominio;

public class Pedido {
	private int _id;
	private double _precio_Total;
	private PedidoPieza[] _pedidos;

	public void pedido() {
		throw new UnsupportedOperationException();
	}

	public void setId(int aId) {
		this._id = aId;
	}

	public int getId() {
		return this._id;
	}

	public void setPrecio_Total(double aPrecio_Total) {
		this._precio_Total = aPrecio_Total;
	}

	public double getPrecio_Total() {
		return this._precio_Total;
	}

	public void setPedidos(PedidoPieza[] aPedidos) {
		this._pedidos = aPedidos;
	}

	public PedidoPieza[] getPedidos() {
		return this._pedidos;
	}
}