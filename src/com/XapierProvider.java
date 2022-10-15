package com;

public class XapierProvider {
    int speed = 10;
    private char hello;
    private int gasoline;

    XapierProvider(char ch) {
        this.hello = ch;
    }

    boolean isVowel() {
        if (hello == 'a' || hello == 'e' || hello == 'i' || hello == 'o' || hello == 'u') {
            return true;
        }
        return false;
    }

    public boolean isDigit() {
        // between '0' and '9'
        if (hello >= 48 && hello <= 57) {
            return true;
        }
        return false;
    }

    public boolean isAlphabet() {
        if (hello >= 97 && hello <= 122) {
            return true;
        }
        if (hello >= 65 && hello <= 90) {
            return true;
        }
        return false;
    }

    public boolean isConsonent() {
        if (isAlphabet() && !isVowel()) {
            return true;
        }
        return false;
    }

    public static void printLowerCaseAlphabets() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    }

    public static void printUpperCaseAlphabets() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }

    void provide() {
        System.out.println("Provided Xapier");
    }

    void start(){
        System.out.printf("%d speed is going for start", speed).println();
        System.out.println(hello);
        gasoline -= 10;
        System.out.printf("%d gasoline left", this.gasoline).println();
    }
}