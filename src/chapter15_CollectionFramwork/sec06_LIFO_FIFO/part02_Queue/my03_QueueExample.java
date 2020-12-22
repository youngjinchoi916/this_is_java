package chapter15_CollectionFramwork.sec06_LIFO_FIFO.part02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class my03_QueueExample {

	public static void main(String[] args) {
		Queue<my03_Message> messageQueue = new LinkedList<my03_Message>();

		//messageQueue에 들어가 있는 순서
		messageQueue.offer(new my03_Message("sendMail", "홍길동", 1));  //1
		messageQueue.offer(new my03_Message("sendSMS", "신용권", 2));  //2
		messageQueue.offer(new my03_Message("sendKakaotalk", "홍두께", 3));  //3

		//queue에 있는거 다 나올때 까지 반복한다.
		while (!messageQueue.isEmpty()) {
			my03_Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println("순서 : "+message.order+" - "+message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println("순서 : "+message.order+" - "+message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println("순서 : "+message.order+" - "+message.to + "님에게 카카오톡를 보냅니다.");
				break;
			}
		} //end while

	} //end main

} //end class
