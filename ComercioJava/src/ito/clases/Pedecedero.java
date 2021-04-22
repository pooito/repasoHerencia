/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.clases;

import ito.clases.Producto;
import java.time.LocalDate;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Pedecedero.
 * 
 * @author rherrera
 */
public class Pedecedero extends Producto {
	

	/**
	 * Description of the property fechaCaducidad.
	 */
	private LocalDate fechaCaducidad = null;

	/**
	 * Description of the property descuento.
	 */
	private float descuento = 0F;

	// Start of user code (user defined attributes for Pedecedero)

	// End of user code
	public Pedecedero(String nombre, float precio, int existencias, LocalDate fechaCaducidad, float descuento) {
		super(nombre, precio, existencias);
		this.fechaCaducidad = fechaCaducidad;
		this.descuento = descuento;
	}
	/**
	 * The constructor.
	 */
	public Pedecedero() {
		// Start of user code constructor for Pedecedero)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Pedecedero)

	// End of user code
	/**
	 * Returns fechaCaducidad.
	 * @return fechaCaducidad 
	 */
	public LocalDate getFechaCaducidad() {
		return this.fechaCaducidad;
	}

	/**
	 * Sets a value to attribute fechaCaducidad. 
	 * @param newFechaCaducidad 
	 */
	public void setFechaCaducidad(LocalDate newFechaCaducidad) {
		this.fechaCaducidad = newFechaCaducidad;
	}

	/**
	 * Returns descuento.
	 * @return descuento 
	 */
	public float getDescuento() {
		return this.descuento;
	}

	/**
	 * Sets a value to attribute descuento. 
	 * @param newDescuento 
	 */
	public void setDescuento(float newDescuento) {
		this.descuento = newDescuento;
	}
	@Override
	public String toString() {
		return "Pedecedero [fechaCaducidad=" + fechaCaducidad + ", descuento=" + descuento + ", Nombre="
				+ getNombre() + ", Precio=" + getPrecio() + ", Existencias=" + getExistencias() + "]";
	}
	
	@Override
	public float calculaVenta(float numeroUnidades) {
		// TODO Auto-generated method stub
		float calculaVenta=super.calculaVenta(numeroUnidades);
		if(this.fechaCaducidad.compareTo(LocalDate.now())<=2)
			calculaVenta-=(calculaVenta*this.descuento/100);
		return calculaVenta;
	}

}
