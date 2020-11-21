package it.second;


import it.App;
import it.BaseIT;
import it.SuiteConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;


@SpringBootTest(classes = {SuiteConfig.class, App.class})
public class SuiteTest extends BaseIT {
    @Autowired
    ATest aTest;
    @Autowired
    BTest bTest;

    @Test
    void combine() {
//        编排方法，这种第一个出错就退出，不能明确知道问题的原因
//        aTest.a();
//        bTest.b();
//        bTest.w();

//        建议使用 junit5 的方式：
        assertAll(
                () -> aTest.a(),
                () -> bTest.b(),
                () -> bTest.w()
        );
    }
}
