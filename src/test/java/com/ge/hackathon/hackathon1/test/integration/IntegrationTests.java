package com.ge.hackathon.hackathon1.test.integration;

import com.ge.hackathon.hackathon1.api.V1Hackathon1UrlGenerator;
import com.ge.hackathon.hackathon1.api.dto.SomeResponse;
import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

/**
 * Created by JGREEN on 12/18/2015.
 */

public class IntegrationTests {
	private RestTemplate restTemplate = new RestTemplate();

	private V1Hackathon1UrlGenerator urlGenerator = new V1Hackathon1UrlGenerator();

	private ParameterizedTypeReference<Resource<SomeResponse>> type = new ParameterizedTypeReference<Resource<SomeResponse>>() {};

	@Test
	public void test() {
		urlGenerator.setHost("http://hackathon1-development.cfapps.io/");
		restTemplate.exchange(urlGenerator.getUrl(), HttpMethod.GET, null, type);
	}
}
