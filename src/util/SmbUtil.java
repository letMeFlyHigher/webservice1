package util;

import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbException;
import jcifs.smb.SmbFile;
import jcifs.smb.SmbFileInputStream;
import jcifs.smb.SmbFileOutputStream;

import org.junit.Test;

public class SmbUtil {

	
	/**
	 * java使用smb远程访问共享文件夹
	 * domainip="10.48.36.73";
	 * username="hbsqxt";
	 * password="admin+8900";
	 * remoteurl="smb://10.48.36.73/qxtfwcl";
	 * smburl = "smb://administrator:123@10.1.44.193/data";
	 * SmbFile fp = new SmbFile(smburl+"//"+dir);
	 * NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(domainip, username, password);  //先登录验证  
	 * SmbFile fp = new SmbFile(remoteurl+"//"+dir,auth);//上传
	 * @param localFilePath 源文件路径
	 * @param diskPath 目标文件名称
	 * @param newFileName 保存到磁盘上的文件名
	 * @param userName 用户名
	 * @param passWord 密码
	 * @return
	 */
	@Test
	public void testSmb() throws IOException{
		String domainip="10.48.38.231";
		String username="fwzx";
		String password="fwzx";
		String remoteurl="smb://10.48.38.231";
//		String smburl = "smb://administrator:123@10.1.44.193/data";
		String fileName = "生活指数2018011217.txt";
		String dir = "ShengHuoZhiShu";
//		SmbFile fp = new SmbFile(smburl+"//"+dir);
		NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(domainip, username, password);
		SmbFile ss = new SmbFile(remoteurl+"/"+dir +"/" + fileName,auth);
		String rs = FileUtil.getProcessContent2(ss);
		
		System.out.println(rs);
		
		
	}
	
	@Test
	public void testMySmb() throws IOException{
		String domainip="106.113.123.37";
		String username="user";
		String password="user";
		String remoteurl="smb://106.113.123.37";
//		String smburl = "smb://administrator:123@10.1.44.193/data";
		String fileName = "生活指数2018011111.txt";
		String dir = "e";
//		SmbFile fp = new SmbFile(smburl+"//"+dir);
		NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(domainip, username, password);
		SmbFile ss = new SmbFile(remoteurl+"/"+dir +"/" + fileName,auth);
		String rs = FileUtil.getProcessContent2(ss);
		
		System.out.println(rs);
		
		
	}
	
	@Test
	public void testMySmb3() throws IOException{
		String domainip="";
		String username="user";
		String password="user";
		String remoteurl="smb://1KI3JD9J76FCMOD";
//		String remoteurl="smb://192.168.1.101";

		String fileName = "生活指数2018011111.txt";
		String dir = "shenghuazhishu";
		String fileUrl = "smb://1KI3JD9J76FCMOD/shenghuazhishu/生活指数2018011111.txt";
//		SmbFile fp = new SmbFile(smburl+"//"+dir);
		NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(domainip, username, password);
//		SmbFile ss = new SmbFile(remoteurl+"/"+dir +"/" + fileName,auth);
		SmbFile ss = new SmbFile(fileUrl,auth);
		OutputStream os = new SmbFileOutputStream(ss);
//		String rs = FileUtil.getProcessContent2(ss);
		
//		System.out.println(rs);
		
		
	}
	
}
