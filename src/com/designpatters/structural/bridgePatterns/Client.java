package com.designpatters.structural.bridgePatterns;

public class Client {
    public static void main(String[] args) {
        FifoCollections<Integer> collection = new Queue<>(new SinglyLinkedList<>());
        collection.offer(10);
        collection.offer(40);
        collection.offer(122);

        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        //
        System.out.println(collection.poll());
    }
}
