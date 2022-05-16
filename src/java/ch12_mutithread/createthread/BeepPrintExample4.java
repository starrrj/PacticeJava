package ch12_mutithread.createthread;



public class BeepPrintExample4 {

	// 각자 개별 실행. 동시에 수행시키자!!
	public static void main(String[] args) {

		Thread thread = new Thread() {

			@Override
			public void run() {
				for (;;) {
					System.out.print("-");

					try {
						Thread.sleep(100);
					} catch (Exception e) {;;}
				}
			}
		}; // 익명자식객체 생성

		thread.setName("star"); // default naming rule: Thread- N , 스레드 이름정하기

//		------------

		thread.start();

		for (;;) {
			System.out.print("*");
			try {
				Thread.sleep(50);
			} catch (Exception e) {;;}
		} // for

	} // main

} // end class
