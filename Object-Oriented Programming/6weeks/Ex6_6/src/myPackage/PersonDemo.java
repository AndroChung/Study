package myPackage;

public class PersonDemo {

	public static void main(String[] args) {
		Person me = new Person();
		Person sister = new Person("Sumin Lee", 29);
		Person stranger = new Person();
		Person toddler = Person.createToddler();
		Person preschooler = Person.createPreschooler();
		Person adolescent = Person.createAdolescent();
		Person teenager = Person.createTeenager();
		Person adult = Person.createAdult();
		
		me.setName("Taemin", "Lee");
		me.setAge(25);
		stranger.setPerson("A stranger", 50);
		
		// test general object by using new operator
		System.out.println("My name is " + me.getName()
						+ "\nI'm " + me.getAge() + " years old");
		System.out.println("My sister name is " + sister.getName()
						+ "\nMy sister is " + sister.getAge() + " years old");
		System.out.println("I dont know that " + stranger.getName()
						+ "\nI'm guessing he is about " + stranger.getAge()
						+ " years old");
		
		// test static method that create special instance
		System.out.println("createToddler() :"
						+ "name = " + toddler.getName() + ", age = " + toddler.getAge());	
		System.out.println("createPreschooler() :"
				+ "name = " + preschooler.getName() + ", age = " + preschooler.getAge());
		System.out.println("createAdolescent() :"
				+ "name = " + adolescent.getName() + ", age = " + adolescent.getAge());
		System.out.println("createTeenager() :"
				+ "name = " + teenager.getName() + ", age = " + teenager.getAge());
		System.out.println("createAdult() :"
				+ "name = " + adult.getName() + ", age = " + adult.getAge());
	}

}
