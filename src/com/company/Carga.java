package com.company;

public abstract class Carga {
    private String nombre;


    public Carga(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public abstract double calcularPeso() throws ExceptionCarga;

}
