package ejercicio3.dto;




import java.util.List;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Almacen")//en caso que la tabala sea diferente

public class Almacen {

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "lugar")//no hace falta si se llama igual
	private String lugar;
	@Column(name = "capacidad")//no hace falta si se llama igual
	private int capacidad;
	
	//Constructores
	

	@OneToMany
    @JoinColumn(name="id")
    private List<Cajas> cajas;
	
	
	public Almacen() {
	
	}

	
	public Almacen(Long id, String lugar, int capacidad) {
		//super();
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Cajas")
	public List<Cajas> getArticulo() {
		return cajas;
	}


	@Override
	public String toString() {
		return "Almacen [id=" + id + ", lugar=" + lugar + ", capacidad=" + capacidad + "]";
	}

	
	
}
