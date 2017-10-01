package com.thyng.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.thyng.model.Thing;

@RepositoryRestResource(collectionResourceRel = "things", path = "things")
public interface ThingRepository extends PagingAndSortingRepository<Thing, String>{

}
