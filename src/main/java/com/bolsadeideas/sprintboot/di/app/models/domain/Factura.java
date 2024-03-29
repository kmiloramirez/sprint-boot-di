package com.bolsadeideas.sprintboot.di.app.models.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Factura implements Serializable {

	private static final long serialVersionUID = 2744489446002784175L;
	@Value("${descripcion.factura}")
	private String descripcion;
	@Autowired
	private Cliente cliente;
	@Autowired
	@Qualifier("itemsFacturaOficina")
	private List<ItemFactura> items ;

	@PostConstruct
	public void inicializar() {
		cliente.setNombre("Rodrigo");
		descripcion = descripcion+" del cliente: "+cliente.getNombre();
	}

	@PreDestroy
	public void destruir() {
		System.out.println("factura destruida: " + descripcion);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

}
