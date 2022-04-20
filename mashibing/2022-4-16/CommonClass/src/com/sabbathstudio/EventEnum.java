package com.sabbathstudio;

public enum EventEnum {
    LAUNCH("launch"),PAGEVIEW("pageview"),EVENT("event");

    EventEnum(String name){
        this.name = name;
    }

    private String name;

    public void show(){
        System.out.println(this.name);
    }
}
