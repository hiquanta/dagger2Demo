package com.hiquanta.dagger2demo.coffeedemo_before;

import com.hiquanta.dagger2demo.coffeedemo_after.*;



/**
 * Created by hiquanta on 2016/6/28.
 */
public class Thermosiphon implements Pump {
    private final Heater heater;

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
