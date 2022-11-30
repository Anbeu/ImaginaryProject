public class Person {

    String name;
    int age;

    Person(){

    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return name+ " " + age;
    }


    public void talk(){
        System.out.println("Person talks");
    }
}
