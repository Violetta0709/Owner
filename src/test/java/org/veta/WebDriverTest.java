package org.veta;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.veta.config.WebDriverProvider;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {
    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        //подготовка драйвера
        driver = new WebDriverProvider().get();
    }

    @Test
    public void testGithub() {
        //тело выполнения теста
        String title = driver.getTitle();
        assertEquals("GitHub: Let’s build from here · GitHub", title);
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}
