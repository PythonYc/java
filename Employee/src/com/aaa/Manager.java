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
		System.out.println(toString() + "\n月薪:" + this.salary);
	}
	
	public String toString() {
		return "姓名：" +this.getName() + "\n职位：经理" + "\n年龄：" + this.getAge() + "\n性别：" + this.getGender();
	}
}
