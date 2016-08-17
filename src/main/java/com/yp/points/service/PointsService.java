package com.yp.points.service;

import java.util.HashMap;
import java.util.Map;

public class PointsService {

    public static final int DEFAULT_POINT = 0;
    private Map<String, Integer> userPointsMap = new HashMap<String, Integer>();

    public int getPoints(String name) {
        if (this.userPointsMap.containsKey(name)) {
            return userPointsMap.get(name);
        }
        return DEFAULT_POINT;
    }

    public void setPoints(String name, int points) {
        this.userPointsMap.put(name, points);
    }

    public void giveSession(String name) {

        userPointsMap.put(name , 10);
    }
}
