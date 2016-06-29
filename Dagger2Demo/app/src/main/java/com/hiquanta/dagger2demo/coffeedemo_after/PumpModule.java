package com.hiquanta.dagger2demo.coffeedemo_after;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hiquanta on 2016/6/28.
 */
@Module
public class PumpModule {
    @Provides Pump providePump(Thermosiphon pump){
        return pump;
    }
}
