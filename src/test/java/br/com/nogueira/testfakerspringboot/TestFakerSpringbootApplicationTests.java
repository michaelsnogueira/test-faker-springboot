package br.com.nogueira.testfakerspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestFakerSpringbootApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    void testCreateUser() {
        var user = Factories.createUser();
        userService.create(user);
        var userFound = userService.findByUsername(user.username());
        assertEquals(userFound, user);
    }

}
