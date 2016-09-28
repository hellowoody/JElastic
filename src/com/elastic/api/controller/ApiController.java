package com.elastic.api.controller;

import com.elastic.api.indices.CreateIndices;
import com.elastic.api.indices.CreateIndicesSetting;
import com.elastic.api.indices.GetIndice;
import com.elastic.api.indices.InsertRecords;
import com.elastic.api.indices.QueryIndices;
import com.elastic.common.client.ElasticClient;
import com.elastic.common.client.impl.ElasticClientImpl;
import com.jfinal.core.Controller;

public class ApiController extends Controller{
	ElasticClient client = new ElasticClientImpl();
	public void createIndices()
	{
		client.doClient(new CreateIndices());
		renderJson("{createIndices:'ok'}");
	}
	public void createIndicesSetting()
	{
		client.doClient(new CreateIndicesSetting());
		renderJson("{createIndicesSetting:'ok'}");
	}
	public void insertRecords()
	{
		client.doClient(new InsertRecords());
		renderJson("{InsertRecords:'ok'}");
	} 
	public void getIndice()
	{
		GetIndice getIndice = new GetIndice();
		client.doClient(getIndice);
//		renderJson("{getIndice:'ok'}");
		renderJson(getIndice.getRes());
	}
	public void queryIndices()
	{
		QueryIndices queryIndices = new QueryIndices();
		client.doClient(queryIndices);
		renderJson(queryIndices.getRes());
	}
}
