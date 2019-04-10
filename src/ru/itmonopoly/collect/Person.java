package ru.itmonopoly.collect;

public class Person{
    String name;
    String lastName;
    int age;
    String city;

    public String getCity() { return this.city; }
    public String getName() { return this.name; }
    public int getAge() { return this.age; }

    @Override
    public boolean equals(Object o){
        if (o==null || o.getClass() != this.getClass()) {
            return false;
        }
        Person p = (Person)o;
        if (p.name.equals(this.name) && p.lastName.equals(this.lastName) && p.city.equals(this.city) && p.age == this.age){
            return true;
        }
        else {
            return false;
        }
    }

    public int hashCode(){
return name.hashCode() + lastName.hashCode() + city.hashCode() + age;
    }

    @Override
    public String toString() {
        String s = name + " " + lastName + ", " + age + ", " + city;
        return s;
    }
}
