package com.stream_api_programs.stream_api_initialization;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamInitialization {
    public static void main(String[] args) {

        // 1. from collection objects
        List<String> stringList = List.of("one","two","three");

        // 2. array of values
        String[] names = {"one","two","three"};
        Stream<String> stringStream = Arrays.stream(names);

        // stream methods
        Stream<String> stream = Stream.of("one","two","three");

        // generate using supplier
        System.out.println(Stream.generate(() -> "one"));

        // builder , builder design pattern
        Stream.Builder<String> builder = Stream.builder();
        Stream<Objects> stream1 = (Stream<Objects>) Stream.builder().add("one").add("two").add("three");



        // STREAM OPERATIONS
            // 1. INTERMEDIATE
            // 2. TERMINAL



    }
}
