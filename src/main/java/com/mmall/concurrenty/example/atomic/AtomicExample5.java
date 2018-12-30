package com.mmall.concurrenty.example.atomic;

import com.mmall.concurrenty.annoations.ThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

@Slf4j
@ThreadSafe
public class AtomicExample5 {
    /**
     * 执行原子性的修改
     */
    private static final AtomicIntegerFieldUpdater<AtomicExample5> updater = AtomicIntegerFieldUpdater.newUpdater(AtomicExample5.class,"count");

    @Getter
    public volatile int count = 100;


    public static void main(String[] args) {
        AtomicExample5 example5 = new AtomicExample5();
        if (updater.compareAndSet(example5,110,120)) {
            log.info("update success 1,{}",example5.getCount());
        }
        if (updater.compareAndSet(example5,100,120)) {
            log.info("update success 2,{}",example5.getCount());
        } else
            log.info("update fail,{}",example5.getCount());
    }
}
