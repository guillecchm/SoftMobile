package Dominio;

public class Piezas {
	private int _id;
	private String _nombre;
	private double _precio;
	private String _descripcion;
	private int _stock;
	private int _nMax;

	public void setId(int aId) {
		this._id = aId;
	}

	public int getId() {
		return this._id;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setPrecio(double aPrecio) {
		this._precio = aPrecio;
	}

	public double getPrecio() {
		return this._precio;
	}

	public void setDescripcion(String aDescripcion) {
		this._descripcion = aDescripcion;
	}

	public String getDescripcion() {
		return this._descripcion;
	}

	public void setStock(int aStock) {
		this._stock = aStock;
	}

	public int getStock() {
		return this._stock;
	}

	public void setNMax(int aNMax) {
		this._nMax = aNMax;
	}

	public int getNMax() {
		return this._nMax;
	}
}