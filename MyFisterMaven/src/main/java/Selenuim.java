

public class Selenuim {
    public WebDriver getWebdriver(){
        System.setProperty("webdriver.chrome.driver","D:/tool/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        return webDriver;
    }
}

