package chapter15_CollectionFramwork.sec06_LIFO_FIFO.part02_Queue;

public class my03_Message {

	public String command;
	public String to;
	public int order;
	
	public my03_Message(String command, String to, int order) {
		this.command = command;
		this.to = to;
		this.order = order;
	}
}
