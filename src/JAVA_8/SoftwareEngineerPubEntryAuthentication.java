package JAVA_8;

import java.util.function.Predicate;

class SoftwareEngineerPubEntry {

	public String name;
	public int age;
	public boolean isHavingGF;

	public SoftwareEngineerPubEntry(String name, int age, boolean isHavingGF) {
		super();
		this.name = name;
		this.age = age;
		this.isHavingGF = isHavingGF;
	}

	@Override
	public String toString() {
		return "SoftwareEngineerPubEntry [name=" + name + ", age=" + age + ", isHavingGF=" + isHavingGF + "]";
	}

}

public class SoftwareEngineerPubEntryAuthentication {

	public static void main(String[] args) {

		SoftwareEngineerPubEntry[] list={new SoftwareEngineerPubEntry("Akhilesh", 29, true),
				new SoftwareEngineerPubEntry("Shivam", 16, true),
				new SoftwareEngineerPubEntry("Raju", 29, false)};
		
		Predicate<SoftwareEngineerPubEntry> p1=s->s.age>=18 && s.isHavingGF==true;
		
		for(SoftwareEngineerPubEntry engneers:list)
		{
			if(p1.test(engneers))
				System.out.println(engneers);
		}
	}
	}
