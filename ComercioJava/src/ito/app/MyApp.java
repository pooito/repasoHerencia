package ito.app;

import ito.clases.Producto;
import ito.clases.Abarrote;
import ito.clases.Pedecedero;
import java.time.LocalDate;

public class MyApp {

	static void run() {
		Producto p= new Producto("Shampoo",25.5f,400);
		System.out.println(p);
		System.out.println(p.calculaVenta(5));
		Abarrote a= new Abarrote("Frijol",30,200,5,8.5f);
		System.out.println(a);
		System.out.println(a.calculaVenta(10));
		Pedecedero d= new Pedecedero("Queso",40,100,LocalDate.of(2021, 4, 19),15);
		System.out.println(d);
		System.out.println(d.calculaVenta(5));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        run();
	}
}
