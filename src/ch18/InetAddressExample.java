package ch18;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {

	public static void main(String[] args) {
			// InetAddress 클래스의 정적 메소드인 getLocalHost() 메소드를
			// 호출하여, 내 PC의 IP주소를 가지고 있는 InetAddress 객체를 얻어냄!
			// getLocalHost() -로컬 호스트의 주소를 반환합니다.
			//				이것은 시스템에서 호스트 이름을 검색한 다음 해당 이름을 InetAddress로 해석하여 수행됩니다.
			// getHostAddress() - 텍스트 표현으로 IP 주소 문자열을 반환합니다.반환값: 문자열 형식의 원시 IP 주소.Since:1.0.2
		try {
			InetAddress local = InetAddress.getLocalHost(); 
			
//			System.out.println("lcoal(PC이름/IP) : "+local); // 컴퓨터이름 / IP주소
			System.out.println("내 컴퓨터 IP주소: " + local.getHostAddress());
			
//			---
			
			// DNS 서버에 질의한 도메인명 (아래, www.naver.com)에 매핑되어있는
			// 모든 IP주소를 달라!! 요청
			// getAllByName  : 호스트 이름이 주어지면 시스템에 구성된 이름 서비스를 기반으로 해당 IP 주소 배열을 반환합니다.
			InetAddress[] iaArr = InetAddress.getAllByName("naver.com");
			
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP주소: " + remote.getHostAddress());
			}
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
