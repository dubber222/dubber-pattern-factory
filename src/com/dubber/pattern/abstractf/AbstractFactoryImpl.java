package com.dubber.pattern.abstractf;

import com.dubber.pattern.Diaolan;
import com.dubber.pattern.GreenPlants;
import com.dubber.pattern.Lvluo;
import com.dubber.pattern.Wenzhu;

/**
 * Created by dubber on 2018/4/29.
 */
public class AbstractFactoryImpl extends AbstractFactory{
    @Override
    GreenPlants getLvluo() {
        return new Lvluo();
    }

    @Override
    GreenPlants getDiaolan() {
        return new Diaolan();
    }

    @Override
    GreenPlants getWenzhu() {
        return new Wenzhu();
    }
}
