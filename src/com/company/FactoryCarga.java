package com.company;

public class FactoryCarga {


    private static FactoryCarga instance;

    public static final String ID_TV_32_LCD = "TV 32' LCD";
    public static final String ID_CAJA_MEDICAMENTOS = "caja de medicamentos";
    public static final String ID_CONTENEDOR = "contenedor";

    private FactoryCarga(){

    }
    public static FactoryCarga getInstance(){
        if (instance == null){
            instance = new FactoryCarga();
        }
        return instance;
    }

    public Carga generarCarga(String idProducto) throws ExceptionCarga {
        switch (idProducto){
            case ID_TV_32_LCD:
                return new Simple("TV 32' LCD","SLW-123",3);
            case ID_CAJA_MEDICAMENTOS:
                return new Simple("caja de medicamentos","FST-456",2);
            case ID_CONTENEDOR:
                Contenedor contenedor = new Contenedor("contenedor");
                contenedor.agregarCarga(generarCarga(ID_TV_32_LCD));
                contenedor.agregarCarga(generarCarga(ID_CAJA_MEDICAMENTOS));
                return contenedor;
            default:
                throw new ExceptionCarga("Este producto no existe");
        }
    }

}
