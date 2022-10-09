package AllTask.OOP;

public class Child extends Person{
    public Child(int age, String name, int bloodType, int password) {
        super(age, name, bloodType, password);
    }
    @Override
    public void go(){ // полифоризм,наследование
        System.out.println(getName() + " является ребенком и оно не умеет ходить ");
    }
    public void goToSchool(){
        System.out.println(" Я могу пойти в школу и не платить за обучение ");
    }
}
