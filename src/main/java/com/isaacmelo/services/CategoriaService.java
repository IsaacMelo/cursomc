package com.isaacmelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isaacmelo.domain.Categoria;
import com.isaacmelo.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	public CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		return repo.findOne(id);
	}
}
