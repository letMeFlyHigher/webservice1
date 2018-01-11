package util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.axis2.AxisFault;
import org.apache.xmlbeans.impl.store.CharUtil;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;
import org.tempuri.ArrayOfString;
import org.tempuri.GetJingZhiWeiXingPicList;
import org.tempuri.GetJingZhiWeiXingPicListResponse;
import org.tempuri.ShuJuHuanJingStub;

public class ServiceUtil {

	static final String station = "53698,53680,53688,53689,53691,53693,53694,53695,53697,53699,53784,53789,53790,53791,53795,54621,54701,54534,54429,54434,54437,54439,54522,54531,54532,54533,54535,54539,54449,54436,54438,54540,54541,53892,53773,53886,53890,53893,53894,53895,53896,53897,53899,53980,53996,54640,54804,54809,54820,53798,53781,53785,53792,53794,53796,53797,53799,53883,53891,54631,54632,54633,54705,54706,54800,54801,54602,53596,53599,53682,53690,53692,53696,54502,54503,54506,54507,54601,54603,54604,54605,54607,54611,54620,54636,54401,53392,53397,53399,53491,53492,53498,53499,53593,54301,54304,54404,54405,54408,54423,54308,54311,54318,54319,54420,54425,54430,54432,54616,54610,54614,54615,54617,54618,54624,54626,54627,54628,54644,54713,54717,54719,10317,54515,54510,54512,54518,54519,54520,54521,54612,54613,54702,54606,54608,54609,54700,54703,54704,54707,54708,54710,54711";
	
	static final String nameSpace="http://tempuri.org/";
	static final String endPoint="http://10.48.36.6:8080/ShuJuHuanJing.asmx";
	static final String userName="集约化平台";
	static final String password="jyhpt";
	
	static final String resultType = "json";
	
	public static final String TIME_OUT = "网络连接超时，请稍后重试！";
	public static final String SERVICE_ERROR = "服务器连接异常！";
	
	public static final String initMethods = "setUserName,setPassword,setResultType";
	
	public static final String packageName = "org.tempuri.";
	

	
	/**
	 * 通过数据接口的方法和参数获得结果。
	 * @param methodName
	 * @param params
	 * @return
	 */
	
	/**
	 * params : 
	 * 
	 * 	beginDate : beginDate;
	 * 	endDate : endDate;
	 * @throws ClassNotFoundException 
	 * @throws AxisFault 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws InstantiationException 
	 * 
	 */
	public static String getWebServiceResult(String methodName ,Map<String,Object> params) throws ClassNotFoundException, AxisFault, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException{
		ShuJuHuanJingStub stub = new ShuJuHuanJingStub();
		// org.tempuri.GetChinaAllGuoJiaZhan
		
		Class<?> classObj = Class.forName(packageName + methodName);
		
		Object instance = classObj.newInstance();
		
		Map<String,String> fieldToMethod = new HashMap<String,String>();
		// 例如：  setBeginDate----> beginDate
		for(String key : params.keySet()){
			
			char c = key.charAt(0);
			char newc = (char) (c - 32);
			String method = "set" + String.valueOf(newc) + key.substring(1);
			fieldToMethod.put(key, method);
		}
		
		try {
			Method setUserName = classObj.getMethod("setUserName", String.class);
			Method setPassword = classObj.getMethod("setPassword", String.class);
			Method setResultType = classObj.getMethod("setResultType", String.class);
			setUserName.invoke(instance, userName);
			setPassword.invoke(instance, password);
			setResultType.invoke(instance, resultType);
			
			for(Entry<String,Object> param : params.entrySet()){
				String key = param.getKey();
				Object value = param.getValue();
				String methodNameStr = fieldToMethod.get(key);
				Method method = classObj.getMethod(methodNameStr, value.getClass());
				method.invoke(instance, value);
			}
			
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
			Object respObj = null;
			Method resultMethod = null;
			try {
				String respName = methodName + "Response";
				String resultName = "get" + methodName + "Result";
				
				Class<?> respClass = Class.forName(packageName + respName);
				respObj = respClass.newInstance();
//		
				String stubGoalMethodStr = MyStringUtils.firstToLower(methodName);

				Method method  = stub.getClass().getMethod(stubGoalMethodStr, classObj);
				
				System.out.println(method.getName());
				respObj = method.invoke(stub, instance);
				resultMethod = respObj.getClass().getMethod(resultName, null);
				String result = (String) resultMethod.invoke(respObj, null);
				return result;
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
					
	}
	
	public static String getWebServiceResult2(String methodName ,Map<String,Object> params) throws ClassNotFoundException, AxisFault, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException{
		ShuJuHuanJingStub stub = new ShuJuHuanJingStub();
		// org.tempuri.GetChinaAllGuoJiaZhan
		
		Class<?> classObj = Class.forName(packageName + methodName);
		
		Object instance = classObj.newInstance();
		
		Map<String,String> fieldToMethod = new HashMap<String,String>();
		// 例如：  setBeginDate----> beginDate
		for(String key : params.keySet()){
			
			char c = key.charAt(0);
			char newc = (char) (c - 32);
			String method = "set" + String.valueOf(newc) + key.substring(1);
			fieldToMethod.put(key, method);
		}
		
		try {
//			Method setUserName = classObj.getMethod("setUserName", String.class);
//			Method setPassword = classObj.getMethod("setPassword", String.class);
//			Method setResultType = classObj.getMethod("setResultType", String.class);
//			setUserName.invoke(instance, userName);
//			setPassword.invoke(instance, password);
//			setResultType.invoke(instance, resultType);
			
			for(Entry<String,Object> param : params.entrySet()){
				String key = param.getKey();
				Object value = param.getValue();
				String methodNameStr = fieldToMethod.get(key);
				Method method = classObj.getMethod(methodNameStr, value.getClass());
				method.invoke(instance, value);
			}
			
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
			Object respObj = null;
			Method resultMethod = null;
			try {
				String respName = methodName + "Response";
				String resultName = "get" + methodName + "Result";
				
				Class<?> respClass = Class.forName(packageName + respName);
				respObj = respClass.newInstance();
//		
				String stubGoalMethodStr = MyStringUtils.firstToLower(methodName);

				Method method  = stub.getClass().getMethod(stubGoalMethodStr, classObj);
				
				System.out.println(method.getName());
				respObj = method.invoke(stub, instance);
				resultMethod = respObj.getClass().getMethod(resultName, null);
				String result = (String) resultMethod.invoke(respObj, null);
				return result;
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
					
	}

	//无人站
	 
	public static JSONArray getHeBeiStation() {
		String methodName = "GetChinaGuoJiaZhanListByProvince";
		String resultType = "json";
		ArrayOfString arrProvince = new ArrayOfString();
		arrProvince.addString("河北");
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("resultType", resultType);
		params.put("arrProvince",arrProvince);
		
		try {
			String result = ServiceUtil.getWebServiceResult2(methodName, params);
			System.out.println(result);
			JSONArray ja = new JSONArray(result);
			return ja;
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
		return null;
		
		
	}
	
	
	/**
	 * ja : 例如 ： {"站号":"54809","站名":"馆陶","纬度":"36.5","经度":"115.3","省份":"河北"}
	 * 将jsonArray 以站号为key，以经纬度为value,组织数据，返回
	 * @param ja
	 * @return
	 */
	public static Map<String, Map<String, String>> JsonFormMap(JSONArray ja) {
		Map<String, Map<String, String>> mmp = new HashMap<String, Map<String, String>>();
		
		for(int i = 0; i < ja.length(); i++){
			JSONObject jo = ja.optJSONObject(i);
			String key = jo.optString("站号");
			
			String m1 = jo.optString("纬度");
			String m2 = jo.optString("经度");
			Map<String,String> m = new HashMap<String,String>();
			m.put("经度", m1);
			m.put("纬度", m2);
			
			mmp.put(key, m);
			
		}
		return mmp;
	}
	
	
	
}
