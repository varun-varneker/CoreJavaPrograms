package demo;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.setCustomerID(69);
		cust1.setCustomerName("Varun");
		cust1.setCustomerCity("Chennai");
		System.out.println(cust1);
		
		Customer cust2 = new Customer();
		cust2.setCustomerID(79);
		cust2.setCustomerName("Mosina");
		cust2.setCustomerCity("chennai");
		System.out.println(cust2);
	}
}
