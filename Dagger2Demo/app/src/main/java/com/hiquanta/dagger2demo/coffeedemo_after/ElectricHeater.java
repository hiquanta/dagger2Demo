package com.hiquanta.dagger2demo.coffeedemo_after;

/**
 * Created by hiquanta on 2016/6/28.
 */

/**
 * 電熱器
 */
public class ElectricHeater implements Heater {
    boolean heating;
    @Override
    public void on() {
        System.out.println("~ ~ ~ heating ~ ~ ~");
        this.heating = true;
    }

    @Override
    public void off() {
        this.heating = false;
    }

    @Override
    public boolean isHot() {
          return heating;
    }
}
