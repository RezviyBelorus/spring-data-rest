package com.example.demo.dao.mongo;

import com.example.demo.entity.mongo.Family;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FamilyDao extends PagingAndSortingRepository<Family, Integer>, QuerydslPredicateExecutor<Family> {
    Page<Family> findAll(Predicate predicate, Pageable pageable);
}
