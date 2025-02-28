package br.dev.thiago.airports.controllers;

import br.dev.thiago.airports.entities.Airport;
import br.dev.thiago.airports.service.AirportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirportController {
    
    @Autowired
    private AirportService airportService;
    
    /**
     * Endpoint /airports/airport
     * Retorna TODOS os aeroportos da base de dados.
     * @return
     */
    @GetMapping("/airport")
    public List<Airport> findAll() {
        List<Airport> result = airportService.findAll();
        return result;
    }
    
}
