
public class MessagePrinter {

	 MessagePrinter() {
		this.message = "I can has Cheezburger!";
		System.out.println("created default MessagePrinter");
	}
	
	MessagePrinter(String myMessage) {
		this.message = myMessage;
		System.out.println("created individual MessagePrinter");
	}
	
	public void printMessage() {
		System.out.println(this.message);
	}

	
	private String message; 
}
