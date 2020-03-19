package org.when.test;

import org.when.test.event_bus.Subscribe;

/**
 * @author: when
 * @create: 2020-03-19  14:26
 **/
public class CObserver {
    @Subscribe
    public void f1(ZMessage event) {
        System.out.println("C observer f1 received " + event.toString());
    }
}
