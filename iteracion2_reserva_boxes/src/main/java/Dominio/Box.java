package Dominio;

public class Box {
	private int _id;
	private int _estado;

	public Box(int aId, int aEstado) {
		throw new UnsupportedOperationException();
	}

	public void set_Estado(int aEstado) {
		throw new UnsupportedOperationException();
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public int get_estado() {
		return _estado;
	}

}