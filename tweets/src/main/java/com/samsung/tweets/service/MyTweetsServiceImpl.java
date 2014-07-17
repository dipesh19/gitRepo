package com.samsung.tweets.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.samsung.tweets.util.RestHttpClient;

@Path("/tweets")
public class MyTweetsServiceImpl {

	private static final Logger logger = Logger
			.getLogger(MyTweetsServiceImpl.class);
	private RestHttpClient client;

	@GET
	@Path("/search")
	@Produces("application/json")
	public Response getTweets(@QueryParam("q") String name,
			@QueryParam("location") String location) {
		logger.info("Executing getTweets : " + this.getClass().getName());
		client = new RestHttpClient();
		return Response.ok().build();
	}

	/**
	 * @return the client
	 */
	public RestHttpClient getClient() {
		return client;
	}

	/**
	 * @param client
	 *            the client to set
	 */
	public void setClient(RestHttpClient client) {
		this.client = client;
	}

}
