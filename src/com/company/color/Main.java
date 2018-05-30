package com.company.color;

public class Main {

    public static void main(String[] args) {
        //Interfaces
        //static members
        //Predicates


        //BEFORE
        RedColor[] redColors;
        GreenColor[] greenColors;

        //AFTER
        Color [] colors = {
                new RedColor(),
                new GreenColor(),
                new YellowColor(),
                new BlueColor()
                /*,new BlackColor()*/
        };

        for (Color o : colors) {
            o.printColor();
        }

//        RedColor redColor = new RedColor();
//        redColor.printColor();
//
//        GreenColor greenColor = new GreenColor();
//        greenColor.printColor();
//
//
//        Color color = new RedColor();
//        color.printColor();


    }
}

interface Color {
    void printColor();
}

class BlackColor {
    public void printColor() {
        System.out.println("I AM THE BLACKEST COLOR EVER!!!!");
    }
}
//класс Цвет хочет быть цветов
class RedColor implements Color {
    public void printColor() {
        System.out.println("I am RED");
    }
}

class GreenColor implements Color {
    public void printColor() {
        System.out.println("I am GREEN");
    }
}

class BlueColor implements Color {
    public void printColor() {
        System.out.println("I am BLUE");
    }

    public void printBlueColor() {
        System.out.println("I am BLUE");
    }
}

class YellowColor implements Color {
    public void printColor() {
        System.out.println("I am YELLOW");
    }
}