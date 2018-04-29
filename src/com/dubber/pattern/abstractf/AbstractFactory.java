package com.dubber.pattern.abstractf;

import com.dubber.pattern.GreenPlants;
import com.dubber.pattern.Wenzhu;

/**
 * 抽象工厂模式
 *
 * 符合开闭原则： 对扩展开放，对修改关闭。
 * Created by dubber on 2018/4/29.
 */
public abstract class AbstractFactory {
    abstract GreenPlants getLvluo();
    abstract GreenPlants getDiaolan();
    abstract GreenPlants getWenzhu();
}
