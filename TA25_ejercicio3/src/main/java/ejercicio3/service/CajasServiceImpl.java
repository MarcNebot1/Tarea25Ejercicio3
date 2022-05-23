package ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejercicio3.dto.Cajas;
import ejercicio3.dao.CajasDAO;



@Service
public class CajasServiceImpl implements CajasService{
	
	
	@Autowired
	CajasDAO CajasDAO;
	
	@Override
	public List<Cajas> listarCajas() {
		
		return CajasDAO.findAll();
	}

	@Override
	public Cajas guardarCajas(Cajas cajas) {
		
		return CajasDAO.save(cajas);
	}

	@Override
	public Cajas CajasXID(int id) {
		
		return CajasDAO.findById(id).get();
	}
	

	@Override
	public Cajas actualizarCajas(Cajas cajas) {
		
		return CajasDAO.save(cajas);
	}

	@Override
	public void eliminarCajas(int id) {
		
		CajasDAO.deleteById(id);
		
	}

}
