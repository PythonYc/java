package com.aaa;



public class EmployeeMain {
	public static void main(String[] args) {
		Employee ma = new Manager("sholto",-2,"��sheng",5000);
		Manager m = (Manager)ma;
			if(m instanceof Manager)
		m.ManagerFo();
		System.out.println();
		Employee sa = new Salesman("mike",18,"Ů",2000,20,10);
		Salesman s = (Salesman)sa;
			if(s instanceof Salesman)
			s.SalesmanFo();
		
		
	}
}
