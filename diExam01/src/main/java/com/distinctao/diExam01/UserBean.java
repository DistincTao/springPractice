package com.distinctao.diExam01;

//빈클래스
public class UserBean {
	
//  bean Class의 기본 요건
//	1. 기본생성자를 가지고 있습니다.
//	2. 필드는 private하게 선언합니다.
//	3. getter, setter 메소드를 가집니다.
//	getName() setName() 메소드를 name 프로퍼티(property)라고 합니다. (용어 중요)
	
	//필드는 private한다.
	private String name;
	private int age;
	private boolean male;
	
	//기본생성자를 반드시 가지고 있어야 한다.
	public UserBean() {
	}
	
	public UserBean(String name, int age, boolean male) {
		this.name = name;
		this.age = age;
		this.male = male;
	}

	// setter, getter메소드는 프로퍼티라고 한다.
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	@Override
	public String toString() {
		return "UserBean [name=" + name + ", age=" + age + ", male=" + male + "]";
	}

	
	
}