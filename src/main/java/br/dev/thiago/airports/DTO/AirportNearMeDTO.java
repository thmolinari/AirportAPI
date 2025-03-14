package br.dev.thiago.airports.DTO;

import br.dev.thiago.airports.projections.AirportNearMeProjection;


public class AirportNearMeDTO {
    
    private long id;
    private String name;
    private String city;
    private String iataCode;
    private double latitude;
    private double longitude;
    private double altitude;
    private double distanciaKM;
    private double distanciaNM;

    public AirportNearMeDTO(AirportNearMeProjection airportProjection) {
        this.id = airportProjection.getId();
        this.name = airportProjection.getName();
        this.city = airportProjection.getCity();
        this.iataCode = airportProjection.getIataCode();
        this.latitude = airportProjection.getLatitude();
        this.longitude = airportProjection.getLongitude();
        this.altitude = airportProjection.getAltitude();
        this.distanciaKM = airportProjection.getDistanciaKM();
        this.distanciaNM = airportProjection.getDistanciaNM();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getIataCode() {
        return iataCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getDistanciaKM() {
        return distanciaKM;
    }

    public double getDistanciaNM() {
        return distanciaNM;
    }
    
    
}
