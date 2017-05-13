package jsonExamples;

import java.util.Arrays;

public class StudentModified {
	String firstName;
	String lastName;
	int rollNo;
	String address;
	int[] marks;
	
	
	public StudentModified() {
		super();
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
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentModified [firstName=" + firstName + ", lastName=" + lastName + ", rollNo=" + rollNo
				+ ", address=" + address + ", marks=" + Arrays.toString(marks) + "]";
	}
	

}
