package com.greatideas.demo.utils;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IterableUtils {
    public static <T> Stream<T> asStream(Iterable<T> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
