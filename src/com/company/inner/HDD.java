package com.company.inner;

public class HDD {

    String title;
    int volume;
    String type;

    public HDD(){
        title = "HDD";
        volume = 512;
        type = "WD";
    }

    public HDD(String title, int volume,
               String type){
        this.title = title;
        this.volume = volume;
        this.type = type;
    }
}
