package com.thyng.model;

public class NumberMetric extends Metric<Double> {

	@Override
	public MetricValueType getValueType() {
		return MetricValueType.NUMBER;
	}
	
}
