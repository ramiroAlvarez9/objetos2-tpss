package credito;
import cliente.*;

public class CreditoPersonal extends Credito{
	
	public CreditoPersonal(Cliente cliente, double montoSolicitado, int plazoDeMeses) {
		this.clienteSolicitante = cliente;
		this.montoSolicitado    = montoSolicitado;
		this.plazoDeMeses       = plazoDeMeses;
		
	}
	
	@Override
	public boolean cumpleRequisitos() {
		return this.clienteSolicitante.sueldoNetoMensual() > 15000;
	} 
	
	public double getMontoSolicitado() {
		return this.montoSolicitado;
	}




}
