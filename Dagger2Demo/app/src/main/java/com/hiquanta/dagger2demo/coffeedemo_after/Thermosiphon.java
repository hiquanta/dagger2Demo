package com.hiquanta.dagger2demo.coffeedemo_after;

import javax.inject.Inject;

/**
 * Created by hiquanta on 2016/6/28.
 */

/**
 * 虹吸幫浦(虹吸，剛好也需要加熱器)
 */
public class Thermosiphon implements Pump {
    private final Heater heater;
    @Inject
    Thermosiphon(Heater heater) {
        this.heater = heater;
    }
    @Override
    public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
