package logica;

public class hombre extends TMB {

    public hombre(double peso, double altura, int edad) {
        super(peso, altura, edad);
    }

    @Override
    public double calculo() {
        if (getPeso() >= 60 && getPeso() <= 110 && getAltura() >= 160 && getAltura() <= 195 &&
            getEdad() > 15) {
        	return 88.362 + (13.397 * getPeso()) + (4.799 * getAltura()) - (5.677 * getEdad());}
        return 0;
    }
}