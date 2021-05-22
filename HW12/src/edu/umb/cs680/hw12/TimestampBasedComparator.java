package edu.umb.cs680.hw12;

import java.util.Comparator;

public class TimestampBasedComparator implements Comparator<ApfsElement> {

	@Override
	public int compare(ApfsElement o1, ApfsElement o2) {
	
		 return o2.getLastModified().compareTo(o1.getLastModified());
	}

}
