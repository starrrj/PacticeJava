package inetAddress;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class URLEx {

	public static void main(String[] args) throws IOException, URISyntaxException {
		log.debug("main() invoked.");
		
//		---
		
		// URL = Uniform Resource Locator
		URL url1 = new URL("https://www.kita.net/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do");
		log.info("1.url1 : {}, type: {}", url1, url1.getClass().getName());
		
		URL url2 = new URL("http","www.kita.net","/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do");
		log.info("2.url2 : {}", url2);
		
		URL url3 = new URL("http","www.kita.net",80,"/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do");
		log.info("3.url3 : {}", url3);
		
		URL kita = new URL("https://www.kita.net/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do");
		log.info("4.kita : {}", kita);
		
		log.info("\t+ getAuthority : {}", kita.getAuthority());
		log.info("\t+ getProtocol : {}", kita.getProtocol());
		log.info("\t+ getHos t: {}", kita.getHost());
		log.info("\t+ getPort : {}", kita.getPort());
		log.info("\t+ getDefaultPort : {}", kita.getDefaultPort());	// ***
		log.info("\t+ getFile : {}", kita.getFile());	// URI
		log.info("\t+ getPath : {}", kita.getPath());	// URI
		log.info("\t+ getQuery : {}", kita.getQuery());
		log.info("\t+ getRef : {}", kita.getRef());
		log.info("\t+ getUserInfo : {}", kita.getUserInfo());
		log.info("\t+ getContent : {}", kita.getContent());
		log.info("\t+ toExteranlForm : {}", kita.toExternalForm());
		log.info("\t+ toURI : {}", kita.toURI());
		
		
		
	}
}
