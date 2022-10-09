package AllTask.OOP;

public class Man extends Person{
    public Man(int age, String name, int bloodType, int password) { // наследование
        super(age, name, bloodType, password);
    }
    @Override
    public void go(){// полифоризм,наследование
        System.out.println(getName() + " является мужчиной и она умеет ходить");
    }
    public void beFather(){
        System.out.println(" Я могу быть папой ");
    }
}
