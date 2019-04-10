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
		System.out.println(tosString() +"\n��н������н��:" + this.wage + "\n����������" + this.number + "\nÿ����ɣ�" + this.maneyNum + "\n��ɣ�" + this.getManeyNum());
	}
	public String tosString() {
		return "������" + this.getName() + "\n���䣺" + this.getAge() +"\nְλ������Ա" + "\n�Ա�" + this.getGender();
	}
}
