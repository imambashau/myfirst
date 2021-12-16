package com.wipro.myfirst.model;

import org.springframework.data.annotation.Id;

public class FirstModel {
    @Id
    public Integer sno;
    public String name;
    public String address;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
