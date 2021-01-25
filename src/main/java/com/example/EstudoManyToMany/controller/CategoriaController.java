package com.example.EstudoManyToMany.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EstudoManyToMany.model.Categoria;
import com.example.EstudoManyToMany.respository.CategoriaRepository;

@RestController
@RequestMapping("categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> listaCadastros() {
		return categoriaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Categoria> listaUmCadastro(@PathVariable Integer id) { 
		return categoriaRepository.findById(id);
	}

}
