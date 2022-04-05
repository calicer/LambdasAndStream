package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {

    public static void main(String[] args) {

        List<Person> li = new ArrayList<>();

        Person p = new Person("Vishal", "Bhalla", 25);
        Person p1 = new Person("Aman", "Kohli", 22);
        Person p2 = new Person("Saksham", "Dhiman", 21);
        Person p3 = new Person("Saurav", "Ranot", 20);

        li.add(p);
        li.add(p1);
        li.add(p2);
        li.add(p3);


        /*
        Collections.sort(li,
                new Comparator<Person>() {
                    @Override
                    public int compare(Person person, Person t1) {
                        return person.getName().compareTo(t1.getName());
                    }
                });

         */

        Collections.sort(li, (p5,p6)-> p5.getLastName().compareTo(p6.getLastName()));

        print(li);


    }

    public static void print(List<Person> li){
        for (Person p : li){
            System.out.println(p.getName());
        }
    }
}
