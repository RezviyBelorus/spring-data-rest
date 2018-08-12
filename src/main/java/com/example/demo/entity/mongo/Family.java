package com.example.demo.entity.mongo;

import com.querydsl.core.annotations.QueryEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "family")
@QueryEntity
@Data
@NoArgsConstructor
public class Family {
    @Id
    private int id;
    private String name;
    private String surname;
    private int age;
}
