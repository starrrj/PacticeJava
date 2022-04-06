package ch18;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class URLConnectionEx {

	public static void main(String[] args) throws IOException {
		log.debug("main({}) invoked.", Arrays.toString(args));
		
		String url = "https://www.kita.net/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do";
		
		URL kita = new URL(url);
		
		// 지정된 URL에 직접 연결을 시도하고, 연결(터널)을 생성한 객체
//		URLConnection urlConn = kita.openConnection();
		HttpsURLConnection urlConn = (HttpsURLConnection) kita.openConnection();
		// 이 URLConnection 객체는 생성된 연결을 통해서, 지정된 URL에 있는 웹자원으로부터
		// 다양한 컨텐츠를 얻어낼 수 있음.
		log.info("1. kita : {}", kita);
		log.info("2. urlConn : {}", urlConn);
		log.info("\t type: {}", urlConn.getClass().getName());
		log.info("3. getAllowUserInteraction : {}", urlConn.getAllowUserInteraction());
		log.info("4. getDefaultAllowUserInteraction : {}", URLConnection.getDefaultAllowUserInteraction());
		log.info("5. getConnectTimeout : {}", urlConn.getConnectTimeout());	// ***
		log.info("6. getContent : {}", urlConn.getContent());	// URI
		log.info("7. getContentEncoding : {}", urlConn.getContentEncoding());	// URI
		log.info("8. getContentLength : {}", urlConn.getContentLength());
		log.info("9. getContentType : {}", urlConn.getContentType());
		log.info("10. getDate : {}", new Date(urlConn.getDate()));
		log.info("11. getDefaultUseCaches : {}", urlConn.getDefaultUseCaches());
		log.info("12. getDoInput : {}", urlConn.getDoInput());
		log.info("13. getDoOutput : {}", urlConn.getDoOutput());
		log.info("14. getExpiration : {}", urlConn.getExpiration());
		log.info("15. getHeaderFields : {}", urlConn.getHeaderFields());
		log.info("16. getIfModifiedSince : {}", urlConn.getIfModifiedSince());
		log.info("17. getLastModified : {}", urlConn.getLastModified());
		log.info("18. getReadTimeout : {}", urlConn.getReadTimeout());
		log.info("19. getURL : {}", urlConn.getURL());
		log.info("20. getUseCaches : {}", urlConn.getUseCaches());
		
		
		
                  
	}

}
