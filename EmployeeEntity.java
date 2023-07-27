package com.springboot.Entity;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int ID;

private String	FirstName;

private String	LastName;

private String	Email;

private long PhoneNumber;

private long	DOJ;

private String Salary;

public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public long getDOJ() {
	return DOJ;
}

public void setDOJ(long dOJ) {
	DOJ = dOJ;
}

public EmployeeEntity() {
	super();
}




}
