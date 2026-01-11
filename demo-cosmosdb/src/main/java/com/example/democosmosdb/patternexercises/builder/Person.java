package com.example.democosmosdb.patternexercises.builder;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private String email;

    public Person(String name, String lastName, int age, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public static class Builder {
        private String name;
        private String lastName;
        private int age;
        private String email;

        public Builder name(String name ) {
            this.name = name;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName =  lastName;
            return this;
        }
        public Builder lastName(int age) {
            this.age =  age;
            return this;
        }
        public Builder email(String email) {
            this.email =  email;
            return this;
        }

        public Person build() {
            return new Person(this.name,this.lastName, this.age, this.email);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
