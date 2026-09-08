package presentacion;

import logica.hombre;
import logica.mujer;

public class principal {
    public static void main(String[] args) {
        hombre hombre = new hombre(84, 165, 30);
        mujer mujer = new mujer(77, 175, 34);
        System.out.println("TMB hombre:" + hombre.calculo());
        System.out.println("TMB mujer:" + mujer.calculo());
    }
}          