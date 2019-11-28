package Dominio;

/**
* Clase: Pedido
* Atributos:
	* int _id_Pieza
	* int _n_Pieza
***********************
* Autor/a: Julio Alberto Burgos Roma
*/
public class PedidoPieza {
	private int _id_Pieza;
	private int _n_Pieza;

	public PedidoPieza() {
		throw new UnsupportedOperationException();
	}

	public int get_id_Pieza() {
		return _id_Pieza;
	}

	public void set_id_Pieza(int _id_Pieza) {
		this._id_Pieza = _id_Pieza;
	}

	public int get_n_Pieza() {
		return _n_Pieza;
	}

	public void set_n_Pieza(int _n_Pieza) {
		this._n_Pieza = _n_Pieza;
	}

}