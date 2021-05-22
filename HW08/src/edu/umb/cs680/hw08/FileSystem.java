package edu.umb.cs680.hw08;
import java.util.LinkedList;
public class FileSystem {
	private static FileSystem instance = null;
	private LinkedList<Directory> rtDirectory = new LinkedList<Directory>();

	public static FileSystem getFileSystem() {
		if (instance == null)
			instance = new FileSystem();
		return instance;
	}

	public LinkedList<Directory> getRootDirs() {
		return this.rtDirectory;
	}

	public void addRootDir(Directory directory) {
		rtDirectory.add(directory);
	}
}
