package com.example.demo.controllers;

import com.example.demo.entities.Domicilio;
import com.example.demo.entities.Libro;
import com.example.demo.entities.Localidad;
import com.example.demo.services.DomicilioServiceImpl;
import com.example.demo.services.LibroServiceImpl;
import com.example.demo.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {

}