package com.moon.sequence.demo;

import com.github.zkclient.ZkClient;

public class ZKManager {
	private static ZkClient zkClient;

	private static final String SERVERS = "112.74.211.59:2181";

	public static synchronized ZkClient getInstance() {
		if (null == zkClient) {
			zkClient = new ZkClient(SERVERS);
		}
		return zkClient;
	}
}
