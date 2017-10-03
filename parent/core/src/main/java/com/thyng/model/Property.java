package com.thyng.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.rest.core.annotation.RestResource;

@Data
@Entity
@EqualsAndHashCode(callSuper=true)
public class Property extends AuditedEntity{

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String key;
	
	@Column(nullable=false)
	private String name;
	
	private String unit;
	
	private Boolean readable;
	
	private Boolean writable;
	
	@ManyToOne
	@RestResource(exported=false)
	private Template template;
	
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	private MetricValueType type;
	
}
