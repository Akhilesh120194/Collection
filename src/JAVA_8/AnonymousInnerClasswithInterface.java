package JAVA_8;

interface inter

{
	public void m1();
}
public class AnonymousInnerClasswithInterface {

	int x=888;
	
	public void m2()
	{
		inter i1=new inter() {
			int x=999;
			@Override
			public void m1() {
				
			
				System.out.println(this.x);
				
			}
		};
		i1.m1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnonymousInnerClasswithInterface t=new AnonymousInnerClasswithInterface();
		t.m2();

	}

}
