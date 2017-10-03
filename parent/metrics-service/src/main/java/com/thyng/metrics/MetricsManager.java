package com.thyng.metrics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thyng.model.Metric;

@Service
public class MetricsManager {

	@Autowired
	private MetricsRepository metricsRepository;
	
	public void save(final String organizationId, final String thingId, final Metric<?> metric) {
		metricsRepository.persist(organizationId, thingId, metric);
	}

}
