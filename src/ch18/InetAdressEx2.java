package inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class InetAdressEx2 {

	public static void main(String[] args) throws UnknownHostException {
		log.debug("main({}) invoked", Arrays.toString(args));

//		---
		
		InetAddress localhost = InetAddress.getLocalHost();
		log.info("0.localhost : {}, type: {}", localhost, localhost.getClass().getName());

//		---
		
		// 지정된 도메인명에 대한 IP주소가 여러개 있을지라도, 단 1개의 처음
		// IP주소만을 얻어내는 정적 메소드 호출
		InetAddress addr = InetAddress.getByName("www.naver.com");
		log.info("1. addr : {}", addr);
		log.info("2. gostname:{}", addr.getHostName());
		log.info("3. FQDN : {}", addr.getCanonicalHostName());			//FQDN : Fully-Qualified Domain Name
		log.info("4. hostAddress : {}", addr.getHostAddress());			// Host IP Address
		log.info("5. loopback : {}", InetAddress.getLoopbackAddress());	// Loopback Address of the current PC
		log.info("6. localhost : {}", addr.getCanonicalHostName());		// localhost address of the current PC
		
		
		// IP 주소 --> byte[] 변환
		byte[] addrBytes = addr.getAddress();
		log.info("7. byteAddr: {}", Arrays.toString(addrBytes));		// Get byte array of Host IP address
		
//		//Get normal Host Address when one byte < 0, byte +256 required
		for(byte b : addrBytes) {
			log.info("\t+ b: {}", (b < 0)? b+256 : b);					// if one byte < 0, the byte + 256 => normal value
		} // enhanced for
		
//		---
		
		InetAddress[] addrs = InetAddress.getAllByName("www.kakao.com");
		
		for(InetAddress address : addrs) {
			log.info("8. address : {}", address);
			log.info("9. FQDN : {}", address.getCanonicalHostName());
		} // enhanced for
	} // main
} // end class
