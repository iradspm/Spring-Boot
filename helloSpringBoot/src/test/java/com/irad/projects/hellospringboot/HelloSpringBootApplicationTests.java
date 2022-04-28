package com.irad.projects.hellospringboot;

import com.irad.projects.hellospringboot.controller.WebController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringBootApplicationTests {

    @Autowired
    private WebController controller; //test controller is not empty

    @Test
    void contextLoads() {
        Assertions.assertThat(controller).isNotNull(); //confirm controller class not empty
    }

}
