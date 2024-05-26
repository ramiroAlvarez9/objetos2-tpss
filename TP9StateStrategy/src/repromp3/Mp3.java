package repromp3;

public class Mp3 {
	PlayerState state;
	//initial state: modoSeleccion
	public void setState(PlayerState state) {
		this.state = state;
	}
	public PlayerState getState() {
		return state;
	}
	public void play() {
		state.play();
	}
	public void pause() {
		state.pause();
	}
	public void stop() {
		state.stop();
	}
}
	

