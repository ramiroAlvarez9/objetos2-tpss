package videojuego;

public class Maquina {
	
	MaquinaState state;
	int fichas;
	Juego juego;

	public Maquina(int cantFichas) {
		this.fichas = cantFichas;
	}
	public void setState(MaquinaState state) {
		this.state = state;
	}
	public MaquinaState getState() {
		return state;
	}
	public int getCantFichas() {
		return fichas;
	}
	public void IniciarJuego() {
		state.iniciarVideoJuego();
	}
	public Juego getJuego() {
		return this.juego;
	}
	

}

