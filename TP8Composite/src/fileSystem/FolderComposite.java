package fileSystem;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileSystem{
	
	List<FileSystem> files = new ArrayList<FileSystem>();
	
	
	public void add(FileSystem file) {
		files.add(file);
	}
	public void delete(FileSystem file) {
		files.remove(file);
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
