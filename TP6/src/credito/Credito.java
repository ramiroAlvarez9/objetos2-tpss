package credito;

import cliente.*;

public abstract class Credito {
	private Cliente clienteSolicitante;
	private double montoSolicitado;
	private int plazoDeMeses;
	private double cuotaMensual;
	
	
	public Cliente getClienteSolicitante() {
		return this.clienteSolicitante;
	}
	public double getMontoSolicitado() {
		return this.montoSolicitado;
	}
	public double getPlazoDeMeses() {
		return this.plazoDeMeses;
	}
	public double getCuotaMensual() {
		return this.cuotaMensual;
	}
	abstract boolean cumpleRequisitos();
}
