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
		String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
System.out.println(uuid);

	}
}
