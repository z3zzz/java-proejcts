package com;

public class XapierConsumer {
    public static void main(String[] args) {
        XapierProvider xapier = new XapierProvider('a');
        xapier.provide();

        xapier.speed = 100;
        xapier.start();

        xapier.isAlphabet();
        xapier.isConsonent();
        xapier.isVowel();
        XapierProvider.printLowerCaseAlphabets();
        XapierProvider.printUpperCaseAlphabets();
    }
}