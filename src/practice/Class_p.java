package practice;


public class Class_p {
	
	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = new Person("홍길동", 20);
		
		System.out.println(person); // Person [name=null, age=0]
		System.out.println(person2); // Person [name=홍길동, age=20]
	}
}

class Person {
	private String name;
	private int age;
	
	Person() {}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
