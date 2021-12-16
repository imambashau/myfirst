package com.wipro.myfirst.service;

import com.wipro.myfirst.model.FirstModel;
import com.wipro.myfirst.repository.FirstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstService {
 @Autowired
    FirstRepository firstRepository;
 public void create(FirstModel firstModel){
     firstRepository.save(firstModel);
 }
 public List<FirstModel> invoke(){
    return firstRepository.findAll();
 }
}
