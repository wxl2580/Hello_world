package cn.java_day04;

public class StringDemo {
	public static void main(String[] args) {
		String a = "hello";
		System.out.println(a);
			
		String x = new String("123");
		String y = new String("123");
//		System.out.println(x);
//		System.out.println(y);
		
		System.out.println("�����Ⱥűȵ�ַ:"+(x==y));
		System.out.println("equals��ֵ��"+x.equals(y));
		
	}
}
