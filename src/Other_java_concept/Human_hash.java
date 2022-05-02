package Other_java_concept;

public class Human_hash {
	
	public int adhaar_No;
	public String name ;
	public Human_hash(int adhaar_No, String name) {
		super();
		this.adhaar_No = adhaar_No;
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return adhaar_No;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//user1.equals(user1)
		if(this==obj)
		{
			return true;
		}
		
		//user1.equals(null)
		if(obj==null)
		{
			return false;
		}
		
		//user1.equals(wr1)
		if(this.getClass()!=obj.getClass())
		{
			return false;
		}
		
		Human_hash another_Human=(Human_hash)obj;
		//user1.equals(user2)
		if(this.adhaar_No!=another_Human.adhaar_No)
		{
			return false;
		}
		
		//user1.equals(user2)
		if(!this.name.equals(another_Human.name))
		{
			return false;
		}
		
		if(this.name==null)
		{
			if(another_Human.name!=null)
			{
				return false;
			}
		}
		return true;
		
	}
	

}
