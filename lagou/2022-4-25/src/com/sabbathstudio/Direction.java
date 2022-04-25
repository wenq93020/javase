package com.sabbathstudio;

public class Direction {

    private final String desc;

    public static final Direction UP = new Direction("向上");
    public static final Direction DOWN = new Direction("向下");
    public static final Direction LEFT = new Direction("向左");
    public static final Direction RIGHT = new Direction("向右");




    private Direction(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

}
