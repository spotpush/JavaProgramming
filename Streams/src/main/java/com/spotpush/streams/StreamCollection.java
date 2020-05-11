package com.spotpush.streams;

import java.util.stream.Stream;

/**
* Streams can be obtained in a number of ways
* This class demonstrates how a stream is constructed from a collection
* @author Stephen Hardy @ spotpush.com
*/

interface Collection<E> {
    default Stream<E> stream();
    default Stream<E> parallelStream();        
}


public class StreamCollection {

    public static void main(String[] args) {
    
    }
}
