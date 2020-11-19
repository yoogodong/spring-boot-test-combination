package it.first;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ATest {

    @Test
    @Tag("a")
    void a() {
        System.out.println("aaaaaaa");
    }

    @Test
    @Tag("w")
    void w() {
        System.out.println("------------------");
    }
}
