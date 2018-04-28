package com.dubber.pattern.simple;

import com.dubber.pattern.GreenPlants;

/**
 * Created on 2018/4/28.
 *
 * @author dubber
 */
public class GreenPlantsFactoryTest {
    public static void main(String[] args) {
        GreenPlantsFactory greenPlantsFactory = new GreenPlantsFactory();
        GreenPlants greenPlants = greenPlantsFactory.getGreenPlants("Lvluo");
        System.out.println(greenPlants.getGreenPlantsName());
    }
}
