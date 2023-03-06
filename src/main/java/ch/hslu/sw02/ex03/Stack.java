package ch.hslu.sw02.ex03;

import java.util.ArrayList;

public class Stack<T> {

    ArrayList<T> A;
    int top = -1;
    int size;

    Stack(int size)
    {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }

    void push(T X)
    {
        if (top + 1 == size) {
            System.out.println("Stack Overflow");
        }
        else {
            top = top + 1;
            if (A.size() > top)
                A.set(top, X);
            else
                A.add(X);
        }
    }

    T top()
    {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        }
        else
            return A.get(top);
    }

    void pop()
    {
        if (top == -1) {
            System.out.println("Stack Underflow");
        }
        else
            top--;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public String toString()
    {
        String result = "";
        for (int i = 0; i < top; i++) {
            result += A.get(i) + "->";
        }
        result += String.valueOf(A.get(top));
        return result;
    }
}