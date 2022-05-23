package ejercicio3.service;

import java.util.List;


import ejercicio3.dto.Cajas;

public interface CajasService {

	//Metodos del CRUD
	public List< Cajas> listarCajas(); 
	
	public  Cajas guardarCajas(Cajas cajas);	
	
	public  Cajas  CajasXID(int id); 
	
	public  Cajas actualizarCajas( Cajas cajas); 
	
	public void eliminarCajas(int id);
	
	
}

