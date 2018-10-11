public class HelloWorld {

	public static void main(String[] args) {

		MessagePrinter msgPrntr = new MessagePrinter();	
		msgPrntr.printMessage();
		
		MessagePrinter ownMsgPrntr = new MessagePrinter("I'm awesome!");
		ownMsgPrntr.printMessage();
	}

}



