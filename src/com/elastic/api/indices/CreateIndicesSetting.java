package com.elastic.api.indices;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;

import com.elastic.common.client.ElasticBusiness;
/**
 * @author woody
 * @date 20160928
 * @创建索引并设置配置属性
 * */
public class CreateIndicesSetting implements ElasticBusiness{

	@Override
	public void doBusiness(TransportClient client) {
		client.admin().indices().prepareCreate("apiindexsetting")
        .setSettings(Settings.builder().put("index.number_of_shards", 3).put("index.number_of_replicas", 2))
        .get();  
	}

}
