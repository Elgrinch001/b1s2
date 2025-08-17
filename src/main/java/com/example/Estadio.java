package com.example;

public class Estadio {

   String nombre;
   String ciudad;
   int capacidad;

   public Estadio(String nombre, String ciudad, int capacidad) {
      this.nombre = nombre;
      this.ciudad = ciudad;
      this.capacidad = capacidad;
   }

   public void mostrarInformacion() {
      System.out.println("Nombre del estadio: " + this.nombre);
      System.out.println("Ciudad: " + this.ciudad);
      System.out.println("Capacidad: " + this.capacidad + " personas");
      System.out.println("-----------------------------");
   }
}

