package it.first;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BTest {

    @Test
    @Tag("a")
    void b() {
        System.out.println("bbbbbbbbbb");
    }

    @Test
    @Tag("w")
    void w() {
        System.out.println("------------------");
    }
}
