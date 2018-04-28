package com.dubber.pattern.simple;

import com.dubber.pattern.Diaolan;
import com.dubber.pattern.GreenPlants;
import com.dubber.pattern.Lvluo;
import com.sun.deploy.util.StringUtils;

/**
 * Created on 2018/4/28.
 *
 * @author dubber
 */
public class GreenPlantsFactory {

    public GreenPlants getGreenPlants(String type){
        if(type == null || type == ""){
            return null;
        }

        if("Lvluo".equals(type)){
            return new Lvluo();
        }

        if("Diaolan".equals(type)){
            return new Diaolan();
        }
        return null;
    }
}
