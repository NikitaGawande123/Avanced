package AdvancedLevelMethodReferenceInstanceObj;

public class Person1 {
	
	private String name;
	private int age;
	
	public Person1(String name, int age) {
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


}
