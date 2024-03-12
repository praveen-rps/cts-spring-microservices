package springcoreexamples.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("adr1")
@Scope("prototype")
public class Address {
	
	int dno;
	String street;
	String city;
	public Address() {
		dno=1001;
		street="koramangala";
		city="bangalore";
	}
	
	public Address(int dno, String street, String city) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
	}

	

	public void setDno(int dno) {
		this.dno = dno;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getDno() {
		return dno;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	

	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + "]";
	}
	

}
