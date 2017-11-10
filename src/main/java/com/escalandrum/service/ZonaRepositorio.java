package com.escalandrum.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.escalandrum.domain.Zona;

public interface ZonaRepositorio extends MongoRepository<Zona, String> {
	
	public Optional<Zona> findByNombre(String nombre);
	public List<Zona> findAll();

}