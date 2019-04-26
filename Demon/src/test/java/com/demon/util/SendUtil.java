package com.demon.util;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class SendUtil {

	/**
	 * �����ݷ��͸�URL
	 * 
	 * @param sendtext
	 * @param urll
	 * @param encoding
	 * @return
	 * @throws Exception
	 */
	public static String sendToUrl(String sendtext, String urll, String encoding) throws Exception {
		return sendToUrl(sendtext, urll, encoding, 10);
	}
	
	/**
	 * �����ݷ��͸�URL
	 * 
	 * @param sendtext
	 * @param urll
	 * @param encoding
	 * @return
	 * @throws Exception
	 */
	public static String sendToUrl(String sendtext, String urll) throws Exception {
		return sendToUrl(sendtext, urll, "utf-8", 10);
	}
	
	/**
	 * �����ݷ��͸�URL
	 * 
	 * @param sendtext
	 * @param urll
	 * @param encoding
	 * @return
	 * @throws Exception
	 */
	public static String sendToUrl(String urll) throws Exception {
		return sendToUrl("", urll, "utf-8", 10);
	}
	
	/**
	 * �����ݷ��͸�URL
	 * 
	 * @param sendtext
	 * @param urll
	 * @param encoding
	 * @return
	 * @throws Exception
	 */
	public static String sendToUrl(String sendtext, String urll,Integer seconds) throws Exception {
		return sendToUrl(sendtext, urll, "utf-8", seconds);
	}

	/**
	 * �����ݷ��͸�URL
	 * 
	 * @param sendtext
	 * @param urll
	 * @param encoding
	 * @return
	 * @throws Exception
	 */
	public static String sendToUrl(String sendtext, String urll, String encoding, Integer seconds) throws Exception {
		URL url = new URL(urll);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		int httpTimeOut = seconds * 1000;
		conn.setConnectTimeout(httpTimeOut);
		conn.setReadTimeout(httpTimeOut);
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setRequestProperty("Content-Type", "text/xml charset=" + encoding);
		conn.setRequestProperty("Accept-Charset", encoding);
		conn.setRequestMethod("POST");
		conn.connect();
		BufferedWriter output = null;
		try {
			output = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream(), encoding));
			output.write(sendtext);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (output != null) {
				output.flush();
				output.close();
			}
		}

		return readStreamText(conn.getInputStream(), encoding);
	}

	/**
	 * �����ж�ȡ��Ϣ�������request�����ж�ȡ���͹���������request.getInputStream()��
	 * 
	 * @param sendtext
	 * @param urll
	 * @param encoding
	 * @return
	 * @throws Exception
	 */
	public static String readStreamText(InputStream stream, String encoding) throws Exception {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(stream, encoding));
			String s = "";
			while ((s = br.readLine()) != null) {
				sb.append(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
		return sb.toString();
	}
}
