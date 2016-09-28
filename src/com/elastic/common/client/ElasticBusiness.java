package com.elastic.common.client;

import org.elasticsearch.client.transport.TransportClient;

/**
 * @author woody
 * @date 20160928
 * @操作具体业务的接口
 * */
public interface ElasticBusiness 
{
	public void doBusiness(TransportClient client);
}
