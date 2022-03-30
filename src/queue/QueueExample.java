package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messangeQueue = new LinkedList<Message>();
		
		messangeQueue.offer(new Message("sendMail", "홍길동"));
		messangeQueue.offer(new Message("sendSMS", "신용권"));
		messangeQueue.offer(new Message("sendKaKaotalk", "홍두깨"));
		
		System.out.println(messangeQueue);
		
		while(!messangeQueue.isEmpty()) {
			Message message = messangeQueue.poll(); // 선입선출
			switch(message.command){
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS을 보냅니다.");
					break;
				case "sendKaKaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			} // switch
		} // while
	} // main
} // end class
