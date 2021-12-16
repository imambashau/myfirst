package com.wipro.myfirst.repository;

import com.wipro.myfirst.model.FirstModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstRepository extends MongoRepository<FirstModel,Integer> {
}
