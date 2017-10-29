package com.epam.javacore.homework.hw2.task_7;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SpecialCode {
    String code();
    String date() default " ";
}
