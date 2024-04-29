package credito;

import cliente.Cliente;

public class CreditoHipotecario extends Credito {
	
	
	public CreditoHipotecario(Cliente cliente, double montoSolicitado, int plazoDeMeses) {
		this.clienteSolicitante = cliente;
		this.montoSolicitado    = montoSolicitado;
		this.plazoDeMeses       = plazoDeMeses;
		
	}
	
	@Override
	boolean cumpleRequisitos() {
		
		return true;
	} 
	
}
