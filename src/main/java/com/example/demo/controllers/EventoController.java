
package com.example.demo.controllers;

import com.example.demo.models.EventoModel;
import com.example.demo.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/evento")
public class EventoController {
    @Autowired
    EventoService eventoService;

    @GetMapping()
    public ArrayList<EventoModel> obtenerEventos(){
        return eventoService.obtenerEventos();
    }

    @PostMapping()
    public EventoModel guardarEvento(@RequestBody EventoModel evento){
        return this.eventoService.guardarEvento(evento);
    }

    @GetMapping( path = "/{id}")
    public Optional<EventoModel> obtenerEventoPorId(@PathVariable("id") Long id) {
        return this.eventoService.obtenerPorId(id);
    }
}


