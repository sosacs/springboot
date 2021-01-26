package com.empresa.springboot.app.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.empresa.springboot.app.model.entity.Cliente;
import com.empresa.springboot.app.model.entity.ClienteKpi;
import com.empresa.springboot.app.repository.ClienteRepository;
import com.empresa.springboot.app.util.Util;

@RestController
public class ClienteController {

	private static final Logger logger = LoggerFactory.getLogger(ClienteController.class);
	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping("creacliente")
	public ResponseEntity<Object> creaCliente(@Valid @RequestBody Cliente cliente) {
		logger.info("creaCliente :" + cliente.toString());
		try {
			Cliente crearCliente = clienteRepository.save(cliente);
			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
					.buildAndExpand(crearCliente.getId()).toUri();
			return ResponseEntity.created(location).build();
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error Message: Error al crear el Cliente");
		}
	}

	@GetMapping("/kpideclientes")
	public ClienteKpi kpideclientes() {
		logger.info("kpideclientes :");

		ClienteKpi kpiClientes = new ClienteKpi();
		List<Cliente> listaClientes = (List<Cliente>) clienteRepository.findAll();

		kpiClientes.setPromedioEdad(Util.calcularPromedio(Util.obtenerListaEdad(listaClientes)));
		kpiClientes.setDesviacionEstandar(Util.calcularDesviacionEstandar(Util.obtenerListaEdad(listaClientes)));

		return kpiClientes;
	}

	@GetMapping(value = "/listClientes")
	public List<Cliente> listClientes() {
		logger.info("listClientes :");
		List<Cliente> clientes = (List<Cliente>) clienteRepository.findAll();
		for (Cliente cliente : clientes) {
			cliente.setFechaProbableDeMuerte(
					Util.calcularFechaDeMuerte(cliente.getEdad(), cliente.getFechaNacimiento()));
		}

		return clientes;
	}

}
