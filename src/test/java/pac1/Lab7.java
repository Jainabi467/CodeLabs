package pac1;

public class Lab7 {

	String firstName;
	String lastName;
	String gender;
	String mobileNum;

	public String getFisrtName() {
		return firstName;
	}

	public void setFisrtName(String fisrtName) {
		this.firstName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String acceptingPhoneNumber(String num) {
		return num;
	}

	public String display() {
		return "Person [fisrtName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", mobileNum=" + mobileNum
				+ "]";
	}

}
