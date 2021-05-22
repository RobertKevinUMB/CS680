package edu.umb.cs680.hw10;

import java.time.LocalDateTime;

public class APFS extends FileSystem {
	

	private static APFS instance = null;

	public static APFS getAPFSFileSystem() {
		if (instance == null)
			instance = new APFS();
		return instance;
	}

	@Override
	protected FSElement createDefaultRoot() {
		
		LocalDateTime localTime = LocalDateTime.of(2020, 06, 12, 0, 0);
		ApfsDirectory rt = new ApfsDirectory(null, "root", 0, localTime, "yash", localTime);
		return rt;
	}

}
