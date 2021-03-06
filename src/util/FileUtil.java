package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

import java.text.SimpleDateFormat;
import java.util.Date;



public class FileUtil {

	/**
	 * 将啥啥啥保存到本地。
	 * @param is
	 */
	public static void saveToLocalByInputStream(InputStream is,String fileName) {
		
		String path = "E://download//";
		File file = new File(path);
		if(!file.exists()){
			file.mkdirs();
		}
		try {
			File file1 = new File(path+fileName);
			FileOutputStream os = new FileOutputStream(file1);
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = is.read(b))!=-1){
				os.write(b, 0, len);
				os.flush();
			}
			os.close();
			System.out.println(fileName + "保存成功");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String convertPattern(String fileNamePattern){
		Date date = new Date();
		String dateStr = new SimpleDateFormat("yyyyMMDDHHmm").format(date);
		String fileName = fileNamePattern.replace("YYYYMMDDHHmm", dateStr);
		return fileName;
		
	}

	public static void saveCSVToLocal(String rs, String fileName) {
		String path = "E://pic//";
		File file = new File(path);
		if(!file.exists()){
			file.mkdirs();
		}
		
		File file1 = new File(path+fileName);
		try {
			FileOutputStream os = new FileOutputStream(file1);
			byte[] bytes = rs.getBytes("gbk");
			os.write(bytes);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		byte[] b = new byte[1024];
//		int len = 0;
//		while ((len = is.read(b))!=-1){
//			os.write(b, 0, len);
//			os.flush();
//		}
//		os.close();
		System.out.println(fileName + "保存成功");
		
	}


}
