package com.company.operation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Operation [] operations = new Operation[3];
        operations[0] = new AdditionOperation("abcdefg");
        operations[1] = new SubtractOperation(0d);
        operations[2] = new DivisionOperation(null);

        for (Operation operation : operations) {

            calculate(10, 5, operation);
        }
    }

    static void calculate(int a, int b, Operation operation) {
        System.out.println(operation.getResult(a , b));
    }

    static void calculate(List list) {}
}
//Concrete class
class AdditionOperation implements Operation {
    private String s;

    public AdditionOperation(String s) {
        this.s = s;
    }

    public int getResult(int a, int b) { return a + b + s.length(); }
}
class SubtractOperation implements Operation {
    public SubtractOperation(Double d) {
    }

    public int getResult(int a, int b) { return a - b; }
}
class DivisionOperation implements Operation {
    public DivisionOperation(Operation e) {
    }

    public int getResult(int a, int b) { return a / b; }
}