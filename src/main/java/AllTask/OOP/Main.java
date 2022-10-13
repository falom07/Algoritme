package AllTask.OOP;

public class Main {
    public static void main(String[] args) {
        Person man = new Man(37,"Vita",2,123);
        Person woman = (Person) new  Woman(27,"Nasta",1,123);
        Child child = new Child(3,"Kiril",3,123);


        man.live();// не преопредилениые метода класса родителя
        woman.live();// не преопредилениые метода класса родителя
        child.live();// не преопредилениые метода класса родителя

        System.out.println("\n");

        System.out.println("группа крови " + man.getBloodType(123));
        System.out.println("возраст " + child.getAge());
        System.out.println("имя " + woman.getName());

        System.out.println("\n");

        man.go();//полифорирзм
        woman.go();//полифорирзм
        child.go();//полифорирзм

        System.out.println("\n");


      // man.beFather();//добавление особых методов для разных классов
      // woman.beMother();//добавление особых методов для разных классов
        child.goToSchool();//добавление особых методов для разных классов


    }
}
