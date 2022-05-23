package ejercicio3.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejercicio3.dao.AlmacenDAO;
import ejercicio3.dto.Almacen;



@Service
public class AlamcenServiceImpl implements AlmacenService{
	
	
	@Autowired
	AlmacenDAO AlmacenDAO;
	
	@Override
	public List<Almacen> listarAlmacen() {
		
		return AlmacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		
		return AlmacenDAO.save(almacen);
	}

	@Override
	public Almacen AlmacenXID(Long id) {
		
		return AlmacenDAO.findById(id).get();
	}
	

	@Override
	public Almacen actualizarAlmacen(Almacen cliente) {
		
		return AlmacenDAO.save(cliente);
	}

	@Override
	public void eliminarAlmacen(Long id) {
		
		AlmacenDAO.deleteById(id);
		
	}

}
