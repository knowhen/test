package org.when.test;

import org.when.test.event_bus.AsyncEventBus;
import org.when.test.event_bus.EventBus;

import java.util.concurrent.Executors;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //同步阻塞
        EventBus eventBus = new EventBus();
        //异步非阻塞
        EventBus asyncEventBus = new AsyncEventBus(Executors.newFixedThreadPool(8));

        eventBus.register(new AObserver());
        eventBus.register(new BObserver());
        eventBus.register(new CObserver());

        eventBus.post(new XMessage());
        eventBus.post(new YMessage());
    }
}
