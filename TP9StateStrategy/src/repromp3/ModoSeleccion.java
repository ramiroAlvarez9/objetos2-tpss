package repromp3;

public class ModoSeleccion implements PlayerState {
	
	Mp3 mp3;
	Song song;
	
	public ModoSeleccion(Song song, Mp3 mp3) {
		this.song = song;
		this.mp3  = mp3;
	}
	
	public void play() {
		ModoPlay modoPlay = new ModoPlay(song, mp3);
		
		this.song.play();
		
		mp3.setState(modoPlay);
	}

	@Override
	public void pause() {
		System.out.println("Error");
		
	}

	@Override
	public void stop() {
		System.out.println("Error");
		
	}
	
	
	
}
