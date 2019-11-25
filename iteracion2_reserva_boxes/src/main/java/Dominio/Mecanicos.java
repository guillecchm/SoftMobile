package Dominio;

/**
* Clase: Mecanicos
* Atributos: 
		* String _nombre
		* String _apellidos
		* String _dni
		* String _tlfn
		* double _sueldo
		* Box _box_actual
* 
***********************
* Autor/a: Julio Alberto Burgos Roma
**/

public class Mecanicos {
	private String _nombre;
	private String _apellidos;
	private String _dni;
	private String _tlfn;
	private double _sueldo;
	private Box _box_actual;

	
	public void Mecanico() {
		throw new UnsupportedOperationException();
	}


	public String get_nombre() {
		return _nombre;
	}


	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}


	public String get_apellidos() {
		return _apellidos;
	}


	public void set_apellidos(String _apellidos) {
		this._apellidos = _apellidos;
	}


	public String get_dni() {
		return _dni;
	}


	public void set_dni(String _dni) {
		this._dni = _dni;
	}


	public String get_tlfn() {
		return _tlfn;
	}


	public void set_tlfn(String _tlfn) {
		this._tlfn = _tlfn;
	}


	public double get_sueldo() {
		return _sueldo;
	}


	public void set_sueldo(double _sueldo) {
		this._sueldo = _sueldo;
	}


	public Box get_box_actual() {
		return _box_actual;
	}


	public void set_box_actual(Box _box_actual) {
		this._box_actual = _box_actual;
	}
}	