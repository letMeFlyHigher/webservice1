package junit;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.axis2.AxisFault;
import org.junit.Test;
import org.tempuri.ArrayOfString;

import util.ServiceUtil;

public class GetStation {

	@Test
	public void run() throws AxisFault, IllegalArgumentException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException{
		
		String methodName = "GetGuoJiaZhanListByStationNum";
		
		
		Map<String,Object> params = new HashMap<String,Object>();
		
		params.put("resultType", "json");
		
		
		
		String result = ServiceUtil.getWebServiceResult2(methodName, params);
		System.out.println(result);
		
	}
}
