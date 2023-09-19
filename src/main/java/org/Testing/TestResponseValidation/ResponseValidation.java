package org.Testing.TestResponseValidation;

import io.restassured.response.Response;

public class ResponseValidation {

	public void responseValidation(Response Res) {
		System.out.println(Res.getStatusCode());
		System.out.println(Res.getStatusLine());
	}
}
