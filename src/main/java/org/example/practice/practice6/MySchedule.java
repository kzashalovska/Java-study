package org.example.practice.practice6;

import java.util.Map;

public class MySchedule {
    public static void mapPrint(Map<Integer, String> scheduleInfo){
        for (Map.Entry<Integer, String> schedule : scheduleInfo.entrySet()) {
            try {
                Thread.sleep(schedule.getKey());
                System.out.println(schedule.getValue());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
