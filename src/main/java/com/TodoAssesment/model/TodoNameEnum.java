package com.TodoAssesment.model;

public enum TodoNameEnum {
	compile("compile"),
	test("test"),
	code("code"),
	deploy("deploy");

	private String nameString;
	TodoNameEnum(String nameString) {
		this.setNameString(nameString);
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
	
	

}
