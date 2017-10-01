package com.thyng.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=true)
public class Organization extends AuditedEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="organizationSequence")
	@SequenceGenerator(name="organizationSequence", sequenceName="ORG_SEQ",allocationSize=1, initialValue=1)
	private Long id;
	
	@NotNull
	@Column(nullable=false)
	private String name;
	
}
