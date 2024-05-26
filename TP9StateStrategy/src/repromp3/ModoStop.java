package repromp3;

public class ModoStop implements PlayerState{
	Mp3 mp3;
	Song song;

	public ModoStop(Song song, Mp3 mp3) {
		this.song = song;
		this.mp3  = mp3;
	}

	public void play() {
		System.out.println("Error");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
}
