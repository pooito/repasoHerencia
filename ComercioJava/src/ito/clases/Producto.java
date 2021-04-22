/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.clases;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Producto.
 * 
 * @author rherrera
 */
public class Producto {
	

	/**
	 * Description of the property nombre.
	 */
	private String nombre = "";

	/**
	 * Description of the property precio.
	 */
	private float precio = 0F;

	/**
	 * Description of the property existencias.
	 */
	private int existencias = 0;

	// Start of user code (user defined attributes for Producto)

	// End of user code

	public Producto(String nombre, float precio, int existencias) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.existencias = existencias;
	}
	/**
	 * The constructor.
	 */
	public Producto() {
		// Start of user code constructor for Producto)
		super();
		// End of user code
	}

	/**
	 * Description of the method calculaVenta.
	 * @param numeroUnidades 
	 * @return 
	 */
	
	public float calculaVenta(float numeroUnidades) {
		// Start of user code for method calculaVenta
		float calculaVenta = numeroUnidades*this.precio;
		return calculaVenta;
		// End of user code
	}

	// Start of user code (user defined methods for Producto)

	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns precio.
	 * @return precio 
	 */
	public float getPrecio() {
		return this.precio;
	}

	/**
	 * Sets a value to attribute precio. 
	 * @param newPrecio 
	 */
	public void setPrecio(float newPrecio) {
		this.precio = newPrecio;
	}

	/**
	 * Returns existencias.
	 * @return existencias 
	 */
	public int getExistencias() {
		return this.existencias;
	}

	/**
	 * Sets a value to attribute existencias. 
	 * @param newExistencias 
	 */
	public void setExistencias(int newExistencias) {
		this.existencias = newExistencias;
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", existencias=" + existencias + "]";
	}

}
