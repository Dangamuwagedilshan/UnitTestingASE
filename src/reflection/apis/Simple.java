package reflection.apis;

public class Simple {

	public String firstName = "Adeesha";
	public String lastName = "Dangamuwage";
	public String fullName;
	private int age = 24;

	public Simple() {
	}

	public Simple(String firstName, String lastName, String fullName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.age = age;
	}

	public void fullName() {
		this.fullName = firstName + " " + lastName;
	}

	public void age5YearsBack() {
		this.age -= 5;
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return String.format("(firstName:%s, lastName:%s, Age:%d)", firstName, lastName,age);
	}
}
