package test101;

public class FakeConsumer extends Consumer {
	
	private String fakename;
	
	public String getFakename() {
		return fakename;
	}

	public void setFakename(String fakename) {
		this.fakename = fakename;
	}

	public FakeConsumer(String fakename)
	{
		super(fakename);
		this.fakename=fakename;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return fakename;
	}

}
