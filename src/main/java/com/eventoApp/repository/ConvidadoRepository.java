package com.eventoApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoApp.models.Convidado;
import com.eventoApp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{

	Iterable<Convidado> findByEvento(Evento evento);
	
	Convidado findByRg(String rg);
}
