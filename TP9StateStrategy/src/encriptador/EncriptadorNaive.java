package encriptador;

public class EncriptadorNaive implements Encriptador {

	Encriptador encriptador;

	public void setEncriptador(Encriptador encriptador) {
		this.encriptador = encriptador;
	}

	@Override
	public String encriptar(String texto) {
		return this.encriptador.encriptar(texto);
	}

	@Override
	public String desencriptar(String texto) {
		return this.encriptador.desencriptar(texto);
	}

}
