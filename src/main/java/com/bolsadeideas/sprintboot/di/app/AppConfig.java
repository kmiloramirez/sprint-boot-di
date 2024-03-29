package com.bolsadeideas.sprintboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.sprintboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.sprintboot.di.app.models.domain.Producto;
import com.bolsadeideas.sprintboot.di.app.models.service.IServicio;
import com.bolsadeideas.sprintboot.di.app.models.service.MiServicio;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	@Primary
	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioCOmplejo() {
		return new MiServicio();
	}

	@Primary
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems() {

		Producto producto1 = new Producto("camara1", 100);
		Producto producto2 = new Producto("camara2", 200);

		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);

		return Arrays.asList(linea1, linea2);
	}
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina() {

		Producto producto1 = new Producto("monitor", 250);
		Producto producto2 = new Producto("computador", 500);
		Producto producto3 = new Producto("impresora", 80);
		Producto producto4 = new Producto("escritorio", 300);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		ItemFactura linea3 = new ItemFactura(producto3, 1);
		ItemFactura linea4 = new ItemFactura(producto4, 1);

		return Arrays.asList(linea1, linea2,linea3,linea4);
	}

}
