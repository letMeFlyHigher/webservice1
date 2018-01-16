package junit;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class Main{
	
	public static void main(String[] args) throws Exception{
		
		
		while(true){
			Date d = new Date();
			
			SimpleDateFormat sdf = new SimpleDateFormat();
			
			String date = sdf.format(d);
			System.out.println(date);
			
			String interval = "逐日";
			
			if(interval.equals("逐日")){
				String className = "junit.GetGuoJiaZhanTenDayTemp";
				Class<?> classObj = Class.forName(className);
				Object obj = classObj.newInstance();
				Method m = classObj.getMethod("run", null);
				m.invoke(obj, null);
				Thread.currentThread().sleep(1000*24);
			}
			
			
		}
	}
	
	
}