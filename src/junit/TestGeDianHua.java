package junit;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.axis2.AxisFault;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;
import org.tempuri.ArrayOfString;

import util.DateUtil;
import util.FileUtil;
import util.ServiceUtil;
import util.WebUtil;


public class TestGeDianHua {

	@Test
	public void ShiKuangGeDianHua(){
		String methodName = "GetGeDianHuaData";
		Map<String, Object> params = new HashMap<String, Object>();
		ArrayOfString arrProductType = new ArrayOfString();
		
		arrProductType.addString("平均相对湿度");
		arrProductType.addString("平均气压");
//		arrProductType.getString().add("平均相对湿度");
//		arrProductType.getString().add("平均气压");
		params.put("arrProductType", arrProductType);
		String[] arrBeginEndDate = DateUtil.GetBeginDateAndEndDate("yyyy-MM-dd HH:00", "hour", 1);
		params.put("beginDate", arrBeginEndDate[0]);
		params.put("endDate", arrBeginEndDate[0]);
		
		try {
			String result = ServiceUtil.getWebServiceResult(methodName, params);
			System.out.println(result);
			
			JSONArray ja = new JSONArray(result);
			for(int i = 0 ; i < ja.length(); i ++){
				JSONObject jo = ja.optJSONObject(i);
				String urlStr = jo.optString("图像产品");
				InputStream is = WebUtil.getStreamByURL(urlStr);
				int a = urlStr.lastIndexOf("/");
				String fileName = urlStr.substring(a);
				
				FileUtil.saveToLocalByInputStream(is,fileName);
			}
			

			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
