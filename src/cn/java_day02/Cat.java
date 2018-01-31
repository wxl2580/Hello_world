package cn.java_day02;

public class Cat {

	private String name ;
	private int age;
	private String type;
	private char sex;
	
	
	public Cat() {

	}
	
	public Cat(String name, int age, String type, char sex) {
	
		this.name = name;
		this.age = age;
		this.type = type;
		this.sex = sex;
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
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public void run(){
		System.out.println(name+"ÔÚ×ßÃ¨²½£¡");
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", type=" + type + ", sex=" + sex + "]";
	}
	
	
	
}
