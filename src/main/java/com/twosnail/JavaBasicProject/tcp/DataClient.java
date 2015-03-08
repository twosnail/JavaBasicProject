package com.twosnail.JavaBasicProject.tcp;
/**
 * <b>Description:</b></br> 
 * <b>Title:</b>360问医生后台管理
 * @company:7dosoft
 * @author: txd
 * @Date: 2015年3月6日下午3:49:37
 * @version 1.0
 */

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
//客户端取出浮点型数据pi值
public class DataClient {
	public static void main(String[] args) {

		try {
			Socket socket = new Socket(args[0],1234);
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			float f = dis.readFloat();
			System.out.println("PI="+f);
			dis.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
