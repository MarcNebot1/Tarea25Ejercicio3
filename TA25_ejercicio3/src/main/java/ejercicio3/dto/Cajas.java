package ejercicio3.dto;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Cajas")//en caso que la tabala sea diferente
public class Cajas {

	//Atributos de entidad cliente
	@Id
	private int id;
	@Column(name = "contenido")//no hace falta si se llama igual
	private String contenido;
	@Column(name = "valor")//no hace falta si se llama igual
	private int valor;
	
	
	//Constructores
	
	
	@ManyToOne
    @JoinColumn(name="almacen_id")
    private Almacen almacen_id;
	
	
	public Cajas() {
	
	}


	public Cajas(int id, String contenido, int valor, Almacen almacen_id) {
		//super();
		this.id = id;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen_id = almacen_id;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen_id;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen_id = almacen;
	}

	@Override
	public String toString() {
		return "Cajas [id=" + id + ", contenido=" + contenido + ", valor=" + valor + ", almacen=" + almacen_id + "]";
	}

	
}
