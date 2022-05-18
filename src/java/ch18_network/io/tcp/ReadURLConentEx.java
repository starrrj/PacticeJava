package ch18_network.io.tcp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ReadURLConentEx {

	public static void main(String[] args) throws Exception {
		log.debug("main({}) invoked", Arrays.toString(args));
		
		// 1. 지정된 URL에 대한 URL객체 생성
		String url = "https://www.kita.net/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do";
		URL kita = new URL(url);
		
		// 2. URL객체를 이용해 실제 지정된 URL 사이트에 접속
		URLConnection urlConn = kita.openConnection();
		
		// 3. 연결된 터널을 통해, 실제 웹자원의 내용을, 입력스트림에 이용하여 읽어오자!!
		InputStream is = urlConn.getInputStream();
//		-----------------------------------
//		InputStream is = kita.openStream();
//		-----------------------------------
		
		// 4. 읽어오는 성능을 획기적으로 높이기 위해, 성능향상 보조스트림을 사용하자!!!
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		try (is; br){
			String line;
			
			while((line = br.readLine()) != null) {	// EOF(null)
				log.info(line);
			} // while
		} // try-with-resources
	} // main

} // end class
