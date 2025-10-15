package com.evaluaciont1.spring_jpa_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.evaluaciont1.spring_jpa_crud.service.OrdenCompraService;

@Controller
@RequestMapping("ordenCompra")
public class OrdenCompraController {
	
	@Autowired
	private OrdenCompraService ordenCompraService;
}
