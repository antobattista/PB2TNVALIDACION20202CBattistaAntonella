package battista.antonella34999092;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion {

	private String patente;
	private List<Producto> listaProductos;

	public Camion(String patente) {

		this.patente = patente;

		this.listaProductos = new ArrayList<Producto>();
	}

	public Boolean cargarProducto(Producto producto) {

		if (!listaProductos.contains(producto)) {

			listaProductos.add(producto);
		}

		return null;

	}

	/*public Producto descargarProducto(Integer idProducto) {

		Producto miProducto = listaProductos.get(idProducto);

		if (miProducto != null) {

			listaProductos.remove(miProducto);

			return miProducto;

		} else {

			//throw new ProductoInexistenteException("No existe el producto");
		}
	}*/

	public String getPatente() {

		return patente;
	}

	public void setPatente(String patente) {

		this.patente = patente;
	}

	public List<Producto> getListaProductos() {

		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {

		this.listaProductos = listaProductos;
	}

}
