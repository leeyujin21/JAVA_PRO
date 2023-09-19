package com.test05;

import java.util.HashMap;

public class Company {
	public static void main(String[] args) {
		// HashMap을 생성하여 Integer(직원 번호)를 키로, Employee 객체를 값으로 저장
        HashMap<Integer, Employee> map = new HashMap<>();
        
        // 1번의 데이터를 기반으로 객체를 생성하여 HashMap에 저장
        Secretary emp1 = new Secretary("홍길동", 1, "Secretary", 800);
        Sales emp2 = new Sales("이순신", 2, "Sales", 1200);
        
		// HashMap에 저장시 키 값은 각 객체의 Number로 한다.
        map.put(emp1.getNumber(), emp1);
        map.put(emp2.getNumber(),emp2);
        System.out.println("name   department   salary");
        System.out.println("--------------------------");
        
		// 모든 객체의 기본 정보를 출력한다. ( for문 이용 , keySet() 이용 )
        for(Integer e : map.keySet()) {
        	Employee emp = map.get(e);
        	System.out.printf("%-5s %-10s %,8d%n", 
        			emp.getName(), emp.getDepartment(), emp.getSalary());
        }
        
		// 모든 객체의 인센티브 100씩 지급한다.
        System.out.println();
        System.out.println("인센티브 100 지급");
        System.out.println();
        
        emp1.incentive(100);
        emp2.incentive(100);
        
		// 모든 객체의 정보와 세금을 출력한다. ( for문 이용 )
		System.out.println("name   department   salary     tax");
        System.out.println("-----------------------------------");
		for(Integer e : map.keySet()) {
			Employee emp = map.get(e);
			System.out.printf("%-5s %-10s %,8d %,8.2f%n", 
        			emp.getName(), emp.getDepartment(), emp.getSalary(), emp.tax(emp.salary));
		}
	}
}