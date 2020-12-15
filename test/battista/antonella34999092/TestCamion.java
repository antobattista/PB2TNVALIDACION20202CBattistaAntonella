package battista.antonella34999092;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import battista.antonella34999092.Camion;
import battista.antonella34999092.Producto;
import battista.antonella34999092.TiendaCamion;

public class TestCamion {
	

	//opcional
	@Test
	public void queSeAgregueUnProducto() {
	
		Camion camion1 = new Camion("primerCamion");
		Producto producto1 = new Producto(1, 25.0, "primerProducto", 180.0);

		camion1.cargarProducto(producto1);		
		

		assertEquals(1,camion1.getListaProductos().size());
		
	}
	
	//opcional
	@Test
	public void queSeDescargueUnProducto() {
	
	}
	
	//obligatorio
	@Test
	
	public void queDescargueUnProductoInexistenteLanceUnaException() {
	
	
	}
	
}
