package com.bilgeadam.boost.java.testpackage;

public class Test {

	public String publicVariable = "public degisken";
	protected String protectedVariable = "protected degisken";
	String defaultVariable = "default degisken";
	private String privateVariable = "private degisken";
	
	public static void main(String[] args) {
			
		Test testObject = new Test();
		
		System.out.println("Erisebildigim degiskenler:"+ testObject.publicVariable+", "+testObject.defaultVariable+", "+testObject.protectedVariable+", "+testObject.privateVariable);
		
	}

}
