package my.pack;

import java.math.BigInteger;

public class Customer {
	private String firstName;
	private String lastName;
	private String patronymicName;
	private String adress;
	private BigInteger creditCardNumber;
	private BigInteger bankAccountNumber;
	private long id;
	private static long lastId = 0;
	
	public Customer(String firstName, String lastName, String patronymicName, String adress,
			BigInteger creditCardNumber, BigInteger bankAccountNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.patronymicName = patronymicName;
		this.adress = adress;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
		this.id = ++lastId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPatronymicName() {
		return patronymicName;
	}

	public void setPatronymicName(String patronymicName) {
		this.patronymicName = patronymicName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public BigInteger getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(BigInteger creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public BigInteger getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(BigInteger bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", patronymicName=" + patronymicName
				+ ", adress=" + adress + ", creditCardNumber=" + creditCardNumber + ", bankAccountNumber="
				+ bankAccountNumber + ", id=" + id + "]";
	}

}
