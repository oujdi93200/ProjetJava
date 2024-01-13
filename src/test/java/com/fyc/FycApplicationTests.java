package com.fyc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import javax.sql.DataSource;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class FycApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {
        assertNotNull(dataSource);
    }
}

