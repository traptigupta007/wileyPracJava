package assignment;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()==o2.getSalary())
			return 0;
		else if(o1.getSalary()>o2.getSalary())
			return 1;
		return -1;
	}

	

}
