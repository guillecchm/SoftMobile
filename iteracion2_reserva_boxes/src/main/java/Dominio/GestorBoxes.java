package Dominio;

import java.security.Timestamp;
import java.util.Vector;

/**
* Clase: GestorBoxes
* Métodos:
		* getBox()
		* obtenerBoxLibre(timestamp aFecha)
		* getBoxesAsignados(String aDNI)
		* setBox(int aId, int aEstado)
* 
***********************
* Autor/a: Julio Alberto Burgos Roma
**/
public class GestorBoxes {
	
	/**
	* Método: getBoxes()
	* Descripción: Devuelve vector con los Boxes
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public Vector<Box> getBoxes() {
		throw new UnsupportedOperationException();
	}

	/**
	* Método: obtenerBoxLibre(timestamp aFecha)
	* Descripción: Devuelve box libre
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public Box obtenerBoxLibre(Timestamp aFecha) {
		throw new UnsupportedOperationException();
	}
	
	/**
	* Método: getBoxesAsignados(String aDNI)
	* Descripción: Devuelve vector con Boxes asignados
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public Vector<Box> getBoxesAsignados(String aDNI) {
		throw new UnsupportedOperationException();
	}

	/**
	* Método: setBox(int aId, int aEstado)
	* Descripción: Establece estado de un box
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public boolean setBox(int aId, int aEstado) {
		throw new UnsupportedOperationException();
	}
}