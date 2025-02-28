package br.dev.thiago.airports.repositories;

import br.dev.thiago.airports.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AirportRepository extends JpaRepository<Airport, Long> {
    
}
