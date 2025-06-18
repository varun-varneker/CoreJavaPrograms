package demo;

public class Customer {
	
		
		private int CustomerID;
		private String CustomerName;
		private String CustomerCity;
		
		public Customer() {
			System.out.println("Default Contructor");
				
		}
		
		public Customer(String CustomerName, int CustomerID, String CustomerCity) {
			
			this();
			
			System.out.println("Parameterized Constructor");
			this.CustomerName = CustomerName;
			this.CustomerCity = CustomerCity;
			this.CustomerID = CustomerID;
			
		}

		public int getCustomerID() {
			return CustomerID;
		}

		public void setCustomerID(int customerID) {
			CustomerID = customerID;
		}

		public String getCustomerName() {
			return CustomerName;
		}

		public void setCustomerName(String customerName) {
			CustomerName = customerName;
		}

		public String getCustomerCity() {
			return CustomerCity;
		}

		public void setCustomerCity(String customerCity) {
			CustomerCity = customerCity;
		}

		@Override
		public String toString() {
			return "Customer [CustomerID=" + CustomerID + ", CustomerName=" + CustomerName + ", CustomerCity="
					+ CustomerCity + "]";
		}
		
		
	}


