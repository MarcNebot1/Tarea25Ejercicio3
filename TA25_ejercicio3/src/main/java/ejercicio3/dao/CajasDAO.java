package ejercicio3.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import ejercicio3.dto.Cajas;


	public interface CajasDAO extends  JpaRepository<Cajas, Integer> {


	}