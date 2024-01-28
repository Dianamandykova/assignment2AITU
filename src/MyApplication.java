import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {    public static void main(String[] args) {
    Person.people = new ArrayList<>();
    Person.people.add(new Student("Ayazhan", "Kuandykova", 4.0));
    Person.people.add(new Employee("Askhat", "Sadykov", "Teacher", 500.000);
    Person.people.add(new Student("Damir", "Zhandosov", 1.67));
    Person.people.add(new Employee("Sanzhar", "Duisenov", "Engineer", 700.000));
    Collections.sort(Person.people);
    printData(Person.people);
}

    public static void printData(Iterable <Person> people) {
        for (Person p : people) {
            System.out.println(p.toString() + " earns " + p.getPaymentAmount() + " tenge");
        }
    }

}
}
