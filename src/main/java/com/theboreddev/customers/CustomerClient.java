package com.theboreddev.customers;

public class CustomerClient {

    public static void main(String[] args) {

        final Customer newCustomer = new Customer.Builder("John", "Smith")
                .with(builder -> {
                    builder.age = 33;
                    builder.address = "13, Some Street. AB XYZ";
                    builder.phoneNumber = "0123456789";
                    builder.sex = Customer.Sex.MALE;
                })
                .build();

        System.out.println(newCustomer);
    }
}
