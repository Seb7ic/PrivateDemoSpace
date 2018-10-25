package com.seb.main;

public class MessagePrinter {

	 MessagePrinter() {
		this.message = "I can has Cheezburger!";
		System.out.println("created the default MessagePrinter");
	}
	
	MessagePrinter(String myMessage) {
		this.message = myMessage;
		System.out.println("created my individual MessagePrinter");
	}
	
	public void printMessage() {
		System.out.println(this.message);
	}

	
	private String message; 
}
