package com.hiquanta.dagger2demo.coffeedemo_after;

/**
 * Created by hiquanta on 2016/6/28.
 */

/**
 * 加熱器
 */
interface Heater {
    void on();

    void off();

    boolean isHot();
}
