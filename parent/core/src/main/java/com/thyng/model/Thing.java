package com.thyng.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@EqualsAndHashCode(callSuper=true)
public class Thing extends AuditedEntity{
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String key;
	
	@Column(nullable=false)
	private String name;
	
	private String description;
	
	@ManyToOne
	private Template template;
	
	@Embedded
	private Coordinates coordinates;
	
	private Boolean alive;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastEvent;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastBeat;
	
}
