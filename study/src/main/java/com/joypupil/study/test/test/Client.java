package com.joypupil.study.test.test;

import net.sf.json.JSONObject;

public class Client {
	
	public static void main(String args[]){
		//获取到URL以及一些参数
		String url = "http://119.29.15.229:8080/data/4b3992856b8e4f879dbe35634c98df55/ff8080815885cf05015885ed69e70002/2/xdatapower/id";
		//发出请求并获取到响应结果
		System.out.println(HttpUtil.doGet(url));
//		JSONObject json = new JSONObject();
//		json.accumulate("projectId", "ff808081576527d901576548d4950085");
//		json.accumulate("documentId", "4b3992856b8e4f879dbe35634c98df55");
//		json.accumulate("versionId", "ff8080815885cf05015885ed69e70002");
//		json.accumulate("viewId", "xdatapower");
//		json.accumulate("viewType", 2);
//		json.accumulate("type", "geo");
//		json.accumulate("index", 1);
//		System.out.println(HttpUtil.doPost(url, json));
		//存储响应结果
	}

}
