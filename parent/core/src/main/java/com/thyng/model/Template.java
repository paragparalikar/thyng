package com.thyng.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.rest.core.annotation.RestResource;

@Data
@Entity
@EqualsAndHashCode(callSuper=true)
public class Template extends AuditedEntity {
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String key;
	
	@Column(nullable=false)
	private String name;
	
	private String description;
	
	@ManyToOne
	@RestResource(exported=false)
	private Organization organization;
	
	@OneToMany
	@RestResource
	private List<Property> properties;
	
	@OneToMany
	private List<Thing> things;

}
