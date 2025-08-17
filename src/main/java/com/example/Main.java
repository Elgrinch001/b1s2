package com.example;

public class Main {
    public static void main(String[] args) {

        Estadio estadio1 = new Estadio("Estadio Metropolitano", "Barranquilla", 46000);
        Estadio estadio2 = new Estadio("Estadio El Campín", "Bogotá", 40000);

        estadio1.mostrarInformacion();
        estadio2.mostrarInformacion();

        JugadorFutbol jugador1 = new JugadorFutbol("James Rodríguez", 32, "Mediocampista", "São Paulo");
        JugadorFutbol jugador2 = new JugadorFutbol("Radamel Falcao", 37, "Delantero", "Millonarios");
        JugadorFutbol jugador3 = new JugadorFutbol("David Ospina", 35, "Arquero", "Al Nassr");

        jugador1.presentarse();
        jugador2.presentarse();
        jugador3.presentarse();

        System.out.println("Cambio de posición ");
        jugador1.cambiarPosicion("Delantero");
        jugador1.presentarse();
    }
}
