package com.dubber.pattern;

/**
 * Created on 2018/4/28.
 *
 * @author dubber
 */
public class Diaolan implements GreenPlants{
    @Override
    public String getGreenPlantsName() {
        return "绿植名称：吊兰";
    }

    @Override
    public void canfreshAir() {

        System.out.println("净化甲醛！");
    }
}
