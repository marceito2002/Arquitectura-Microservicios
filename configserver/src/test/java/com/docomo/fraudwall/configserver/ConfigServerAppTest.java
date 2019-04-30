package com.docomo.fraudwall.configserver;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
public class ConfigServerAppTest
{

	private int port = 9090;

//	@Test
//	public void configurationAvailableTracking() {
//		@SuppressWarnings("rawtypes")
//		ResponseEntity<Map> entity = new TestRestTemplate()
//				.getForEntity("http://localhost:" + port + "/configserver/tracking", Map.class);
//		assertEquals(HttpStatus.OK, entity.getStatusCode());
//	}
//
//	@Test
//	public void configurationAvailablePartner() {
//		@SuppressWarnings("rawtypes")
//		ResponseEntity<Map> entity = new TestRestTemplate()
//				.getForEntity("http://localhost:" + port + "/configserver/partner", Map.class);
//		assertEquals(HttpStatus.OK, entity.getStatusCode());
//	}
}
