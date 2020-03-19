package org.when.test.event_bus;

import java.util.concurrent.Executor;

/**
 * @author: when
 * @create: 2020-03-19  11:46
 **/
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
