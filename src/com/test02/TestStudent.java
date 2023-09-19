package com.test02;

import java.util.ArrayList;
import java.util.List;

class Human{
	String name;
	int age;
	int height;
	int weight;
	Human(){}
	Human(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return name + " " + age + " " + height + " " + weight;
	}
}
class Student extends Human {
	String number;
	String major;
	Student(){}
	Student(String name, int age, int height, int weight, String number, String major){
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	@Override
	public String toString() {
		return super.toString() + " " + number + " " + major;
	}
}
public class TestStudent {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>(); // Student 객체를 3개 생성하여 List에 저장한다.
		// List에 저장된 Student 객체 정보를 출력한다.
		list.add(new Student("홍길동", 20, 177, 74, "201301", "체육"));
		list.add(new Student("이순신", 44, 178, 77, "201302", "체육"));
		list.add(new Student("유관순", 18, 155, 45, "201303", "컴퓨터"));
		
		for(Student s: list) {
			System.out.println(s);
		}System.out.println();
	}
}