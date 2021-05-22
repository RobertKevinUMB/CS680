package edu.umb.cs680.hw15;

import java.time.LocalDateTime;

public class APFS extends FileSystem {

	private static APFS instance = null;
	private ApfsDirectory rt;

	public static APFS getAPFSFileSystem() {
		if (instance == null)
			instance = new APFS();
		return instance;
	}

	protected FSElement createDefaultRoot() {
		LocalDateTime localTime = LocalDateTime.now();
		rt = new ApfsDirectory(null, "root", 0, localTime, "ApfsFile", localTime);
		return rt;
	}
	public ApfsDirectory getRtDir() {
		return rt;
	}

}
