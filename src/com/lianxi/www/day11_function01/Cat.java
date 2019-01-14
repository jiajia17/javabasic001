package com.lianxi.www.day11_function01;

public class Cat {
	private String name;
	private Integer age;
	private String color;
	private float height;
	public Cat() {
		super();
	}
	public Cat(String name, Integer age, String color, float height) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", color=" + color + ", height=" + height + "]";
	}
	
	
	
	

}
