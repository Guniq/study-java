package practice;

import model.Person;

public class Package_p {
	
	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = new Person("홍길동", 20);
		
		System.out.println(person); // Person [name=null, age=0]
		System.out.println(person2); // Person [name=홍길동, age=20]
	}
}
