package com.company;

import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Carga{

    public static final double PESO_CONTENEDOR = 100;

    private List<Carga> cargas;

    public Contenedor(String nombre) {
        super(nombre);
        this.cargas = new ArrayList<>();
    }

    public void agregarCarga(Carga carga){
        cargas.add(carga);
    }

    @Override
    public double calcularPeso() throws ExceptionCarga {
        double pesoTotal = 0;
        for (Carga carga: cargas) {
            pesoTotal += carga.calcularPeso();
        }
        return pesoTotal + PESO_CONTENEDOR;
    }
}
