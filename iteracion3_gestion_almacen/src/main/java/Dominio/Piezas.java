package Dominio;

/**
* Clase: Pedido
* Atributos:
*	* int _id;
	* String _nombre;
	* double _precio;
	* String _descripcion;
	* int _stock;
	* int _nMax;
***********************
* Autor/a: Julio Alberto Burgos Roma
*/

public class Piezas {
	private int _id;
	private String _nombre;
	private double _precio;
	private String _descripcion;
	private int _stock;
	private int _nMax;

	public Piezas() {
		throw new UnsupportedOperationException();
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_nombre() {
		return _nombre;
	}

	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}

	public double get_precio() {
		return _precio;
	}

	public void set_precio(double _precio) {
		this._precio = _precio;
	}

	public String get_descripcion() {
		return _descripcion;
	}

	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}

	public int get_stock() {
		return _stock;
	}

	public void set_stock(int _stock) {
		this._stock = _stock;
	}

	public int get_nMax() {
		return _nMax;
	}

	public void set_nMax(int _nMax) {
		this._nMax = _nMax;
	}

	
}