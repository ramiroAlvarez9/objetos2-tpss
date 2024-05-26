package videojuego;

public class JuegoParaUnJugador implements MaquinaState{
	Maquina maquina;
	public JuegoParaUnJugador(Maquina maquina) {
		this.maquina = maquina;
	}
	
	@Override
	public void iniciarVideoJuego() {
		if(maquina.getCantFichas() > 1) {
			maquina.setState(new JuegoParaDosJugadores(maquina));
			maquina.IniciarJuego();
		}
		else {
			Juego juego = maquina.getJuego();
			juego.play();
		}
		
	}

}
