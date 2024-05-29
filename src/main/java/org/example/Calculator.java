package org.example;

public class Calculator {
    public int increment(int a){

        return ++a;
    }
    public int Sum(int a, int b){

        return b+a;
    }
    public int Subtract(int a, int b){
        return a-b;
    }
    public int Mutliply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        if(b != 0)
            return a/b;
        return 0;
    }

}
