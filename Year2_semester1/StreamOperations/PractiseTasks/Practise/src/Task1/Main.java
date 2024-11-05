package Task1;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

class Main {

    public static void main(String[] args) {
        //create list of persons older than 21
        List<Person> list1 = getPersons().stream()
                .filter(p -> p.age() > 21)
                .toList();
        System.out.println("list1: " + list1);

        //create list of males older than 21
        List<Person> list2 = getPersons().stream()
                .filter(p -> p.age() > 21 && p.gender() == Person.Gender.MALE)
                .toList();
        System.out.println("list2: " + list2);

        //if there is a person that older 24
        boolean flag1 = getPersons().stream().anyMatch(p -> p.age() > 24);
        System.out.println("flag1: " + flag1);

        //if all persons are older 20
        boolean flag2 = getPersons().stream().allMatch(p -> p.age() > 20);
        System.out.println("flag2: " + flag2);

        //find any person that older 20 or else new Person("not_born;0;MALE")
        Optional<Person> opt1 = getPersons().stream()
                .filter(p -> p.age() > 20)
                .findAny()
                .or(() -> Optional.of(new Person("not_born;0;MALE")));
        System.out.println("opt1: " + opt1);

        //find the name of first female that older 20
        String s1 = getPersons().stream()
                .filter(p -> p.age() > 20 && p.gender() == Person.Gender.FEMALE)
                .map(Person::name)
                .findFirst()
                .orElse("");
        System.out.println("s1: " + s1);

        //create list of names of persons that older 21
        List<String> list3 = getPersons().stream()
                .filter(p -> p.age() > 21)
                .map(Person::name)
                .toList();
        System.out.println("list3: " + list3);

        //count number of females
        int num1 = (int) getPersons().stream()
                .filter(p -> p.gender() == Person.Gender.FEMALE)
                .count();
        System.out.println("num1: " + num1);

        //calculate average age of males
        double avg1 = getPersons().stream()
                .filter(p -> p.gender() == Person.Gender.MALE)
                .mapToInt(Person::age)
                .average()
                .orElse(0);
        System.out.println("avg1: " + avg1);

        //create set of ages of persons
        Set<Integer> set1 = getPersons().stream()
                .map(Person::age)
                .collect(Collectors.toSet());
        System.out.println("set1: " + set1);

        //create list of persons older than 20 ascending by name
        List<Person> list4 = getPersons().stream()
                .filter(p -> p.age() > 20)
                .sorted(Comparator.comparing(Person::name))
                .toList();
        System.out.println("list4: " + list4);

        //create list of unique ages of persons older than 20 sorted in descending order
        List<Integer> list5 = getPersons().stream()
                .filter(p -> p.age() > 20)
                .map(Person::age)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("list5: " + list5);
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
