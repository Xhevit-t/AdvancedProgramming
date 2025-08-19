package aud1;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person() {

    }

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

    @Override
    public String toString() {
        return "aud1.Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Ana","T",100);



        System.out.println(person2);
    }

}
