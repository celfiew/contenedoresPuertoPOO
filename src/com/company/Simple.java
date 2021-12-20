package com.company;

public class Simple extends Carga {

    public static final double CRECIMIENTO_DECRECIMIENTO_PESO = 0.1;


    private double peso;
    private String codigo;

    public Simple(String nombre, String codigo, double peso) {
        super(nombre);
        this.peso = peso;
        this.codigo = codigo;
    }

    @Override
    public double calcularPeso() {
        if (this.codigo.equals("SLW-123")) {
            return this.peso * (1 + CRECIMIENTO_DECRECIMIENTO_PESO);
        } else {
            return this.peso * (1 - CRECIMIENTO_DECRECIMIENTO_PESO);
        }
    }
}
