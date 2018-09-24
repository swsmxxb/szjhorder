package com.szjc.OrderManag;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.UUID;

@SpringBootApplication
public class OrderManagApplication {

	public static void main(String[] args) throws UnirestException {
		SpringApplication.run(OrderManagApplication.class, args);

//		try {
//			String requestBody = "{\"id\":\"123\"}";
//			HttpResponse<String> responseApi = Unirest.post("http://192.168.1.120:8080").header("cache-control", "no-cache")
//					.body(requestBody).asString();
//			String jsData= JSONObject.fromObject(responseApi.getBody()).getString("subscribe_data");
//
//			System.out.println(jsData);
//		}catch (Exception e  ) {
//
//
//			e.printStackTrace();
//		}

      // UUID
		String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
         System.out.println(uuid);
	}
}
