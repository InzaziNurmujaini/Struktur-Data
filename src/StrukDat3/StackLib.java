package StrukDat3;

import java.util.Stack;

public class StackLib {
    public static void main(String[] args) {
        Stack s = new Stack();

        System.out.println(s.empty());

        s.push("bebek");
        s.push("angsa");
        s.push("Kuda");
        s.push("Buaya");
        s.push("Tikus");

        System.out.println(s.empty());

        System.out.println("peek: " + s.peek());
        System.out.println("Animal: " + s);

        s.pop();
        s.pop();

        System.out.println("Animals: " + s);
        System.out.println("Position of Kuda: " + s.search("kuda"));

    }
    
}
