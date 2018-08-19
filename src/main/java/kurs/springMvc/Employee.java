package kurs.springMvc;

import java.math.BigDecimal;

public class Employee {
private String firstName;
private String lastName;
private BigDecimal salary;



public Employee(String firstName, String lastName, BigDecimal salary) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public BigDecimal getSalary() {
	return salary;
}

}
