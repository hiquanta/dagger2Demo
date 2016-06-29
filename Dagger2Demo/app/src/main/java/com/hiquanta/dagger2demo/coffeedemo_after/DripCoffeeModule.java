package com.hiquanta.dagger2demo.coffeedemo_after;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hiquanta on 2016/6/28.
 */
@Module(includes = PumpModule.class)// 一同準備加壓器具
public class DripCoffeeModule {// 濾泡裝置
    @Provides
    @Singleton
    Heater provideHeater() {// 提供共用的加熱器具
        return new ElectricHeater();// 電熱器具
    }
}
