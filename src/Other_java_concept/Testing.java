package Other_java_concept;

public class Testing {
	 int y;
	 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		//	System.out.println(y);
		 Hello t=new Hello();
		System.out.println(t.x);

		}
	
	
}

class Hello extends Testing
{
	
	 int x;

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}
		 
	
	
}
