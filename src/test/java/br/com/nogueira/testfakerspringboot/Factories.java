package br.com.nogueira.testfakerspringboot;

import com.github.javafaker.Faker;

public class Factories {
    private static Faker faker = new Faker();

    public static User createUser() {
        return new User(
                faker.name().username(),
                faker.internet().password(),
                faker.internet().emailAddress(),
                faker.name().firstName()
        );
    }
}
