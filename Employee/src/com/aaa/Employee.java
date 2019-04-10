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
			System.out.println("�벶���쳣.....");
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) throws Exception{
		if(age <= 0) {
			throw new Exception(age +"�������.");
		}
		this.age = age;
	}
	public void setGender(String gender) throws NoException{
		if(gender == "��" || gender == "Ů")
			this.gender = gender;
		else {
			throw new NoException(gender + "�Ա�����������"+ "<��>����" + "<Ů>");
			//System.out.println("�Ա�����������"+ "<��>����" + "<Ů>");	
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
