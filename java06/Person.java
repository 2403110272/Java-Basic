package java06;

public class Person {
	String name;
	int age;

	String show() {
		return "사람[이름 : " + name + ", 나이 : " + age + "]";
	}

	String getPersonName() {
		return name;
	}

	int getPersonage() {
		return age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Student extends Person {
	int number;

	public Student(String name, int age, int number) {
		super(name, age);
		this.number = number;
	}

	int getStudentNumber() {
		return number;
	}

	String show() {
		return ("학생[이름 : " + name + ", 나이 : " + age + ", " + "학번 : " + number + "]");
	}
}

class ForeignStudent extends Student {
	String kook;

	public ForeignStudent(String name, int age, int number, String kook) {
		super(name, age, number);
		this.kook = kook;
	}

	String getForeignStudentKook() {
		return kook;
	}

	String show() {
		return "외국학생[이름 : " + name + ", 나이 : " + age + ", " + "학번 : " + number + ", " + "국적 : " + kook + "]";
	}
}
