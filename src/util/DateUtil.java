package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/**
     * 获取查询开始结束时间
     * @param dateformat 查询时间的格式
     * @param jianGeDanWei 开始结束时间间隔以什么分隔，年、月、日、时、分、秒 
     * @param jianGe 开始结束时间间隔多久 int
     * @return
     */
    public static String[] GetBeginDateAndEndDate(String dateformat,String jianGeDanWei,int jianGe) 
    {
		Date endDate= new Date();
    	Date beginDate=new Date();
		
	    Calendar c = Calendar.getInstance(); 
		c.setTime(beginDate);
		jianGeDanWei=jianGeDanWei.toLowerCase();
		if(jianGeDanWei.contains("year"))
		{
			c.add(Calendar.YEAR, -jianGe); 
		}
		else if (jianGeDanWei.contains("month")) 
		{
			c.add(Calendar.MONTH, -jianGe);
		}
		else if (jianGeDanWei.contains("day")) 
		{
			c.add(Calendar.DATE, -jianGe);
		}
		else if(jianGeDanWei.contains("hour")) 
		{
			c.add(Calendar.HOUR, -jianGe);
		}
		else if(jianGeDanWei.contains("minute")) 
		{
			c.add(Calendar.MINUTE, -jianGe);
		}
		beginDate = c.getTime();
		String strBeginDate=new SimpleDateFormat(dateformat).format(beginDate);
		String strEndDate=new SimpleDateFormat(dateformat).format(endDate);
		String[] arrResult={strBeginDate,strEndDate}; 
		return  arrResult;
	}
}
