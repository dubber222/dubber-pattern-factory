package com.dubber.pattern.abstractf;

/**
 * Created by dubber on 2018/4/29.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        //对用户而言更加简洁
        //用户只有选择的权利，保证了程序的健壮性。
        System.out.println(new AbstractFactoryImpl().getDiaolan().getGreenPlantsName());
    }
}
