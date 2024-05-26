package fileSystem;

public class File implements FileSystem{
	
	String name;
	
	
	public File(String name) {
		this.name = name;
		
	}
	
	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printStructure() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FileSystem lastModified() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileSystem oldestElement() {
		// TODO Auto-generated method stub
		return null;
	}

}
