package com.example.demo.restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {
    private String uuid;



    public Restaurant(){}
    public Restaurant(String uuid) {
        this.uuid = uuid;

    }


    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }


}
