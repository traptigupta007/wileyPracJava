package day10;

import java.util.Comparator;

public class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getId()==o2.getId())
			return 0;
		else if(o1.getId()>o2.getId())
			return 1;
		return -1;
	}

	

}
