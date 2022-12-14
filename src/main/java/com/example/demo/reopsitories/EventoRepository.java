package com.example.demo.reopsitories;

import com.example.demo.models.EventoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<EventoModel, Long> {

}

