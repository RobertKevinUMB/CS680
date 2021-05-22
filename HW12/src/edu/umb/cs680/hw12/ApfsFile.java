package edu.umb.cs680.hw12;
import java.time.LocalDateTime;

public class ApfsFile extends ApfsElement {

	public ApfsFile(ApfsDirectory parent, String name, int size, LocalDateTime createdTime, String ownerName,
			LocalDateTime lastModified) {
		super(parent, name, size, createdTime, ownerName, lastModified);
		
		parent.appendChild(this);
	}

	@Override
	public boolean isDirectory() {
		
		return false;
	}

	@Override
	protected boolean isLink() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
