package org.example;

public class Sem3 {
        public static void main(String[] args) {

            String s1 = "hello";
            String s2 = "hello";
            String s3 = s1;
            String s4 = "h" + "e" + "l" + "l" + "o";
            String s5 = new String("hello");
            String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

            if (s1.equals(s2))System.out.println("Элементы равны"); else System.out.println("Элементы неравны");
            if (s1 == s2)System.out.println("Элементы равны"); else System.out.println("Элементы неравны");

            if (s3.equals(s4))System.out.println("Элементы равны"); else System.out.println("Элементы неравны");
            if (s3 == s4)System.out.println("Элементы равны"); else System.out.println("Элементы неравны");

            if (s5.equals(s6))System.out.println("Элементы равны"); else System.out.println("Элементы неравны");
            if (s5 == s6)System.out.println("Элементы равны"); else System.out.println("Элементы неравны");
        }
    }

