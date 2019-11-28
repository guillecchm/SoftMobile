package Dominio;

/**
* Clase: Box
* Atributos: 
		* int _id
		* int _estado
* Métodos:
		* set_Estado(int aEstado)
* 
***********************
* Autor/a: Julio Alberto Burgos Roma
**/
public class Box {
	private int _id;
	private int _estado;

	public Box() {
		throw new UnsupportedOperationException();
	}
	
	/**
	* Método: set_Estado(int aEstado)
	* Descripción: Establece el estado del Box
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
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

	public void set_estado(int _estado) {
		this._estado = _estado;
	}
}