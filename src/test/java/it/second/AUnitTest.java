package it.second;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;


/**
 * 验证下 spy
 *
 */
class AUnitTest {



    @Spy
    @InjectMocks
    A a;

    @Mock
    B b;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void name() {
        doReturn("").when(a).self();
        when(a.self()).thenReturn("www");

        assertEquals(a.callSelf(),"www");

        when(b.say()).thenReturn("say");
        assertEquals(a.callB(),"say");
    }
}