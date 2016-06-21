package com.moon.sequence.demo;

import java.io.UnsupportedEncodingException;

import com.github.zkclient.ZkClient;

public class Demo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		ZkClient client = ZKManager.getInstance();
		String data = new String(client.readData("/wuey"), "utf-8");
		System.out.println(data);
	}
}
