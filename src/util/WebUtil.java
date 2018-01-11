package util;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class WebUtil {

	public static InputStream getStreamByURL(String urlStr) {
		
		try {
			URL url = new URL(urlStr);
		    InputStream is  = url.openStream();
		   
			return is;
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		return null;
		
	}

}
