package com.example.demo.dao.mongo;

import com.example.demo.entity.mongo.Family;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Set;

@RepositoryRestResource(path = "family", collectionResourceRel = "family")
public interface FamilyDaoRest extends MongoRepository<Family, Integer>, QuerydslPredicateExecutor<Family> {
    @RestResource(path = "byName")
    Set<Family> findByNameStartsWith(@Param("name") String nameStartsWith);

    @RestResource(path = "predicate")
    Page<Family> findAll(Predicate predicate, Pageable pageable);
}
