package com.dubber.pattern;

/**
 * Created on 2018/4/28.
 *
 * @author dubber
 */
public class Lvluo implements GreenPlants{
    @Override
    public String getGreenPlantsName() {
        return "绿植名称：绿萝";
    }

    @Override
    public void canfreshAir() {
        System.out.println("净化综合空气！");
    }
}
