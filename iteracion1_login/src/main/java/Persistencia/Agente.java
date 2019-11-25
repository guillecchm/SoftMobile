package Persistencia;

import java.sql.Connection;
import java.util.Vector;

/**
* Clase:Agente
* Atributos:
	* Connection _mbd
	  Agente agente
* Métodos:
	* Agente()
	* getAgente()
	* select(String aSQL)
	* insert(String aSQL)
	* delete(String)
	* update(String)
	* close()
*
***********************
* Autor/a: Julio Alberto Burgos Roma
**/


public class Agente {
	protected Connection _mbd;
	public Agente agente;

	public void Agente() {
		throw new UnsupportedOperationException();
	}
	
	/**
	* Método: getAgente
	* Descripción: Recupera una instancia del Agente
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public Agente getAgente() {
		throw new UnsupportedOperationException();
	}

	/**
	* Método: select
	* Descripción: Permite obtener datos de una BBDD SQL
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public Vector<Object> select(String aSQL) {
		throw new UnsupportedOperationException();
	}

	/**
	* Método: insert
	* Descripción: Insertar datos en una BBDD SQL
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public int insert(String aSQL) {
		throw new UnsupportedOperationException();
	}

	/**
	* Método: delete
	* Descripción: Eliminar datos de una BBDD SQL
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public int delete(String aSQL) {
		throw new UnsupportedOperationException();
	}

	/**
	* Método: update
	* Descripción: Actualizar datos de una BBDD SQL
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public int update(String aSQL) {
		throw new UnsupportedOperationException();
	}

	/**
	* Método: close
	* Descripción: Elimina una instancia del Agente
	***********************
	* Autor/a: Julio Alberto Burgos Roma
	**/
	public void close() {
		throw new UnsupportedOperationException();
	}
}