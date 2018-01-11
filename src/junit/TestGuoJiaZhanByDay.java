package junit;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import org.apache.axis2.AxisFault;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;
import org.tempuri.GetFuWuProduct;
import org.tempuri.GetJingZhiWeiXingPicList;
import org.tempuri.GetJingZhiWeiXingPicListResponse;
import org.tempuri.ShuJuHuanJingStub;

import util.ServiceUtil;

public class TestGuoJiaZhanByDay {

	static final String station = "53698,53680,53688,53689,53691,53693,53694,53695,53697,53699,53784,53789,53790,53791,53795,54621,54701,54534,54429,54434,54437,54439,54522,54531,54532,54533,54535,54539,54449,54436,54438,54540,54541,53892,53773,53886,53890,53893,53894,53895,53896,53897,53899,53980,53996,54640,54804,54809,54820,53798,53781,53785,53792,53794,53796,53797,53799,53883,53891,54631,54632,54633,54705,54706,54800,54801,54602,53596,53599,53682,53690,53692,53696,54502,54503,54506,54507,54601,54603,54604,54605,54607,54611,54620,54636,54401,53392,53397,53399,53491,53492,53498,53499,53593,54301,54304,54404,54405,54408,54423,54308,54311,54318,54319,54420,54425,54430,54432,54616,54610,54614,54615,54617,54618,54624,54626,54627,54628,54644,54713,54717,54719,10317,54515,54510,54512,54518,54519,54520,54521,54612,54613,54702,54606,54608,54609,54700,54703,54704,54707,54708,54710,54711";
	
	static final String nameSpace="http://tempuri.org/";
	static final String endPoint="http://10.48.36.6:8080/ShuJuHuanJing.asmx";
	static final String userName="集约化平台";
	static final String password="jyhpt";
	
	public static final String TIME_OUT = "网络连接超时，请稍后重试！";
	public static final String SERVICE_ERROR = "服务器连接异常！";
	/**
	 * 拿到静止卫星信息
	 * @throws RemoteException
	 * @throws ClassNotFoundException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws InstantiationException 
	 */
	@Test
	public void testJingZhiWeiXing() throws RemoteException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException{
		
		String methodName = "GetJingZhiWeiXingPicList";
		Map<String,Object> params = new HashMap<String,Object>();
		
		params.put("beginDate", "2018-1-3");
		params.put("endDate", "2018-1-5");
		String result = ServiceUtil.getWebServiceResult(methodName, params);
		System.out.println(result);
		
		
		//接下来就要处理结果了。。
		
		
//		ShuJuHuanJingStub sjjs = new ShuJuHuanJingStub();
//		GetJingZhiWeiXingPicList getPic = new GetJingZhiWeiXingPicList();
//		getPic.setBeginDate("2018-1-3");
//		getPic.setEndDate("2018-1-5");
//		getPic.setPassword(password);
//		getPic.setResultType("json");
//		getPic.setUserName(userName);
//		GetJingZhiWeiXingPicListResponse rs = sjjs.getJingZhiWeiXingPicList(getPic);
//		String result = rs.getGetJingZhiWeiXingPicListResult();
//		System.out.println("success result is ");
//		System.out.println(result);
		
	}
	/**
	 * GetChinaAllGuoJiaZhan
	 * 参数：resultType为数据格式类型，设置xml或json；
	 * @throws JSONException 
	 */
	@Test
	public void testGetChinaAllGuoJiaZhan() throws JSONException{
		String methodName = "GetChinaAllGuoJiaZhan";
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("resultType", "json");
		try {
			String result = ServiceUtil.getWebServiceResult2(methodName, params);
			String resultP = processResultGetProvince(result);
			System.out.println(resultP);
			
			GenerateFile(resultP,"国家站信息.json");
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
		}
	}
	private void GenerateFile(String resultP,String fileName) {
		
			
			
			    try {
					JSONArray ja = new JSONArray(resultP);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				String path = "E://download//";
				File file = new File(path);
				if(!file.exists()){
					file.mkdirs();
				}
				
				file = new File(path + fileName);
				byte[] byteStr = resultP.getBytes();
				
				try {
					FileOutputStream os = new FileOutputStream(file);
					os.write(byteStr);
					os.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
	}
	private String processResultGetProvince(String result) throws JSONException {
		JSONArray ja = new JSONArray(result);
		JSONArray jaa = new JSONArray();
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < ja.length(); i ++){
			JSONObject jo = ja.optJSONObject(i);
			if("河北".equals(jo.optString("省份"))){
				if(sb.length() == 0){
					sb.append("[");
				}
				sb.append(jo.toString() + ",");
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("]");
		return sb.toString();
	}
	
	
	
}
