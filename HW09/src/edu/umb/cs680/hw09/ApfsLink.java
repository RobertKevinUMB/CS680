package edu.umb.cs680.hw09;
import java.time.LocalDateTime;

public class ApfsLink extends ApfsElement{
	private ApfsElement target;
	
	
	public ApfsLink(ApfsDirectory parent, String name, int size, LocalDateTime creationTime, String ownerName,
			LocalDateTime lastModified, ApfsElement target) {
		super(parent, name, size, creationTime, ownerName, lastModified);
		
		this.target = target;
		parent.appendChild(this);
	}

	
	

	public ApfsElement getTarget() {
		return target;
	}

	public void setTarget(ApfsElement target) {
		this.target = target;
	}

	@Override
	public boolean isDirectory() {
		
		return false;
	}

	
}
