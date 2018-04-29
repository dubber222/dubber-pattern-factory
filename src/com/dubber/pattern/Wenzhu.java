package com.dubber.pattern;

/**
 * Created by dubber on 2018/4/29.
 */
public class Wenzhu implements GreenPlants{
    @Override
    public String getGreenPlantsName() {
        return "植物名称：文竹";
    }

    @Override
    public void canfreshAir() {
        System.out.println("文竹可以喜悦人心情！");
    }
}
