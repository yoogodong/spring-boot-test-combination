package it.second;


import it.BaseIT;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestComponent
public class BTest extends BaseIT {

    @Test
    @Tag("a")
    void b() {
        fail("b.b");
    }

    @Test
    @Tag("w")
    void w() {
        assertEquals("bw","bwww");
    }
}
