package ejercicio3.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ejercicio3.dto.Almacen;
import ejercicio3.service.AlamcenServiceImpl;



@RestController
@RequestMapping("/api")
public class AlmacenController {
	
	@Autowired
	AlamcenServiceImpl alamcenServideImpl;
	
	@GetMapping("/almacen")
	public List<Almacen> listarCajas(){
		return alamcenServideImpl.listarAlmacen();
	}
	
	
	
	@PostMapping("/almacen")
	public Almacen salvarAlmacen(@RequestBody Almacen almacen) {
		
		return alamcenServideImpl.guardarAlmacen(almacen);
	}
	
	
	@GetMapping("/almacen/{id}")
	public Almacen almacenXID(@PathVariable(name="id") Long id) {
		
		Almacen almacen_xid= new Almacen();
		
		almacen_xid=alamcenServideImpl.AlmacenXID(id);
		
		System.out.println("Almacen XID: "+almacen_xid);
		
		return almacen_xid;
	}
	
	@PutMapping("/almacen/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name="id")long id,@RequestBody Almacen almacen) {
		
		Almacen almacen_seleccionado= new Almacen();
		Almacen almacen_actualizado= new  Almacen();
		
		almacen_seleccionado= alamcenServideImpl.AlmacenXID(id);
		
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado = alamcenServideImpl.actualizarAlmacen(almacen_actualizado);
		
		System.out.println("El cliente actualizado es: "+ almacen_actualizado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacen/{id}")
	public void eliminarAlmacen(@PathVariable(name="id")long id) {
		alamcenServideImpl.eliminarAlmacen(id);
	}
	
	
}
