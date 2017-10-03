package com.thyng.metrics;

import org.springframework.stereotype.Repository;

import com.thyng.model.Metric;

@Repository
public class MetricsRepository {
	
	public void persist(final String organizationId, final String thingId, final Metric<?> metric) {
		
	}
	
}
