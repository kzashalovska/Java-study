package org.example.practice.practice6;

import java.util.HashMap;
import java.util.Map;

import static org.example.practice.practice6.MySchedule.mapPrint;

public class App2 {
    public static void main(String[] args) {
        Map<Integer, String> scheduleInfo = new HashMap<>();
        scheduleInfo.put(100,"100");
        scheduleInfo.put(200,"200");
        scheduleInfo.put(300,"300");
        scheduleInfo.put(400,"400");
        scheduleInfo.put(500,"500");
        scheduleInfo.put(600,"600");
        scheduleInfo.put(700,"700");
        scheduleInfo.put(800,"800");
        scheduleInfo.put(900,"900");
        scheduleInfo.put(1000,"1000");


        mapPrint(scheduleInfo);
    }
}
