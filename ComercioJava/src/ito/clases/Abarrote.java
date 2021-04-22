/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.clases;

import ito.clases.Producto;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Abarrote.
 * 
 * @author rherrera
 */
public class Abarrote extends Producto {
	

	/**
	 * Description of the property cantidadMayoreo.
	 */
	private int cantidadMayoreo = 0;

	/**
	 * Description of the property descuento.
	 */
	private float descuento = 0F;

	// Start of user code (user defined attributes for Abarrote)

	// End of user code
	public Abarrote(String nombre, float precio, int existencias, int cantidadMayoreo, float descuento) {
		super(nombre, precio, existencias);
		this.cantidadMayoreo = cantidadMayoreo;
		this.descuento = descuento;
	}
	/**
	 * The constructor.
	 */
	public Abarrote() {
		// Start of user code constructor for Abarrote)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Abarrote)

	// End of user code
	/**
	 * Returns cantidadMayoreo.
	 * @return cantidadMayoreo 
	 */
	public int getCantidadMayoreo() {
		return this.cantidadMayoreo;
	}

	/**
	 * Sets a value to attribute cantidadMayoreo. 
	 * @param newCantidadMayoreo 
	 */
	public void setCantidadMayoreo(int newCantidadMayoreo) {
		this.cantidadMayoreo = newCantidadMayoreo;
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
		return "Abarrote [cantidadMayoreo=" + cantidadMayoreo + ", descuento=" + descuento + ", Nombre="
				+ getNombre() + ", Precio=" + getPrecio() + ", Existencias=" + getExistencias() + "]";
	}
	
	@Override
	public float calculaVenta(float numeroUnidades) {
		// TODO Auto-generated method stub
		float calculaVenta=super.calculaVenta(numeroUnidades);
		if(numeroUnidades>=this.cantidadMayoreo)
			calculaVenta-=(calculaVenta*this.descuento/100);
		return calculaVenta;
	}

}
