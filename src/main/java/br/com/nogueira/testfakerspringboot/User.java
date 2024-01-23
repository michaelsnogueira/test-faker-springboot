package br.com.nogueira.testfakerspringboot;

public record User(
        String username,
        String password,
        String email,
        String firstName
) {
}
