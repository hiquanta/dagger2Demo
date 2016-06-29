package com.hiquanta.dagger2demo.coffeedemo_after;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * Created by hiquanta on 2016/6/28.
 */

/**
 * 咖啡機
 */
public class CoffeeMaker {
    private final Lazy<Heater> heater; // 加熱器
    private final Pump pump;//幫浦

    /**
     *   準備幫浦與加熱器
     * @param heater
     * @param pump
     */
    @Inject
    CoffeeMaker(Lazy<Heater> heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    /**
     * 沖泡
     */
    public void brew() {
        heater.get().on();// 加熱
        pump.pump();// 加壓
        System.out.println(" [_]P coffee! [_]P ");// 熱騰騰的咖啡出爐囉！
        heater.get().off();// 隨手關加熱器
    }
}
