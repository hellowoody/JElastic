package com.elastic.common.client;

/**
 * @author woody
 * @date 20160928
 * @elastic 客户端接口 并声明doClient方法
 * */
public interface ElasticClient
{
	public void doClient(ElasticBusiness business);
}
