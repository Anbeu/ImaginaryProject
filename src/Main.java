import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> personArray = new ArrayList<Person>();

        Person p = new Person("Lars", 18);
        Person p1 = new Person("Egon", 18);
        Person p2 = new Person("Mads", 18);
        Person p3 = new Person("Gordon", 18);
        Person p4 = new Person("Thomas", 18);
        Person p5 = new Person("Helle", 18);
        Person p6 = new Person("Caroline", 18);

        personArray.add(p);
        personArray.add(p1);
        personArray.add(p2);
        personArray.add(p3);
        personArray.add(p4);
        personArray.add(p5);
        personArray.add(p6);


        for(Person e: personArray){
            System.out.println(e);
        }


    }
}
