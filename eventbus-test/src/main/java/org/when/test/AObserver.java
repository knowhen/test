package org.when.test;

import org.when.test.event_bus.Subscribe;

/**
 * @author: when
 * @create: 2020-03-19  14:22
 **/
public class AObserver {
    @Subscribe
    public void f1(XMessage event) {
        System.out.println("A observer f1 received " + event.toString());
    }
}
