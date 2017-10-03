package com.thyng.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import lombok.Data;

@Data
@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "valueType")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BooleanMetric.class, name = "BOOLEAN"),
    @JsonSubTypes.Type(value = NumberMetric.class, name = "NUMBER"),
    @JsonSubTypes.Type(value = TextMetric.class, name = "TEXT")
})
public class Metric<T> {
	
	private T value;
	
	private Date date;

	private String propertyKey;
	
	private MetricValueType valueType;
	
}
