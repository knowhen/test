package org.when.test;

import org.when.test.event_bus.Subscribe;

/**
 * @author: when
 * @create: 2020-03-19  14:26
 **/
public class BObserver {

    @Subscribe
    public void f1(XMessage event) {
        System.out.println("B observer f1 received " + event.toString());
    }

    @Subscribe
    public void f2(YMessage event) {
        System.out.println("B observer f2 received " + event.toString());
    }
}
