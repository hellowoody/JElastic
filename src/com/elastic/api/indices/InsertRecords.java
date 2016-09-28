package com.elastic.api.indices;

import java.io.IOException;
import java.util.Date;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentBuilder;

import static org.elasticsearch.common.xcontent.XContentFactory.*;

import com.elastic.common.client.ElasticBusiness;
/**
 * @author woody
 * @date 20160928
 * @新增或修改一条索引
 * */
public class InsertRecords implements ElasticBusiness{

	@Override
	public void doBusiness(TransportClient client) {
		XContentBuilder builder;
		try {
			builder = jsonBuilder().startObject()
							        .field("user", "kimchy")
							        .field("postDate", new Date())
							        .field("message", "trying out Elasticsearch")
							    .endObject();
//			String json = "{" +
			//	        "\"user\":\"kimchy\"," +
			//	        "\"postDate\":\"2013-01-30\"," +
			//	        "\"message\":\"trying out Elasticsearch\"" +
			//	    "}";
			IndexResponse response = client.prepareIndex("apitest01", "tweet", "2")
			        .setSource(builder).get();
			boolean created = response.isCreated();
			System.out.println("==========>>"+created);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
