package AllTask.OOP;

public class Person {
    private int age;
    private final String name;
    private final int bloodType;
    private final int password;

    public Person(int age, String name,int bloodType,int password) {
        this.age = age;
        this.name = name;
        this.bloodType =bloodType;
        this.password = password;
    }
    public void live(){
        System.out.println("Я жыву");
    }
    public void go(){
        System.out.println(name + " является человеком и она умеет ходить");
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public int  getBloodType(int password){
        if(this.password == password){
            return bloodType;
        }
        return 0;
    }

    public void setAge(int age,int password) {
        if(password == this.password) {
            this.age = age;
        }else{
            System.out.println("У вас нету прав доступпа ");
        }
    }


}
