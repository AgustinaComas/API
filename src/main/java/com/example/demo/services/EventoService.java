package com.example.demo.services;

import com.example.demo.models.EventoModel;
import com.example.demo.reopsitories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EventoService {
    @Autowired
    EventoRepository eventoRepository;

    public ArrayList<EventoModel> obtenerEventos(){
        return (ArrayList<EventoModel>) eventoRepository.findAll();
    }

    public EventoModel guardarEvento(EventoModel evento){
        return eventoRepository.save(evento);
    }

    public Optional<EventoModel> obtenerPorId(Long id){
        return eventoRepository.findById(id);
    }
}
