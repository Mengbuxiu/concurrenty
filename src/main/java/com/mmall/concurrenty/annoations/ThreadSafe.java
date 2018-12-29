package com.mmall.concurrenty.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用来标记【线程安全】的类
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE) //SOURCE 编译器会丢弃（忽略）它，即这个注解只是给人看的
public @interface ThreadSafe {
    String value() default "";
}
