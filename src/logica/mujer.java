package logica;

public class mujer extends TMB {
    public mujer(double peso, double altura, int edad) {
        super(peso, altura, edad);
    } 
    @Override
    public double calculo() {
        if (getPeso() >= 40 && getPeso() <= 80 && getAltura() >= 140 && getAltura() <= 180 &&getEdad() > 15) {
            return 447.593+ (9.247 * getPeso())+ (3.098 * getAltura())- (4.33 * getEdad());
        }
        return 0;  
    }
}