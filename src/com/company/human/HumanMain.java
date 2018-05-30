package com.company.human;

public class HumanMain {

    public static void main(String[] args) {
        Person[] people = {
                new Evgeny(),
                new Sarah(),
                new Pavel()
        };

        for (Person human : people) {
            System.out.println(human.getName() + " thinks about drinking coffee");
            human.drinkCoffee();
            System.out.println();
        }

        /*Person p = new Evgeny();
        Person p2 = new Person();*/
    }
}

interface HomoSapiens {
}

interface Person extends HomoSapiens {
    void drinkCoffee();
    String getName();
}


//------------BORDER CONTROL----------------------



class Evgeny implements Person {
    @Override
    public void drinkCoffee() {
        System.out.println("I hate coffee!!");
    }

    @Override
    public String getName() {
        return "The !Jeka!";
    }
}
class Sarah implements Person {
    @Override
    public void drinkCoffee() {
        System.out.println("I like coffee and drink it every morning");
    }

    @Override
    public String getName() {
        return "Sarah";
    }

    public void method_1(){}
    public void method_2(){}
    public void method_3(){}
    public void method_4(){}
}
class Pavel implements Person {
    @Override
    public void drinkCoffee() {
        System.out.println("My name is Pavel and I don't care about coffee");
    }

    @Override
    public String getName() {
        return "Pavel";
    }


}