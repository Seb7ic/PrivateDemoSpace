package com.seb.main;
public class HelloWorld {

	public static void main(String[] args) {

		MessagePrinter msgPrntr = new MessagePrinter();	
		msgPrntr.printMessage();
		
		MessagePrinter ownMsgPrntr = new MessagePrinter("I'm awesome!");
		ownMsgPrntr.printMessage();
		
		MessagePrinter anotherMsgPrntr = new MessagePrinter("I'm even better!");
		anotherMsgPrntr.printMessage();
	}

}



 