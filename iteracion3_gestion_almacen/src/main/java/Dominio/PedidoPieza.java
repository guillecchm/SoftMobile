package Dominio;

public class PedidoPieza {
	private int _id_Pieza;
	private int _n_Pieza;

	public void pedidoPieza() {
		throw new UnsupportedOperationException();
	}

	public void setId_Pieza(int aId_Pieza) {
		this._id_Pieza = aId_Pieza;
	}

	public int getId_Pieza() {
		return this._id_Pieza;
	}

	public void setN_Pieza(int aN_Pieza) {
		this._n_Pieza = aN_Pieza;
	}

	public int getN_Pieza() {
		return this._n_Pieza;
	}
}