package com.thyng.model;

public class BooleanMetric extends Metric<Boolean> {

	@Override
	public MetricValueType getValueType() {
		return MetricValueType.BOOLEAN;
	}
	
}
