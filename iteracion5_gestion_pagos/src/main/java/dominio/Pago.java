package Dominio;

/**
* Clase:Pago
* Atributos:
	* private Mecanicos _mecanico
	* private String _dni_cliente
	* private PedidoPieza[] _piezas
	* private double _cantidad
	* private boolean _pagado
*
***********************
* Autor/a: Julio Alberto Burgos Roma
**/
public class Pago {
	private Mecanicos _mecanico;
	private String _dni_cliente;
	private PedidoPieza[] _piezas;
	private double _cantidad;
	private boolean _pagado;

	public Pago() {
		throw new UnsupportedOperationException();
	}

	public Mecanicos get_mecanico() {
		return _mecanico;
	}

	public void set_mecanico(Mecanicos _mecanico) {
		this._mecanico = _mecanico;
	}

	public String get_dni_cliente() {
		return _dni_cliente;
	}

	public void set_dni_cliente(String _dni_cliente) {
		this._dni_cliente = _dni_cliente;
	}

	public PedidoPieza[] get_piezas() {
		return _piezas;
	}

	public void set_piezas(PedidoPieza[] _piezas) {
		this._piezas = _piezas;
	}

	public double get_cantidad() {
		return _cantidad;
	}

	public void set_cantidad(double _cantidad) {
		this._cantidad = _cantidad;
	}

	public boolean is_pagado() {
		return _pagado;
	}

	public void set_pagado(boolean _pagado) {
		this._pagado = _pagado;
	}

}