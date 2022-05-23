package ejercicio3.service;

import java.util.List;



import ejercicio3.dto.Almacen;

public interface AlmacenService {

	//Metodos del CRUD
	public List<Almacen> listarAlmacen(); 
	
	public Almacen guardarAlmacen(Almacen almacen);	
	
	public Almacen AlmacenXID(Long id); 
		
	public Almacen actualizarAlmacen(Almacen almacen); 
	
	public void eliminarAlmacen(Long id);
}

