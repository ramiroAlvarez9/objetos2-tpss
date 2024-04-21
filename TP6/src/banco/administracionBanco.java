package banco;
import cliente.*;
import credito.*;


public interface administracionBanco {

	
	public void asociarCliente(Cliente cliente);
	public void recibirSolicitudDeCredito(Credito credito);
}
