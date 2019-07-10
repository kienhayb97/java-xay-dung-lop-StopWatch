package com.company;

import java.util.Date;

public class StopWatch {
    Date startTime;
    Date endTime;

    public void setStartTime() {
        startTime=new Date();
    }

    public Date start(){
        return startTime;
    }
    public Date stop(){
        return endTime;
    }
    public long getElapsedTime(){
        endTime =new Date();
        return endTime.getTime()-startTime.getTime();
    }
}
