package repromp3;

public class ModoPlay implements PlayerState {
	Mp3 mp3;
	Song song;

	public ModoPlay(Song song, Mp3 mp3) {
		this.song = song;
		this.mp3 = mp3;
	}

	public void play() {
		System.out.println("Error");
	}

	@Override
	public void pause() {

		ModoPausa modoPausa = new ModoPausa(song, mp3);
		song.pause();
		mp3.setState(modoPausa);

	}

	@Override
	public void stop() {
		PlayerState modoSeleccion = new ModoSeleccion(song, mp3);

		song.stop();

		mp3.setState(modoSeleccion);

	}

}
