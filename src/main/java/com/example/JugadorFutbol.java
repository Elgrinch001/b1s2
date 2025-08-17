package com.example;

public class JugadorFutbol {

   String nombre;
   int edad;
   String posicion;
   String equipo;

   public JugadorFutbol(String nombre, int edad, String posicion, String equipo) {
      this.nombre = nombre;
      this.edad = edad;
      this.posicion = posicion;
      this.equipo = equipo;
   }

   public void presentarse() {
      System.out.println("Jugador: " + this.nombre);
      System.out.println("Edad: " + this.edad);
      System.out.println("Posición: " + this.posicion);
      System.out.println("Equipo: " + this.equipo);

   }

   public void cambiarPosicion(String nuevaPosicion) {
      this.posicion = nuevaPosicion;
      System.out.println(this.nombre + " ahora juega como " + this.posicion);
   }

}
