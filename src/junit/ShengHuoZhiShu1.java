package junit;

import java.net.MalformedURLException;
import java.net.UnknownHostException;

import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbException;
import jcifs.smb.SmbFile;
import util.DiskUtil;
import util.FileUtil;

public class ShengHuoZhiShu1 {

	public void run(){
		
		
		String domainip="10.48.38.231";
		String username="fwzx";
		String password="fwzx";
		String remoteurl="smb://10.48.38.231";
//		String smburl = "smb://administrator:123@10.1.44.193/data";
		String fileName = "生活指数2018011217.txt";
		String dir = "ShengHuoZhiShu";
//		SmbFile fp = new SmbFile(smburl+"//"+dir);
		NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(domainip, username, password);
		SmbFile ss = null;
		String rs = null;
		try {
			ss = new SmbFile(remoteurl+"/"+dir +"/" + fileName,auth);
			 rs = FileUtil.getProcessContent2(ss);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SmbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(rs);
		String pResult = DiskUtil.processRS2(rs);
		System.out.println(pResult);
		
		String fileName1 = "shenghuozhishu.txt";
		String filePath = "E:\\";
		FileUtil.saveToLocal(pResult,fileName1,filePath);
	}
	
	public static void main(String[] args) {
		ShengHuoZhiShu1 shzs = new ShengHuoZhiShu1();
		shzs.run();
	}
}
