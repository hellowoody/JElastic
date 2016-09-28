package com.elastic.common.client.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import com.elastic.common.client.ElasticBusiness;
import com.elastic.common.client.ElasticClient;
import com.jfinal.kit.PropKit;
/**
 * @author woody
 * @date 20160928
 * @创建elastic 客户端 获取 配置文件中的地址和端口号
 * */
public class ElasticClientImpl implements ElasticClient{
	private TransportClient client = null;
	@Override
	public void doClient(ElasticBusiness business) {
		try {
			client = TransportClient.builder().build()
			        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(PropKit.get("elasticName").toString()), Integer.parseInt(PropKit.get("elasticPort"))));
			business.doBusiness(client);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}finally{
			client.close();
		}
	}
}
