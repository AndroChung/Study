package myPackage;

public class PersonAddressDemo {

	public static void main(String[] args) {
		PersonAddress person1 = new PersonAddress();
		PersonAddress person2 = new PersonAddress();
		
		// set Person1's attributes
		person1.setName("Taemin", "Lee");
		person1.setEmail("xoals5315@naver.com");
		person1.setPhoneNum("010-4225-7476");
		// set Person2's attributes
		person2.setName("Gildong", "Hong");
		person2.setEmail("muhan123@gachon.ac.kr");
		person2.setPhoneNum("010-1234-5678");
		
		person1.print_att();
		
		System.out.println();
		
		person2.print_att();
		
		
		System.out.print("Are person1 and person2 equal? ");
		if (person1.equals(person2)) {
			System.out.println("YES"); 
		} else {
			System.out.println("NO");
		}

	}

}
