package exday4;

public class SampleEx401 {
	public static void main(String[] args) {

		CellPhone cp = new CellPhone("gidns@esf.com","020-7361-7362");

		cp.call("018-8261-6382");
		cp.sendMail("gidus@semn.com");

		IPhone phone = (IPhone)cp;
		phone.call("286-3673-3682");

		IEmail email = (IEmail)cp;
		email.sendMail("fhdi@diw.com");


	}

}
