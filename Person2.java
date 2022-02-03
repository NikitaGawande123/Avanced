package AdvancedLevelMethodReferenceStaticRfrncMtd;

public class Person2 implements Comparable{
	
	private String name;
	private int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Person{" +
	"name ='" + name + '\'' +
	"age = " + age + 
	'}';
	

}

	@Override
	public int compareTo(Object o) {
		Person2 per = (Person2) o;
		return this.getAge().compareTo(Person2.getAge());
	}


}
