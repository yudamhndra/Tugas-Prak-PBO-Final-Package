package Person;

import java.time.Period;

public class MainPerson {
    public static void main(String[] args){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        System.out.println("(" + person4.localCount + "," + Person.instanceCount + ")");
    }
}
