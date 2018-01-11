package util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.axis2.AxisFault;
import org.tempuri.ShuJuHuanJingStub;

public class MyStringUtils {

	
	 public static boolean isEmpty(final CharSequence cs) {
	        return cs == null || cs.length() == 0;
	    }
	 /*
	  * 将传入字符串的首字符转换成大写
	  */
	 public static String firstToLower(String str){
		 char c = str.charAt(0);
		 char newc = (char) (c+32);
		 return String.valueOf(newc) + str.substring(1);
	 }
	 
	 
	 public static void test(){
		 String methodName = "GetGuoJiaZhanXunData";
		 String packageName = "org.tempuri.";
		 try {
			Class<?> classObj = Class.forName(packageName + methodName);
			 Object instance = classObj.newInstance();
			 
			 ShuJuHuanJingStub stub = new ShuJuHuanJingStub();
			 String respName = methodName + "Response";
			 String resultName = "get" + methodName + "Result";
				Class<?> respClass = Class.forName(packageName + respName);
				Object respObj = respClass.newInstance();
//		
				String stubGoalMethod = MyStringUtils.firstToLower(methodName);
			
//				Method[] methods = stub.getClass().getMethods();
//				for(int i = 0; i < methods.length; i++){
//					System.out.println(methods[i].getName());
//				}
				//这个方法需要有参数的。
				Method method  = stub.getClass().getMethod(stubGoalMethod, classObj);
				
				System.out.println(method.getName());
				respObj = method.invoke(stub, instance);
				Method resultMethod = respObj.getClass().getMethod(resultName, null);
				
				String result = (String) resultMethod.invoke(respObj, null);
				
		} catch (Exception e){
			e.printStackTrace();
		}
	 }
	 public static void main(String[] args) {
		test();
	}

}
