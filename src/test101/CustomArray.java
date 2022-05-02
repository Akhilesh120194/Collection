package test101;

import java.util.ArrayList;

public class CustomArray extends ArrayList {
	
	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		if(this.contains(e))
		{
			return true ;
		}
		else
		{
		return super.add(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1=new CustomArray();
		list1.add(1);
		list1.add(1);
		list1.add(2);
		
		System.out.println(list1);

	}

}


