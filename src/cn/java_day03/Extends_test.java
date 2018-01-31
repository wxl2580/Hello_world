package cn.java_day03;

public class Extends_test {
	public static void main(String[] args) {
		Cat ct = new Cat();
		ct.setName("Ã¨");
		System.out.print(ct.getName());
		ct.setAge(12);
		System.out.println(ct.getAge()+"Ëê");
		ct.run();
		ct.sleep(ct.getName());
		ct.eat(ct.getName());
		
		
		
		Dog dg= new Dog();
		dg.setName("¹·");
		dg.setAge(16);
		
		System.out.print(dg.getName());
		System.out.println(dg.getAge()+"Ëê");
		dg.run();
		dg.eat(dg.getName());
		dg.sleep(dg.getName());
	}
}
