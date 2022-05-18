package ch18_network.io.tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class ReadURLConnectAndSaveToFile { //ConnectAndSaveToFile
	public static void main(String[] args) throws Exception {
	
		log.debug("main({}) invoked", Arrays.toString(args));
		String url = "https://www.kita.net/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do";
		String outFile = "goodMornKitaDetail.do.html";
				
		URL kita = new URL(url);
		
		InputStream is = kita.openStream();
		FileOutputStream fos = new FileOutputStream(outFile);
		
		try (is; fos ){
			int nextByte;
			
			while((nextByte = is.read()) != -1) { // -1 : EOF
				fos.write(nextByte);
			} // while
		} // try-with-resources
		
//		---------------
		
		File f = new File(outFile);
		
		if(f.exists()) {
			log.info("\t + getAbsolutePath : {}", f.getAbsoluteFile());
		} // if
	} // main
}
