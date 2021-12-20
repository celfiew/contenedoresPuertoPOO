package com.company;

public class Test {

    public static void main(String[] args) throws ExceptionCarga {
	// write your code here
        Barco barco = new Barco();

            barco.agregarCarga(FactoryCarga.ID_TV_32_LCD);
            barco.agregarCarga(FactoryCarga.ID_CAJA_MEDICAMENTOS);
            barco.agregarCarga(FactoryCarga.ID_CONTENEDOR);
            barco.mostrar();
    }
}
