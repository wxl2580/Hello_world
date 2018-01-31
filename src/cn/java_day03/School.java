package cn.java_day03;

public class School {
	private String name;
	private Teacher teacher;
	private Student student;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void method(String name){
		this.name = name;
		teacher.t_say(name);
	}
	
	public void method2(String name){
		this.name = name;
		student.s_say(name);
	}
	
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
//	
}
