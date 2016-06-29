package com.hiquanta.dagger2demo.coffeedemo_before;

/**
 * Created by hiquanta on 2016/6/28.
 */
public class CoffeeMaker {
    private final Heater heater; // 加熱器
    private final Pump pump; // 幫浦

    CoffeeMaker() {
        this.heater = new ElectricHeater(); // 電熱器
        this.pump = new Thermosiphon(heater); // 虹吸幫浦(虹吸，剛好也需要加熱器)
    }

    public void brew() {
        heater.on();// 加熱
        pump.pump();// 加壓
        System.out.println(" [_]P coffee! [_]P ");// 熱騰騰的咖啡出爐囉！
        heater.off();// 隨手關加熱器
    }
}
