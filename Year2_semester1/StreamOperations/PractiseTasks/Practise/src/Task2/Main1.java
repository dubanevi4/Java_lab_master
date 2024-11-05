package Task2;

import java.util.*;
import java.util.stream.*;

record Person(String name, int age, Gender gender) {

    enum Gender {
        MALE, FEMALE
    }

    public Person(Person person) {
        this(person.name, person.age, person.gender);
    }

    private static Person parse(String csv) {
        String[] args = csv.split(";");
        return new Person(args[0], Integer.parseInt(args[1]), Gender.valueOf(args[2]));
    }

    public Person(String csv) {
        this(parse(csv));
    }

    @Override
    public String toString() {
        return name + ";" + gender + ";" + age;
    }

}


class Main1 {

    public static void main(String[] args) {
        //separate persons by the gender
        Map<Person.Gender, List<Person>> partition = getPersons().stream()
                .collect(Collectors.groupingBy(Person::gender));
        System.out.println(partition);


        //group persons by age
        Map<Integer, List<Person>> groups = getPersons().stream()
                .collect(Collectors.groupingBy(Person::age));
        System.out.println(groups);

        //create the map, where key is the name, and value is the age.
        Map<String, Integer> map = getPersons().stream()
                .collect(Collectors.toMap(Person::name, Person::age));
        System.out.println("Map of names to ages: " + map);
        System.out.println(map);

        //create the string from names of males
        String str = getPersons().stream()
                .filter(p -> p.gender() == Person.Gender.MALE)
                .map(Person::name)
                .collect(Collectors.joining(", "));
        System.out.println(str);


    }

    private static List<Person> getPersons() {
        return List.of(
                new Person("cool;24;MALE")
                , new Person("middle;19;FEMALE")
                , new Person("smart;21;FEMALE")
                , new Person("fast;19;FEMALE")
                , new Person("senior;24;MALE")
                , new Person("junior;25;MALE")
                , new Person("funny;19;FEMALE")
                , new Person("clever;21;MALE"));
    }

}

