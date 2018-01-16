package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.codehaus.jettison.json.JSONArray;
import org.junit.Test;

public class DiskUtil {
	
	
	
	@Test
	public void indexFileCast(){
		//读取生活指数文件，保存成String的格式。
		String path = "D:\\Documents\\Tencent Files\\996245864\\FileRecv\\共享盘福\\生活指数2018011111.txt";
		String rr = readFileByChars(path);

		String result = processRS2(rr);
		System.out.println(result);
		
		String fileName = "shenghuozhishu.txt";
		String filePath = "E:\\";
		FileUtil.saveToLocal(result,fileName,filePath);
		
		
		
		
		
	}
	
	@Test
	public void testFileByInputStream(){
		String path = "D:\\Documents\\Tencent Files\\996245864\\FileRecv\\共享盘福\\生活指数2018011111.txt";
		try {
			FileInputStream fis = new FileInputStream(new File(path));
			String result = FileUtil.getProcessContent(fis);
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	//当前版本，是包含特殊符号的版本。
	//调用该函数前应该先判断是否包含特殊符号，如果包含，那么就重新获取indexStr。
	public static String processRS2(String indexStr){
		//这是要做什么，这是要将一个文件中的内容按照指数类别分为多个文件。并且将该文件组织成格式为    
		//先用\r\n分出数组来，
																																//设置一个flag，该flag用来标志指数部分是否改变
		//对该数组进行遍历.
			//遍历元素包含\n，如果包含\n,那么就在分离一下下
				//对于每一个元素的处理：
				
		 	//如果不包含，那就直接进行处理。
				//对于每一个元素的处理
		String[] arrIndex = indexStr.split("\r\n");
		
		StringBuffer sb = new StringBuffer("站点号|发布日期|指数类型|级别|提示语|描述").append("\n");
		//因为第一行是标题。所以不能要啊。
		for(int i = 1; i < arrIndex.length; i++){
		    	if(arrIndex[i].contains("\n")){
		    		String[] elements = arrIndex[i].split("\n");
		    		for(int j = 0 ; j < elements.length; j ++){
		    			//又是一个特别想用回调函数的地方。
		    			String element = elements[j];
		    			//一共五列：站号	站名	最小相对湿度	等级	指数类别  《------》 站点号|发布日期|指数类型|级别|提示语|描述  这里显然需要用到StringBuffer了，并且StringBuffer是线程安全的。，虽然不知道线程安全有个什么卵用。
		    			String [] columns = element.split("\t");
		    			//发布日期从哪里获得？？？
		    			sb.append(columns[0]).append("|").append("发布日期").append("|").append(columns[4]).append("|")
		    			.append(columns[3]).append("|").append("提示语").append("|").append("描述").append("\n");
		    		}
		    		
		    	}else{
		    		String element = arrIndex[i];
		    		//又是一个特别想用回调函数的地方。
		    		String [] columns = element.split("\t");
		    		sb.append(columns[0]).append("|").append("发布日期").append("|").append(columns[4]).append("|")
	    			.append(columns[3]).append("|").append("提示语").append("|").append("描述").append("\n");
		    		
		    	}
		}
		
		
		return sb.toString();
		
	}
	
	/**
	 * 传进来的时候是什么格式？
	 * 格式不固定
	 * 			站号	站名	最小相对湿度	等级	指数类别
	 * 			54624	黄骅	9999	2	舒适度指数
	 * 需要什么样的格式：
	 * 			站点号|发布日期|指数类型|级别|提示语|描述
				53781|2018-01-10 08:00|晨练指数|3|较适宜|请适当减少运动时间，降低运动强度。
				53781|2018-01-10 08:00|感冒指数|5|易发|天冷风大，易感冒，注意防护。
	 * @param indexStr
	 * @return
	 */
	@Deprecated
	private String processRS(String indexStr) {
		String[] hh = indexStr.split("站号\\s+站名\\s+最小相对湿度\\s+等级\\s+指数类别\\s+");
//		System.out.println(hh);
		String srcFileName = hh[0];
		
//		System.out.println("srcFileName ---- > " + srcFileName);
		StringBuffer sb = new StringBuffer();
		for(int i = 1 ; i < hh.length; i ++){
			String[] hhh = hh[i].split("\n");
			for(int j = 0 ; j < hhh.length; j++){
//				System.out.println(hhh[j]);
				String[] ss = hhh[j].split("\\s+");
//				System.out.println(ss[0] + "---" + ss[1] +"---"+ ss[2] + "---" + ss[3] + "---" +ss[4] );
				
				//在这里组织数据   //这里用回调函数感觉会看的很牛X
				sb.append(ss[0]).append("|").append("发布日期").append("|")
				.append(ss[4]).append("|").append(ss[3]).append("|")
				.append("提示语").append("|").append("描述").append("\r\n");
				
			}
		}
		System.out.println(sb.toString());
		
		
		
		return null;
	}

	   public static void readFileByLines(String fileName) {
	        File file = new File(fileName);
	        BufferedReader reader = null;
	        try {
	            System.out.println("以行为单位读取文件内容，一次读一整行：");
	            reader = new BufferedReader(new FileReader(file));
	            String tempString = null;
	            int line = 1;
	            // 一次读入一行，直到读入null为文件结束
	            while ((tempString = reader.readLine()) != null) {
	                // 显示行号
	                System.out.println("line " + line + ": " + tempString);
	                line++;
	            }
	            reader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e1) {
	                }
	            }
	        }
	    }
	

	
    /**
     * 以字符为单位读取文件，常用于读文本，数字等类型的文件
     */
    public static String readFileByChars(String fileName) {
        File file = new File(fileName);
        Reader reader = null;
        
        StringBuffer sb = new StringBuffer();
        
        try {
//            System.out.println("以字符为单位读取文件内容，一次读多个字节：");
            // 一次读多个字符
            char[] tempchars = new char[1024];
            int charread = 0;
            reader = new InputStreamReader(new FileInputStream(fileName),"gbk");
            // 读入多个字符到字符数组中，charread为一次读取字符数
            while ((charread = reader.read(tempchars)) != -1) {
                // 同样屏蔽掉\r不显示
                if ((charread == tempchars.length)
                        && (tempchars[tempchars.length - 1] != '\r')) {
//                    System.out.print(tempchars);
                    sb.append(tempchars);
                } else {
                    for (int i = 0; i < charread; i++) {
                        if (tempchars[i] == '\r') {
                            continue;
                        } else {
                        	sb.append(tempchars[i]);
//                            System.out.print(tempchars[i]);
                        }
                    }
                }
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
		return sb.toString();
    }

}
