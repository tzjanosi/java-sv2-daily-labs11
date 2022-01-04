package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {
    String EMAIL="valaki@gmail.com";
    String PASS="Valaki12345";
    @Test
    void testGet() {
        NormalUser normalUser=new NormalUser(EMAIL,PASS);
        assertEquals(EMAIL, normalUser.getUserEmail());
        assertEquals(PASS, normalUser.getPassword());
    }
}