package com.company;

import java.util.ArrayList;
import java.util.List;

public class Barco {

    private List<Carga> cargas;

    public Barco() {
        this.cargas = new ArrayList<>();
    }

    public void agregarCarga(String codigo) throws ExceptionCarga {
        try {
            this.cargas.add(FactoryCarga.getInstance().generarCarga(codigo));
        } catch (ExceptionCarga exception) {
            exception.getMessage();
        }
    }

        public void mostrar () throws ExceptionCarga {
            for (Carga carga : cargas) {
                System.out.println(carga.getNombre() + " " + carga.calcularPeso());
            }

        }
}
