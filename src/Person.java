import java.util.*;
public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // создайте toString

    @Override
    public String toString() {
        return "Имя: " + name +
                ", фамилия: " + surname +
                ", возраст: " + age;
    }


    @Override
    public int compareTo(Person p){
        Set<String> p1_set=new HashSet<>(List.of(p.surname.split("\\P{IsAlphabetic}+")));
        Set<String> p2_set=new HashSet<>(List.of(surname.split("\\P{IsAlphabetic}+")));
        if (p1_set.size()<p2_set.size()) return -1;
        else if ((p1_set.size()==p2_set.size())&&(p.age<age)) return -1;
        return 1;
    }
}