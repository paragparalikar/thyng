package com.thyng.model;

public class TextMetric extends Metric<String> {

	@Override
	public MetricValueType getValueType() {
		return MetricValueType.TEXT;
	}
	
}
