package com.example.democosmosdb.pattern.builder;

public class Contractor {
    private String name;
    private String lastName;
    private String email;
    private Integer ega;
    private String gender;

    public Contractor(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.ega = builder.ega;
        this.gender = builder.gender;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", ega=" + ega +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static class Builder {

        private String name;
        private String lastName;
        private String email;
        private Integer ega;
        private String gender;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder ega(Integer ega) {
            this.ega = ega;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Contractor build() {
            return new Contractor(this);
        }

    }
}
