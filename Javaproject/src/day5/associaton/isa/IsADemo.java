package day5.associaton.isa;

import day5.associaton.hasa.Address;

public class IsADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Address address;

		public Person(String name, Address address) {
			this.name = name;
			this.address = address;
		}

		// Getter and setter methods

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public void displayInfo() {
			System.out.println("Name: " + name);
			System.out.println("Address: " + address.getStreet() + ", " + address.getCity() + ", " + address.getState()
					+ " " + address.getPostalCode());
		}
	
	}

}
