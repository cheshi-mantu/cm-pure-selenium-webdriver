package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchTest {
    @Test
    @Tag("pure_selenium")
    void googleSearchTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

    }


}
