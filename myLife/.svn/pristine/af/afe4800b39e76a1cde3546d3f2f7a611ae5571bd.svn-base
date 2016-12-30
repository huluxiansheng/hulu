package com.myLife.tools;

import java.security.MessageDigest;

public class EncryptionTool {

	    /*** 
	     * MD5加密 生成32位md5码
	     * @param 待加密字符串
	     * @return 返回32位md5码
	     */
	    public static String MD5(String inStr) {
	        MessageDigest md5 = null;
	        StringBuffer hexValue = new StringBuffer();
	        try {
	            md5 = MessageDigest.getInstance("MD5");
		        byte[] byteArray = inStr.getBytes("UTF-8");
		        byte[] md5Bytes = md5.digest(byteArray);
		        for (int i = 0; i < md5Bytes.length; i++) {
		            int val = ((int) md5Bytes[i]) & 0xff;
		            if (val < 16) {
		                hexValue.append("0");
		            }
		            hexValue.append(Integer.toHexString(val));
		        }
	        } catch (Exception e) {
	            System.out.println(e.toString());
	            e.printStackTrace();
	            return "";
	        }

	        return hexValue.toString();
	    }
	    
	    /*** 
	     * SHA加密 生成40位SHA码
	     * @param 待加密字符串
	     * @return 返回40位SHA码
	     */
	    public static String SHA(String inStr) {
	        MessageDigest sha = null;
	        StringBuffer hexValue = new StringBuffer();
	        try {
	            sha = MessageDigest.getInstance("SHA");
		        byte[] byteArray = inStr.getBytes("UTF-8");
		        byte[] md5Bytes = sha.digest(byteArray);
		        for (int i = 0; i < md5Bytes.length; i++) {
		            int val = ((int) md5Bytes[i]) & 0xff;
		            if (val < 16) { 
		                hexValue.append("0");
		            }
		            hexValue.append(Integer.toHexString(val));
		        }
	        } catch (Exception e) {
	            System.out.println(e.toString());
	            e.printStackTrace();
	            return "";
	        }

	        return hexValue.toString();
	    }
	    
	    
	    /**
	     * 测试主函数
	     * @param args
	     * @throws Exception
	     */
	    public static void main(String args[]) throws Exception {
	        String str = new String("大的");
	        System.out.println("原始：" + str);
	        System.out.println("MD5后：" + MD5(str));
	        System.out.println("原始：" + str);
	        System.out.println("SHA后：" + SHA(str));
	    }
}
