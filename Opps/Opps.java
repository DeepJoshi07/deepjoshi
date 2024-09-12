package Opps;
public class Opps {

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setcolor("brown");
        h1.getcolor();
        System.out.println(h1.walk);
        System.out.println(h1.eat);
        h1.walk = "walks on two feet";
        System.out.println(h1.walk);
        BankAccount ba1 = new BankAccount("Deep Joshi");
        ba1.setpass(7990);
        System.out.println(ba1.getpass());

    }

}

class Human {
    String color;
    String walk;
    String eat;

    Human() {
        this.color = "has one";
        this.walk = "can walk";
        this.eat = "can eat";
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public void getcolor() {
        System.out.println(color);
    }
}

class BankAccount {
    String name;
    private int password;

    BankAccount(String name) {
        this.name = name;
    }

    int getpass() {
        return this.password;
    }

    void setpass(int password) {
        this.password = password;
    }
}