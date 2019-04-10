package com.aaa;

public abstract class Employee {
	private String name;
	private int age;
	private String gender;
	public Employee() {}
	public Employee(String name,int age,String gender) {
		setName(name);
		try {
			this.setAge(age);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
			this.setGender(gender);
		} catch (NoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}finally {
			System.out.println("请捕获异常.....");
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) throws Exception{
		if(age <= 0) {
			throw new Exception(age +"年龄错误.");
		}
		this.age = age;
	}
	public void setGender(String gender) throws NoException{
		if(gender == "男" || gender == "女")
			this.gender = gender;
		else {
			throw new NoException(gender + "性别有误，请输入"+ "<男>或者" + "<女>");
			//System.out.println("性别有误，请输入"+ "<男>或者" + "<女>");	
		}
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getGender() {
		return this.gender;
	}
	
//	public void ManagerFo() {}
//	public void SalesmanFo() {}
}
