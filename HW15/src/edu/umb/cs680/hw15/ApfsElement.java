package edu.umb.cs680.hw15;
import java.time.LocalDateTime;


public abstract class ApfsElement extends FSElement {

	private String oName;
	private LocalDateTime lastModified;
	
	public ApfsElement(ApfsDirectory parent, String name, int size, LocalDateTime creationTime, String ownerName,
			LocalDateTime lastModified) {
		super(parent, name, size, creationTime);
		this.oName = ownerName;
		this.lastModified = lastModified;
	}

	public String getOwnerName() {
		return oName;
	}

	public LocalDateTime getLastModified() {
		return lastModified;
	}
}
