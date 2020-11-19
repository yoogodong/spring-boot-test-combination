package it.second;


import it.BaseIT;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@TestComponent
public class ATest extends BaseIT {

    @Autowired
    A a ;

    @MockBean
    B b;


    @Test
    @Tag("a")
    void a() {
        when(b.say()).thenReturn("wwwww");
        assertEquals("w",a.callB());
    }

    @Test
    @Tag("w")
    void w() {
        assertEquals("aw","aww");
    }
}
