package defaultt;

public class Producto {
String nombre;
double precio;
int stock;
public Producto(String nombre, double precio, int stock) {
	
	this.nombre = nombre;
	this.precio = precio;
	this.stock = stock;
}

public void mostrarDatosProducto() {
	System.out.println("Producto:"+this.nombre+"\nPrecio:"+this.precio+"\nStock:"+this.stock+" unidades");
	System.out.println("Valor total stock:"+valorTotalStock()+" €\n\n");
}

public double valorTotalStock() {
	return this.precio*this.stock;
}
	
	
}
