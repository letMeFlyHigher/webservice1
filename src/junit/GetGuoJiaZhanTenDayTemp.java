package junit;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.axis2.AxisFault;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;
import org.tempuri.ArrayOfString;

import util.DateUtil;
import util.FileUtil;
import util.ServiceUtil;

public class GetGuoJiaZhanTenDayTemp {
	
	public static  void run(){
		
		String methodName = "GetGuoJiaZhanDayData";
		Map<String,Object> params = new HashMap<String,Object>();
		ArrayOfString arrColumnName = new ArrayOfString();
		arrColumnName.addString("气温4次平均|V12001_301_04");
		params.put("arrColumnName", arrColumnName);
		ArrayOfString arrStationNum = new ArrayOfString();
		//拿到河北省的国家站信息，Json格式 例如：{"站号":"54717","站名":"吴桥","纬度":"37.3","经度":"116.4","省份":"河北"}
		JSONArray ja = ServiceUtil.getHeBeiStation();
		Map<String,Map<String,String>> m =  ServiceUtil.JsonFormMap(ja);
		
		//拿到河北省的所有国家站站号
//		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < ja.length(); i ++){
			JSONObject jo = ja.optJSONObject(i);
			String stationNumber = jo.optString("站号");
//			sb.append(stationNumber + ",");
			arrStationNum.addString(stationNumber);
		}
		params.put("arrStationNum", arrStationNum);
		String[] arrBeginAndEndDate = DateUtil.GetBeginDateAndEndDate("yyyy-MM-dd", "day", 10);
		params.put("beginDate", arrBeginAndEndDate[0]);
		params.put("endDate", arrBeginAndEndDate[1]);
		String result = null;
		try {
		    result = ServiceUtil.getWebServiceResult(methodName, params);
			
			//这里默认的情况是，查询国家站日平均气温的时候都是查了10天的，也就是么人查询的是正确的，数据全的情况下，这么做的
			JSONArray jaa = new JSONArray(result);
			
			//结果例如：{"站号":"53392","观测时间":"20171231","气温4次平均":-16.0},
			//JSONArray 是有序的么？？看怎么查的，怎么组织的了。
			//十个一组来处理数据。
			//组织格式： 站号,经度,纬度,平均气温
			String headLine = " 站号,经度,纬度,平均气温" + "\n";
			StringBuffer sb = new StringBuffer();
			sb.append(headLine);
			for(int i = 0; i < jaa.length(); i += 10){ //这里是不是有可能出问题？
				//河北省的国家站数据{"站号":"54717","站名":"吴桥","纬度":"37.3","经度":"116.4","省份":"河北"}   //53392
				//因为有的数据会为空，所以平均值，在数据存在的情况下，取数据的平均值。
				float favg,fsum = 0;
				int count = 0;
				for(int j = 0; j < 10; j++){
					
					JSONObject jo = jaa.optJSONObject(i + j);
					String avg = jo.optString("气温4次平均");
					if(avg != null){
						float tmp = Float.parseFloat(avg);
						fsum += tmp;
						count++;
					}
					
				}
				favg = fsum/count;
				String stationNum = jaa.optJSONObject(i).optString("站号");
				String JingDu = m.get(stationNum).get("经度");
				String WeiDu = m.get(stationNum).get("纬度");
				sb.append(stationNum).append(',').append(JingDu).append(',').append(WeiDu).append(',').append(favg).append("\n");
				
			}
			
			String rs = sb.toString();
			System.out.println(rs);
			
			//继续处理，将得到的标准样式的数据保存到本地
			String fileName = "1.csv";
			FileUtil.saveCSVToLocal(rs,fileName);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
}
