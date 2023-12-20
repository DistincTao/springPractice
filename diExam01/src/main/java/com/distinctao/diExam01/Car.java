package com.distinctao.diExam01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Engine v6;
	
	public Car() {
		System.out.println("Car 생성자");
	}
	
	public void setEngine(Engine e) {
		this.v6 = e;
	}
	
	public void run( ) {
		System.out.println("엔진을 이용하여 달립니다.");
		v6.exec();
	}
	
//	public static void main(String [] args) {
//		Engine e = new Engine();
//		Car c = new Car();
//		c.setEngine(e);
//		c.run();
//	}
	
}
