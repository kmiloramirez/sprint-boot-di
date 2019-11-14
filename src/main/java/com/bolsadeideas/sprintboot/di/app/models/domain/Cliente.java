package com.bolsadeideas.sprintboot.di.app.models.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cliente {

	@Value("${cliente.nombre")
	private String nombre;
	@Value("${cliente.nombre")
	private String apellid;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellid() {
		return apellid;
	}

	public void setApellid(String apellid) {
		this.apellid = apellid;
	}

}
