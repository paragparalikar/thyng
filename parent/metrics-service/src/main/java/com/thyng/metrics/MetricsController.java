package com.thyng.metrics;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thyng.model.Metric;

@RestController
@RequestMapping("/metrics")
public class MetricsController {
	
	@Autowired
	private MetricsManager metricsManager;

	@RequestMapping(value = "/{organizationId}/{thingId}", method = RequestMethod.POST)
	public void post(@PathParam("organizationId") String organizationId, @PathParam("thingId") String thingId,
			@RequestBody Metric<?> metric) {
		metricsManager.save(organizationId, thingId, metric);
	}

}
