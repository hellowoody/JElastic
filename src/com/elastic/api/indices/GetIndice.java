package com.elastic.api.indices;

import java.util.Map;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;

import com.elastic.common.client.ElasticBusiness;
/**
 * @author woody
 * @date 20160928
 * @根据索引和type 获取索引中内容
 * */
public class GetIndice implements ElasticBusiness
{
	private String res = "";
	@Override
	public void doBusiness(TransportClient client) {
		GetResponse response = client.prepareGet("apitest01", "tweet", "1").get();
		Map<String, Object> map = response.getSource();
		System.out.println("keyset========"+map.keySet());
		System.out.println("values========"+map.values());
		setRes(map.toString());
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
}
