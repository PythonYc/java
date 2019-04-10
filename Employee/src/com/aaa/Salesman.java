package com.aaa;

public class Salesman extends Employee {
	private int wage;
	private int number;
	private double maneyNum;
	
	public void setWage(int wage) {
		this.wage = wage;
	}
	public void setNumber(int number) {
		this.number = number ;
	}
	public void setManeyNum(double maneyNum) {
		this.maneyNum = maneyNum;
	}
	public int getWage() {
		return this.wage;
	}
	public int getNumber() {
		return this.number;
	}
	public double getManeyNum() {
		return this.maneyNum * this.number;
	}
	
	public Salesman() {}
	public Salesman(String name,int age,String gender,int wage,int number,double maneyNum) {
		super(name,age,gender);
		setWage(wage);
		setNumber(number);
		setManeyNum(maneyNum);
	}
	
	public void SalesmanFo() {
		System.out.println(tosString() +"\n月薪（含底薪）:" + this.wage + "\n销售数量：" + this.number + "\n每件提成：" + this.maneyNum + "\n提成：" + this.getManeyNum());
	}
	public String tosString() {
		return "姓名：" + this.getName() + "\n年龄：" + this.getAge() +"\n职位：销售员" + "\n性别：" + this.getGender();
	}
}
