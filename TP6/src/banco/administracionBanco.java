package banco;
import cliente.*;
import credito.Credito;

public interface administracionBanco {

	
	public void asociarCliente(Cliente cliente);
	public void recibirSolicitudDeCredito(Credito credito);
}
