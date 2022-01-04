package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {
    String EMAIL="valaki@gmail.com";
    String PASS="Valaki12345";
    String STARS="***********";
    @Test
    void testGet() {
        AdminUser adminUser=new AdminUser(EMAIL,PASS);
        assertEquals(EMAIL, adminUser.getUserEmail());
        assertEquals(STARS, adminUser.getPassword());
    }

}