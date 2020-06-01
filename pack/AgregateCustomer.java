package my.pack;

import java.math.BigInteger;
import java.util.*;

public class AgregateCustomer{
	List<Customer> customers=new ArrayList<>();

	public AgregateCustomer() {
	}

	public AgregateCustomer(List<Customer> customers) {
		this.customers = customers;
	}

	public void setCustomer(Customer customer) {
		this.customers.add(customer);
	}

	public void getCreditCardNumberInFrame(BigInteger startPosition, BigInteger endPosition) {
		System.out.println("Print list of customers with CreditCardNumber in frame:");
		for (Customer customer : this.customers) {
			if (customer.getCreditCardNumber().compareTo(startPosition) >= 0
					&& customer.getCreditCardNumber().compareTo(endPosition) <= 0) {
				System.out.println(customer.toString());
			}
		}
	}

	public void defineListAlphabetOrder() {
		Collections.sort(this.customers, new Comparator<Customer>() {
			@Override
			public int compare(Customer c1, Customer c2) {
				int lastNameCompared = c1.getLastName().compareToIgnoreCase(c2.getLastName());
				if (lastNameCompared != 0) {
					return lastNameCompared;
				} else {
					int firstNameCompared = c1.getFirstName().compareToIgnoreCase(c2.getFirstName());
					if (firstNameCompared != 0) {
						return firstNameCompared;
					} else {
						return c1.getPatronymicName().compareToIgnoreCase(c2.getPatronymicName());
					}
				}
			}
		});
		System.out.println("Print sorted list of customers:");
		for (Customer customer : this.customers) {
			System.out.println(customer.toString());
		}
	}

	public static void main(String[] args) {
		Customer first = new Customer("Petr","Ivanov","Vasilevich","Nizhnii_Novgorod",BigInteger.valueOf(235323452L),BigInteger.valueOf(6786756756756756756L));
		Customer second = new Customer("Ivan","Patuko","Gerasimovich","Moskva",BigInteger.valueOf(235334552L),BigInteger.valueOf(6786764564566L));
		Customer third = new Customer("Lisa","Lapa","Anisimovna","Minsk",BigInteger.valueOf(111323452L),BigInteger.valueOf(678675677567588886L));
		
		AgregateCustomer listCustomers=new AgregateCustomer();
		listCustomers.setCustomer(first);
		listCustomers.setCustomer(second);
		listCustomers.setCustomer(third);
		
		listCustomers.defineListAlphabetOrder();
		listCustomers.getCreditCardNumberInFrame(BigInteger.valueOf(235323452L), BigInteger.valueOf(678675677567588886L));
	}

}
