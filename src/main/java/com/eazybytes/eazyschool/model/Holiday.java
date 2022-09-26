package com.eazybytes.eazyschool.model;

import lombok.Data;

import java.lang.reflect.Type;
@Data
public class Holiday {

    private final String day;
    private final String reason;
    private final Type type;


    public enum Type{
        FESTIVAL, FEDERAL
    }

    // press ctrl+f12 getter,setter all method are  now inbuilt using lombok dependency.

    /*public Holiday(String day, String reason, Type type) {
        this.day = day;
        this.reason = reason;
        this.type = type;
    }

    public String getDay() {
        return day;
    }

    public String getReason() {
        return reason;
    }

    public Type getType() {
        return type;
    }*/
}

