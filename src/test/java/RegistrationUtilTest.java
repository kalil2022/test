import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationUtilTest {
    RegistrationUtil registration;
    @BeforeEach
    void setUp() {
        registration=new RegistrationUtil();
    }

    @Test
    void test_if_username_is_filled_and_password_match(){
        boolean actual=registration.validateUserInput("fcd","a","a");
        assertTrue(actual);
    }
    @Test
    void test_if_username_is_empty_and_password__match(){
        boolean actual= registration.validateUserInput("","a","a");
        assertFalse(actual);
    }
    @Test
    void test_if_username_is_filled_and_password__not_match(){
        boolean actual=registration.validateUserInput("s","a","v");
        assertFalse(actual);
    }

    @Test
    void test_if_username_is_empty_and_password_not_match(){
       boolean actual=registration.validateUserInput("","a","b");
        assertFalse(actual);

    }
    @Test
    void test_if_username_is_filled_and_password_filled_and_confirmEmpty(){
       boolean actual= registration.validateUserInput("a","x","");
        assertFalse(actual);
    }
    @Test
    void test_if_username_is_filled_and_password_empty_and_confirmFilled(){
        assertFalse( registration.validateUserInput("a","","x"));
    }
    @Test
    void test_if_username_is_empty_and_password_empty_and_confirmEmpty(){
        assertFalse( registration.validateUserInput("","",""));

    }
    @Test
    void test_if_username_is_filled_and_password_empty_and_confirmEmpty(){
        assertFalse( registration.validateUserInput("a","",""));

    }


}