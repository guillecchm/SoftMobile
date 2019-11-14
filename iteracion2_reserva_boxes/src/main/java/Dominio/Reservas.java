package Dominio;


public class Reservas {
	private int _id;
	private String _fecha_ini;
	private String _fecha_fin;
	private String _dniCliente;
	private Mecanicos _mecanico;
	private Box _box;

	public Reservas() {
		throw new UnsupportedOperationException();
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_fecha_ini() {
		return _fecha_ini;
	}

	public void set_fecha_ini(String _fecha_ini) {
		this._fecha_ini = _fecha_ini;
	}

	public String get_fecha_fin() {
		return _fecha_fin;
	}

	public void set_fecha_fin(String _fecha_fin) {
		this._fecha_fin = _fecha_fin;
	}

	public String get_dniCliente() {
		return _dniCliente;
	}

	public void set_dniCliente(String _dniCliente) {
		this._dniCliente = _dniCliente;
	}

	public Mecanicos get_mecanico() {
		return _mecanico;
	}

	public void set_mecanico(Mecanicos _mecanico) {
		this._mecanico = _mecanico;
	}

	public Box get_box() {
		return _box;
	}

	public void set_box(Box _box) {
		this._box = _box;
	}

	
}