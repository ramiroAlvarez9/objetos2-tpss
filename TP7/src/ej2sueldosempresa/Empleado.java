package ej2sueldosempresa;

public abstract class Empleado {
    public String nyap;
    public int horasTrabajadas;
    public double sueldoBasico;
    public boolean tieneConyuge;
    public int cantHijos;
    public double sueldo;

    public Empleado(String nyap, int horasTrabajadas, boolean tieneConyuge, int cantHijos) {
        this.nyap = nyap;
        this.horasTrabajadas = horasTrabajadas;
        this.tieneConyuge = tieneConyuge;
        this.cantHijos = cantHijos;
        this.setSueldoBasico();
    }

    	public void setSueldoBasico() { this.sueldoBasico = 0 ;}

        public double descuentosPrevisionales() { return 0.13; }
    
        public double sueldo() { return this.sueldo;}
    
        public abstract  void calcularSueldo();

}