package com.example.demo.controller;

import com.example.demo.dao.mongo.FamilyDao;
import com.example.demo.entity.mongo.Family;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FamilyController {
    private final FamilyDao familyDao;

    @Autowired
    public FamilyController(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    @GetMapping("/controller")
    public Page<Family> findAll(Predicate predicate, Pageable pageable) {
        return familyDao.findAll(predicate, pageable);
    }
}
