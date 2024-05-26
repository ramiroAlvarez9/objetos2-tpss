package repromp3;

public class ModoPausa implements PlayerState {
	Mp3 mp3;
	Song song;

	public ModoPausa(Song song, Mp3 mp3) {
		this.song = song;
		this.mp3 = mp3;
	}

	public void play() {
		System.out.println("Error");
	}

	public void pause() {
		this.song.play();
	}

	@Override
	public void stop() {
		PlayerState modoSeleccion = new ModoSeleccion(song, mp3);

		song.stop();

		mp3.setState(modoSeleccion );
	}

}
