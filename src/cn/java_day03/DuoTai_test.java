package cn.java_day03;

public class DuoTai_test {
	public static void main(String[] args) {
		School sc = new School();
		
		Teacher Chinese_t = new Chinese_t();
		sc.setTeacher(Chinese_t);
		sc.method("������");

		
		
		Teacher Math_t  = new Math_t();
		sc.setTeacher(Math_t);
		sc.method("������");
		
		Student XiaoYin_s = new XiaoYin_s();
		sc.setStudent(XiaoYin_s);
		sc.method2("����");
	}
}
