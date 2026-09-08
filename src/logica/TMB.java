package logica;
public abstract class TMB {
	private double peso;
	private double altura;
	private int edad;
	
	public TMB(double peso, double altura,int edad)
	{
		this.peso=peso;
		this.altura=altura;
		this.edad=edad;
	}
	public double getPeso()
	{
		return this.peso;
	}
	public double getAltura()
	{
		return this.altura;
	}
	public int getEdad() {
		return this.edad;
	}
	public abstract double calculo(); 
}  