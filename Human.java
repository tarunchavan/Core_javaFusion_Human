package Core_Java_Fusion;

public class Human {

	String firstName;
	String middleName;
	String lastName;
	int noOfLegs;
	int noOfHands;
	int age;

	public Human(String firstName, String middleName, String lastName, int noOfLegs, int noOfHands, int age) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
//		this.noOfLegs = noOfLegs;
//		this.noOfHands = noOfHands;
//		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", noOfLegs="
				+ noOfLegs + ", noOfHands=" + noOfHands + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		Human human = new Human("Rahul", "Manish", "Patil", 2, 2, 28);
		System.out.println(human.toString());
		
//		Human human2 = new Human("John", "Alex", "Mark");
//		System.out.println(human2.toString());
		
	}

}
