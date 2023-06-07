package com.designpatters.structural.bridgePatterns;

// This is the Abstraction
// It represents a First in First Out collection
public interface FifoCollections<T> {


    // Add elements to Collection
    void offer(T element);

    // Removes and return first elements from the collection
    T poll();
}
