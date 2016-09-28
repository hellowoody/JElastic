package com.elastic.api.indices;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilders;

import com.elastic.common.client.ElasticBusiness;
/**
 * @author woody
 * @date 20160928
 * @查询索引
 * */
public class QueryIndices implements ElasticBusiness{

	private String res = "";
	@Override
	public void doBusiness(TransportClient client) {
		SearchResponse response = client.prepareSearch("apitest01")
		        .setTypes("tweet")
		        .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
		        .setQuery(QueryBuilders.termQuery("user", "kimchy"))                 // Query
		        .setFrom(0).setSize(60).setExplain(true)
		        .execute()
		        .actionGet();
		setRes(response.toString());
		System.out.println("response================>>"+response);
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}

}
