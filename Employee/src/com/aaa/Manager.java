package com.aaa;

public class Manager extends Employee {
	private int salary;
	public void setSalary(int salary) {
		if(salary > 0.0)
			this.salary = salary;
	}
	public int getSalary() {
		return this.salary;
	}
	public Manager() {}
	public Manager(String name,int age,String gender,int salary) {
		super(name,age,gender);
		setSalary(salary);
	}
	
	public void ManagerFo() {
		System.out.println(toString() + "\n��н:" + this.salary);
	}
	
	public String toString() {
		return "������" +this.getName() + "\nְλ������" + "\n���䣺" + this.getAge() + "\n�Ա�" + this.getGender();
	}
}
