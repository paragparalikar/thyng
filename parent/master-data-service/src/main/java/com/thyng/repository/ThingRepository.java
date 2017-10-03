package com.thyng.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.querydsl.core.types.dsl.StringPath;
import com.thyng.model.QThing;
import com.thyng.model.Template;
import com.thyng.model.Thing;

@RepositoryRestResource(collectionResourceRel = "things", path = "things")
public interface ThingRepository extends PagingAndSortingRepository<Thing, String>,QueryDslPredicateExecutor<Template>, QuerydslBinderCustomizer<QThing>  {

	@Override
	default public void customize(QuerydslBindings bindings, QThing root) {
		bindings.bind(String.class).first((StringPath path, String value) -> path.containsIgnoreCase(value));
	}
	
}
