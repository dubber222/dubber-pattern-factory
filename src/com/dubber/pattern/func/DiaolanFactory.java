package com.dubber.pattern.func;

import com.dubber.pattern.Diaolan;
import com.dubber.pattern.GreenPlants;

/**
 * Created by dubber on 2018/4/29.
 */
public class DiaolanFactory implements Factory{
    @Override
    public GreenPlants getGreenPlants() {
        return new Diaolan();
    }
}
