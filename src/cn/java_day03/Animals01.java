package cn.java_day03;

public class Animals01 {
	private String name ;
	private Integer age;
	

	public Animals01() {	
		
	}
	public Animals01(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void run(){
		System.out.println("�ڱ��ܣ�");
	}
	public void sleep(){
		System.out.println("�����˯����");
	}
	public void eat(){
		System.out.println("����ԵĶ࣡");
	}
	
}
