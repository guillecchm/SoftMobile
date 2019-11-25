package Dominio;

/**
* Clase: Box
* Atributos: 
		* int _id
		* int _estado
* Métodos:
		* Box()
		* set_Estado(int aEstado)
		* getID()
* 
***********************
* Autor/a: Julio Alberto Burgos Roma
**/

public class Box {
	private int _id;
	private int _estado;
	
	/**
	* Método: Box()
	* Descripción: Constructor de la clase Box
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/

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
	
	/**
	* Método: getId()
	* Descripción: Devuele el Id de un Box
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/

	public int getId() {
$operation.getReference().prepare($args.get("property"))		return this._id;
	}
}