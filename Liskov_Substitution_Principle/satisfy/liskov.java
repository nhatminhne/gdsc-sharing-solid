package Liskov_Substitution_Principle.satisfy;


//ta sửa lại bằng cách không cho class Rubber kế thừa từ class Duck 
//và đưa method quack() của class Duck vào interface QuackableInterface 
//để class RubberDuck có thể implements interface này và overide lại method quack() cho phù hợp

class Duck {
    //some attribute
    public boolean CanQuack(Duck duck) {
        System.out.println("quackkkkkkkk");
        return true;
    }
}

class Person {
    public boolean SqueezeDuck(RubberDuck duck) {
        return false;
        //return true;
    }
}

class RubberDuck implements QuackableInterface {
	public boolean CanQuack() { 
		Person person = new Person();
		if (person.SqueezeDuck(this)) {
			System.out.println("quackkkkkkkk");
            return true;
		}
		System.out.println("can't quackkkkkkkkkk");
        return false;
    }
}

interface QuackableInterface {
	public boolean CanQuack();
}

public class liskov {
    public static void main(String[] args) {
        new RubberDuck().CanQuack();
    }
}