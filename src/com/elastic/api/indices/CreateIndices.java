package com.elastic.api.indices;

import org.elasticsearch.client.transport.TransportClient;

import com.elastic.common.client.ElasticBusiness;
/**
 * @author woody
 * @date 20160928
 * @创建索引
 * */
public class CreateIndices implements ElasticBusiness{
	@Override
	public void doBusiness(TransportClient client) {
		client.admin().indices().prepareCreate("apitest02").get(); 
	}
}
