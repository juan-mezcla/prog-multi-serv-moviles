package defaultt;
import java.util.ArrayList;
import java.util.List;

public class InventarioApp {
List<Producto> inventario=new ArrayList<>();

public InventarioApp(List<Producto> inventario) {
	this.inventario = inventario;
}

public void mostrar() {
	for(Producto prod:inventario) {
		prod.mostrarDatosProducto();
	}
}


}
