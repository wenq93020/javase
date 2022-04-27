package com.sabbathstudio;

public enum DirectionEnum {
    UP("向上"),DOWN("向下"),LEFT("向左"),RIGHT("向右");

    private final String desc;

//    public static final DirectionEnum UP = new DirectionEnum("向上");
//    public static final DirectionEnum DOWN = new DirectionEnum("向下");
//    public static final DirectionEnum LEFT = new DirectionEnum("向左");
//    public static final DirectionEnum RIGHT = new DirectionEnum("向右");



    private DirectionEnum(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

}
