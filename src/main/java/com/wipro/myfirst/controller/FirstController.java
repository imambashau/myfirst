package com.wipro.myfirst.controller;

import com.wipro.myfirst.model.FirstModel;
import com.wipro.myfirst.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirstController {
	//Autowired1
    @Autowired
    FirstService firstService;



    
    @PostMapping("/cre")
    public void fCreate(@RequestBody FirstModel firstModel){
        firstService.create(firstModel);
    }
    @GetMapping("/get")
    public List<FirstModel> fInvoke(){
       return firstService.invoke();
    }
}
