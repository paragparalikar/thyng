package com.thyng.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.querydsl.core.types.dsl.StringPath;
import com.thyng.model.QTemplate;
import com.thyng.model.Template;

@RepositoryRestResource(collectionResourceRel = "templates", path = "templates")
public interface TemplateRepository extends PagingAndSortingRepository<Template, String>,QueryDslPredicateExecutor<Template>, QuerydslBinderCustomizer<QTemplate>  {

	@Override
	default public void customize(QuerydslBindings bindings, QTemplate root) {
		bindings.bind(String.class).first((StringPath path, String value) -> path.containsIgnoreCase(value));
	}
	
}
