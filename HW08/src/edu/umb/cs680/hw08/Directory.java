package edu.umb.cs680.hw08;
import java.time.LocalDateTime;
import java.util.LinkedList;
public class Directory extends FSElement {
	
	private LinkedList<FSElement> children = new LinkedList<FSElement>();
	private LinkedList<File> fileList = new LinkedList<File>();
	private LinkedList<Directory> directoryList = new LinkedList<Directory>();
	private LinkedList<Link> linkList = new LinkedList<Link>();
	
	public Directory(Directory parent, String name, int size, LocalDateTime createdTime) {
		super(parent, name, size, createdTime);
		if (parent != null)
			parent.appendChild(this);
	}
	
	public LinkedList<FSElement> getChildren() {
		return children;
	}
	
	public void appendChild(FSElement children) {
		this.children.add(children);
		children.setParent(this);
	}
	
	public int countChildren() {
		return getChildren().size();
	}
		
	public LinkedList<Directory> getSubDirectories() {
		for (FSElement element : getChildren()) {
			if (element.isDirect())
				directoryList.add((Directory) element);
		}
		return directoryList;
	}
	
	public LinkedList<File> getFiles() {
		for (FSElement element : children) {
			if (element.isFile()) {
				fileList.add((File) element);
			}
		}
		return fileList;
	}

	public int getTotalSize() {
		int totalSize = 0;
		for (FSElement element : getChildren()) {
			if (element.isDirect())
				totalSize += ((Directory) element).getTotalSize();
			else
				totalSize += element.getSize();
		}
		return totalSize;
	}

	public boolean isDirect() {
		return true;
	}
	
	public  boolean isFile() {
		return false;
	}
	
	public boolean isLink() {
		return false;
	}
	
    public LinkedList<Link> getLinks() {
		for (FSElement element : getChildren()) {
			if (element.isLink())
				linkList.add((Link) element);
		}
		return linkList;
	}	
}



