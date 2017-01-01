package com.myLife.tools;

import java.security.MessageDigest;

public class EncryptionTool {

	    /*** 
	     * MD5���� ����32λmd5��
	     * @param �������ַ���
	     * @return ����32λmd5��
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
	     * SHA���� ����40λSHA��
	     * @param �������ַ���
	     * @return ����40λSHA��
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
	     * ����������
	     * @param args
	     * @throws Exception
	     */
	    public static void main(String args[]) throws Exception {
	        String str = new String("���");
	        System.out.println("ԭʼ��" + str);
	        System.out.println("MD5��" + MD5(str));
	        System.out.println("ԭʼ��" + str);
	        System.out.println("SHA��" + SHA(str));
	    }
}
