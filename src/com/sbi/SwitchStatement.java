package com.sbi;

public class SwitchStatement {

	public void switchLoop() {
		String s = "Internal Server Error";
		
		switch(s) {
		case "Not Found":
			System.out.println(404);
			break;
		case "Unauthorized":
			System.out.println(400);
			break;
		case "Internal Server Error":
			System.out.println(500);
			break;
		default: System.out.println("Invalid Error");
		}
		
	}
	
	public static void main(String[] args) {
		SwitchStatement obj = new SwitchStatement();
		obj.switchLoop();
	}

}
