package test101;

import java.util.Comparator;

public class IntegerComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if((Integer)o1==(Integer)o2)
		{
			return 0;
		}
		else if ((Integer)o1 > (Integer)o2) {
			return +1;
		}
		else 
			return -1;
	}

}
