package com.day21.Test10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
public @interface MyAnno3 {
    String type();
    int[] intarr();
}
