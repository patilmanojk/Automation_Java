package Org.Testing.Payloads;

public class PojoSimpleBody {
	public static PojoBodyData getBodyData() {
		PojoBodyData data = new PojoBodyData();
		data.setFirstName("Jenny");
		data.setLastName("Dantas");
		data.setAge("33");
		data.setProfession("Model");
		data.setId("2016");
		
		return data;	
		
	}

}
