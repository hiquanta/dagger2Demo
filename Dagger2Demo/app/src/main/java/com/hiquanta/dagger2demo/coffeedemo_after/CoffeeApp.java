package com.hiquanta.dagger2demo.coffeedemo_after;

import javax.inject.Singleton;

import dagger.Component;

/**
 * https://yongjhih.gitbooks.io/feed/content/dagger2.html
 */
public class CoffeeApp {

  @Singleton// 共用咖啡機
  @Component(modules = { DripCoffeeModule.class })//濾泡裝置(安裝著高壓熱水沖泡裝置提供幫浦與加熱器)
  public interface Coffee {
    CoffeeMaker maker();
  }

  public static void main(String[] args) {
    Coffee coffee = DaggerCoffeeApp_Coffee.builder().build();
    coffee.maker().brew();
  }
}
