package com.dubber.pattern.func;

import com.dubber.pattern.Diaolan;
import com.dubber.pattern.GreenPlants;
import com.dubber.pattern.Lvluo;

/**
 * Created by dubber on 2018/4/29.
 */
public class LvluoFactory implements Factory {
    @Override
    public GreenPlants getGreenPlants() {
        return new Lvluo();
    }
}
