package JAVA_8;

interface inter_1

{
	public void m1();
}

public class AnonymousInnerClasswithInterfaceLambda {

	int x = 888;

	public void m2() {
		inter_1 i1 = () -> {
			int x = 999;

			System.out.println(this.x);

		};
		i1.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnonymousInnerClasswithInterfaceLambda t = new AnonymousInnerClasswithInterfaceLambda();
		t.m2();

	}

}
