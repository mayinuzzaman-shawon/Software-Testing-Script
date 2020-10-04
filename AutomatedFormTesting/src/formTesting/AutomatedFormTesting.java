package formTesting;

public class AutomatedFormTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AutomatedFormFillup aff = new AutomatedFormFillup();
		
		aff.invokeBrowser();
		aff.login("mngr288465","Eqemazy");
		aff.addCustomer();
		
		String customerId = aff.getCustomerId();
		
		System.out.println(customerId);
}

}