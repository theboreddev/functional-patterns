package com.theboreddev.customers;

import java.util.Optional;

public class OldCustomer {
    private final String firstName;
    private final String surname;
    private final Integer age;
    private final String address;
    private final String phoneNumber;
    private final Sex sex;

    private OldCustomer(Builder builder) {
        this.firstName = builder.firstName;
        this.surname = builder.surname;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.sex = builder.sex;
    }

    public static Builder builderOf(String firstName, String surname) {
        return new Builder(firstName, surname);
    }

    static class Builder {
        private final String firstName;
        private final String surname;
        private Integer age;
        private String address;
        private String phoneNumber;
        private Sex sex;

        private Builder(String firstName, String surname) {
            this.firstName = firstName;
            this.surname = surname;
        }

        public Builder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withSex(Sex sex) {
            this.sex = sex;
            return this;
        }

        public OldCustomer build() {
            return new OldCustomer(this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }

    public Optional<String> getAddress() {
        return Optional.ofNullable(address);
    }

    public Optional<String> getPhoneNumber() {
        return Optional.ofNullable(phoneNumber);
    }

    public Optional<Sex> getSex() {
        return Optional.ofNullable(sex);
    }

    static enum Sex {
        FEMALE,
        MALE
    }
}
