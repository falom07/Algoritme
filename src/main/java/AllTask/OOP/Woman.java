package AllTask.OOP;

public class Woman extends Person{
    public Woman(int age, String name, int bloodType, int password) { // наследование
        super(age, name, bloodType, password);
    }
    @Override
    public void go(){ // полифоризм,наследование
        System.out.println(getName() + " является женчиной и она умеет ходить");
    }
    public void beMother(){
        System.out.println(" Я могу быть матерью ");
    }
}
